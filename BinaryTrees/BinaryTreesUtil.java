package BinaryTrees;

public class BinaryTreesUtil {
    public static Node SampleTree(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right =  new Node(3);
        
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        
        return root;
    }
}
