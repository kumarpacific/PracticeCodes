import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCode {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        forRec(arr, arr.size());
    }

    static void forRec(ArrayList<Integer> arr, int index) {
        if(index == 0){
            return;
        }

        System.out.println(arr.get(index-1)+ " ");

        forRec(arr, --index);
    }
}
