import javax.swing.*;
import javax.xml.transform.stream.StreamSource;

public class HightOfTree {
    public static void main(String args[]) {

        //              7
        //            /  \
        //           6    8
        //         /
        //        4
        //         \
        //          3
        //           \
        //            2
        Tree node8 = new Tree(8, null, null);

        Tree node2 = new Tree(2, null, null);
        Tree node3 = new Tree(3, null, node2 );
        Tree node4 = new Tree(4, node3, null);
        Tree node6 = new Tree(6, node4, null);
        Tree node7 = new Tree(7, node6, node8);

        System.out.println(gethight(node7));

    }

    public static Integer gethight(Tree node){
        if(node == null){
            return 0;
        }

        Integer left = gethight(node.getLeft());
        Integer right = gethight(node.getRight());

        return 1 + Math.max(left, right);
    }


}

class Tree{
    int value;
    Tree leftNode;
    Tree rightNode;

    public Tree(int value, Tree leftNode, Tree rightNode){
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getValue(){
        return value;
    }

    public Tree getLeft(){
        return leftNode;
    }

    public Tree getRight(){
        return rightNode;
    }
}