import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;

public class ListMultiMapTest {
    public static void main(String[] args) {
        ListMultimap<String, String> map = MultimapBuilder.treeKeys().arrayListValues().build();

        map.put("Hello well", "World");
        map.put("All well", "World");
        map.put("All well", "Asorld2");
        map.put("All well", "Ghorld2");
        map.put("All well", "Lioorld2");
        map.put("GH Hello well", "World");
        map.put("BN Hello well", "BWorld");
        map.put("y Hello well", "World");
        map.put("P Hello well", "World");

        System.out.println(map);
    }
}
