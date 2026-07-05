package BinaryTrees;

public class HeightBalancedTree {
    public static boolean isBalanced(Node root){
        return height(root) != -1;
    }
    public static int height(Node root){
        if(root == null) return 0;
        int left = height(root.left);
        if(left == -1) return -1;
        int right = height(root.right);
        if(right == -1) return -1;
        if(Math.abs(left - right) > 1) return -1;
        return 1 + Math.max(left, right);
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(isBalanced(root));

    }
}
 