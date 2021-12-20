import java.util.ArrayList;
import java.util.List;


class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class LeftViewOfTree {
    public static void main(String[] args) {
        //    1
        //   2  3
        //        4

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);

        List<Integer> result = new ArrayList<>();

        LeftView instance = new LeftView();

        instance.leftView(root, 1, result);

        for (Integer data : result
             ) {
            System.out.print(data + " ");
        }
    }

}

class LeftView{
    Integer maxLevel = 0;

    public void leftView(Node node, int level, List<Integer> result) {
        if (node == null) {
            return;
        }

        if (maxLevel < level) {
//          System.out.print(node.data + " ");
            result.add(node.data);
            maxLevel = level;
        }

        leftView(node.left, level + 1, result);
        leftView(node.right, level + 1, result);
    }
}

