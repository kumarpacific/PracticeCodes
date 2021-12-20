import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DevideListToNList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< 1; i++){
            list.add(i);
        }
        final int G = (list.size())/5;
        final int NG = (list.size() + G - 1) / G;

        List<List<Integer>> result = IntStream.range(0, NG)
                .mapToObj(i -> list.subList(G * i, Math.min(G * i + G, list.size())))
                .collect(Collectors.toList());

        System.out.print("   " + result);
    }

}
