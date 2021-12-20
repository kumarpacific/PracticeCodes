import com.google.common.collect.ArrayListMultimap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivideSubCatList {
    public static void main(String[] args) {

        ArrayListMultimap<String, Category2> categoriesTaxonomy = ArrayListMultimap.create();

        Category2 cat1 = new Category2(1, "CategoryName1");
        Category2 cat2 = new Category2(2, "CategoryName2");
        Category2 cat3 = new Category2(3, "CategoryName3");
        Category2 cat4 = new Category2(4, "CategoryName4");
        Category2 cat5 = new Category2(5, "CategoryName5");
        Category2 cat6 = new Category2(6, "CategoryName6");
        Category2 cat7 = new Category2(7, "CategoryName7");
        Category2 cat8 = new Category2(8, "CategoryName8");
        Category2 cat9 = new Category2(9, "CategoryName9");
        Category2 cat10 = new Category2(10, "CategoryName10");

        categoriesTaxonomy.put("Cat", cat1);
        categoriesTaxonomy.put("Cat", cat2);
        categoriesTaxonomy.put("Cat", cat3);
        categoriesTaxonomy.put("Cat", cat4);
        categoriesTaxonomy.put("Cat", cat5);
        categoriesTaxonomy.put("Cat", cat6);
        categoriesTaxonomy.put("Cat", cat7);
        categoriesTaxonomy.put("Cat", cat8);
        categoriesTaxonomy.put("Cat", cat9);
        categoriesTaxonomy.put("Cat1", cat10);

        ArrayListMultimap<String, List<Category2>> finalList = ArrayListMultimap.create();

        getSubList(categoriesTaxonomy, finalList);

        System.out.println(finalList);
    }

    public static void getSubList(ArrayListMultimap<String, Category2> list, ArrayListMultimap<String, List<Category2>> finalList) {

        for (String key : list.keySet()){
            List<Category2> catList = list.get(key);

            int count = 5;
            final int catPerList = 5;
            List<Category2> tempList = new ArrayList<>();
            int size = catList.size();

            for (int i = 0; i < size; i++) {
                if (count == 0) {
                    finalList.put(key, tempList);
                    count = catPerList;
                    tempList = new ArrayList<>();
                }
                if (i == size - 1) {
                    finalList.put(key, tempList);
                }

                tempList.add(catList.get(i));
                --count;

            }
//            int divideFactor = list.size() > 9 ? list.size() > 18 ? list.size() > 27 ? 4 : 3  : 2  : 1;
//
//            final int G = (list.size()) / divideFactor;
//            final int NG = (list.size() + G - 1) / G;
//
//        List<List<Category2>> result = IntStream.range(0, NG)
//                .mapToObj(i -> catList.subList(G * i, Math.min(G * i + G, list.size())))
//                .collect(Collectors.toList());

        }

    }



}

class Category2{
    Integer id;
    String name;

    public Category2(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
