import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


class Article {
    String title;
    String story_title;
    String author;
}

class JSONResponse {
    int page;
    int per_page;
    int total;
    int total_pages;
    List<Article> data;
}

class Result {

    /*
     * Complete the 'getArticleTitles' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING author as parameter.
     *
     * URL for cut and paste:
     * https://jsonmock.hackerrank.com/api/articles?author=<authorName>&page=<num>
     *
     */

    public static List<String> getArticleTitles(String author) {
        List<String> titles = new ArrayList<>();
        int pageNumber = 1;
        int total_pages = 1;

        while (pageNumber <= total_pages) {
            try {
                URL url = new URL("https://jsonmock.hackerrank.com/api/articles?author=" + author + "&pageNumber=" + pageNumber);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("GET");

                String response = null;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while ((response = bufferedReader.readLine()) != null) {
                    Gson gson = new Gson();
                    JSONResponse json = gson.fromJson(response, JSONResponse.class);
                    total_pages = json.total_pages;
                    List<Article> data = json.data;
                    for (Article title : data) {
                        if (null != title && null != title.title) {
                            titles.add(title.title);
                        } else if (null != title && null != title.story_title) {
                            titles.add(title.story_title);
                        }
                    }
                }
                bufferedReader.close();
                pageNumber++;

            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return titles;
    }
}

public class HttpAPICallTest {
    public static void main(String[] args) throws IOException {

        List<String> result = Result.getArticleTitles("epaga");
        System.out.println(result);
    }
}
