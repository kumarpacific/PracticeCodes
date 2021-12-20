import java.util.ArrayList;
import java.util.List;

public class DivideCatListIgnoringSubCat {
    public static void main(String[] args) {

        Category1 cat1 = new Category1(1, null);
        Category1 cat2 = new Category1(2, null);
        Category1 cat3 = new Category1(3, 2);
        Category1 cat4 = new Category1(4, null);
        Category1 cat5 = new Category1(5, null);
        Category1 cat6 = new Category1(6, 5);
        Category1 cat7 = new Category1(7, null);
        Category1 cat8 = new Category1(8, null);
        Category1 cat9 = new Category1(9, 7);
        Category1 cat10 = new Category1(10, null);

        ArrayList<Category1> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);
        list.add(cat4);
        list.add(cat5);
        list.add(cat6);
        list.add(cat7);
        list.add(cat8);
        list.add(cat9);
        list.add(cat10);

        List<List<Category1>> finalList = new ArrayList<>();

        getList(list, finalList);

        finalList.forEach(System.out::println);
    }

    public static void getList(List<Category1> list, List<List<Category1>> finalList) {
        int count = 5;
        ArrayList<Category1> tempList = new ArrayList<>();
        int size = list.size();

        for (int i = 0; i < size; i++) {
            if (count == 0) {
                finalList.add(tempList);
                count = 5;
                tempList = new ArrayList<>();
            }
            if (i == size - 1) {
                finalList.add(tempList);
            }
            if (null != list.get(i).getParentId()) {
                tempList.add(list.get(i));
            } else {
                tempList.add(list.get(i));
                --count;
            }
        }
    }



}
class Category1{
    Integer id;
    Integer parentId;

    public Category1(Integer id, Integer parentId) {
        this.id = id;
        this.parentId = parentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Category1{" +
                "id=" + id +
                ", parentId=" + parentId +
                '}';
    }
}
