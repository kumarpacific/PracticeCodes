import java.util.HashMap;
import java.util.Map;

public class FindParents {
    public static void main(String[] args) {

        Category cat1 = new Category("1", "First", "null");

        Category cat2 = new Category("2", "Second", "1");

        Category cat3 = new Category("3", "Third", "1");

        Category cat4 = new Category("4", "Fourth", "2");

        Category cat5 = new Category("5", "Fifth", "4");

        Map<String, Category> categoryMap = new HashMap<>();
        categoryMap.put("1", cat1);
        categoryMap.put("2", cat2);
        categoryMap.put("3", cat3);
        categoryMap.put("4", cat4);
        categoryMap.put("5", cat5);

        for (Map.Entry<String, Category> entry : categoryMap.entrySet()) {
            String breads = getBreadcrumbs(categoryMap, entry.getKey());
            String breadcrumb = breads.substring(0, breads.length() - 3);
            entry.getValue().setBreadcrumbs(breadcrumb);
        }

        categoryMap.forEach((key, value) -> System.out.println(key + ":" + value));
    }

    private static String getBreadcrumbs(Map<String, Category> list, String catId) {
        if (list.get(catId).getParentId() == "null") {
            return list.get(catId).getName() + " > ";
        }
        String breadcrumb = list.get(catId).getName() + " > ";

        return getBreadcrumbs(list, list.get(catId).getParentId()) + breadcrumb;
    }
}


//    public static Integer gethight(Tree parentId){
//        if(parentId == null){
//            return 0;
//        }
//
//        Integer left = gethight(node.getLeft());
//        Integer right = gethight(node.getRight());
//
//        return 1 + Math.max(left, right);
//    }


class Category {
    String id;
    String name;
    String parentId;
    String breadcrumbs;

    Category(String id, String name, String parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getParentId() {
        return parentId;
    }

    public String getBreadcrumbs() {
        return breadcrumbs;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setBreadcrumbs(String breadcrumbs) {
        this.breadcrumbs = breadcrumbs;
    }


}