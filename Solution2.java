//import java.io.*;
//import java.util.*;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//class Result {
//
//    /*
//     * Complete the 'getItems' function below.
//     *
//     * The function is expected to return a STRING_ARRAY.
//     * The function accepts 2D_STRING_ARRAY entries as parameter.
//     */
//
//    public static List<String> getItems(List<List<String>> entries) {
//        // Write your code here
//        int viewTimes = 0;
//        Stack<List<String>> itemViewed = new Stack();
//        Queue<List<String>> minQue = new PriorityQueue<>();
//
//        List<String> currMinItem = new ArrayList<>();
//        entries.sort((e1,e2)-> Integer.valueOf(e1.get(2)) - Integer.valueOf(e2.get(2)));
//        for (List<String> entry : entries) {
//            switch (entry.get(0)) {
//                case "INSERT": {
//                    minQue.add(entry);
//                    break;
//                }
//                case "VIEW":
//                    viewTimes++;
//                    if(minQue.size()>0){
//                        currMinItem = minQue.poll();
//                        itemViewed.push(currMinItem);
//                    }
////                    if(viewTimes <)
//
//                    break;
//            }
//        }
//        return currMinItem;
//    }
//
//}
//
//public class Solution2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int entriesRows = Integer.parseInt(bufferedReader.readLine().trim());
//        int entriesColumns = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<List<String>> entries = new ArrayList<>();
//
//        IntStream.range(0, entriesRows).forEach(i -> {
//            try {
//                entries.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        List<String> result = Result.getItems(entries);
//
//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
