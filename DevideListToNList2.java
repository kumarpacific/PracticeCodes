import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DevideListToNList2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int n = 5;


        List<List<Integer>> partitions = IntStream.range(0, list.size())
                .filter(i -> i % n == 0)
                .mapToObj(i -> list.subList(i, Math.min(i + n, list.size())))
                .collect(Collectors.toList());

        System.out.print(partitions);
    }

}
