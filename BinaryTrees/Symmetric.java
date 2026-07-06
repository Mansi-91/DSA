package BinaryTrees;

public class Symmetric {
    public static boolean isSymmetric(Node root){
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }
    public static boolean isMirror(Node left, Node right){
        if( left == null && right == null) return true;
        if(left == null || right == null) return false;
        return( left.data == right.data && isMirror(left.left, right.right) && isMirror(left.right, right.left));
    }
    public static void main(String[] args){
        int[] nodes = {1,2,3,-1,-1,4,-1,-1,2,4,-1,-1,3,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(isSymmetric(root));

    }

}
