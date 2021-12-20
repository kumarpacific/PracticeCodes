//import java.io.*;
//
//
//class Result {
//
//    /*
//     * Complete the 'numberOfWays' function below.
//     *
//     * The function is expected to return a LONG_INTEGER.
//     * The function accepts STRING book as parameter.
//     */
//
//    public static long numberOfWays(String book) {
//        // Write your code here
//    int[] bookArray = convertToIntArray(book);
//        return 0l;
//    }
//
//    private int[] convertToIntArray(String book) {
//        String[] bookArray = book.split("");
//        int[] bookIndexArray = new int[bookArray.length];
//        for (int i = 0; i < bookArray.length; i++) {
//            bookIndexArray[i] = Integer.parseInt(bookArray[i]);
//        }
//        return bookIndexArray;
//    }
//
//}
//
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String book = bufferedReader.readLine();
//
//        long result = Result.numberOfWays(book);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
