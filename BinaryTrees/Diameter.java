package BinaryTrees;

public class Diameter {
    int dia = 0;
    public  int diameter(Node root){
        height(root);
        return dia;
    }
    public int height(Node root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        dia = Math.max(dia, left + right );
        return 1 + Math.max(left,right);
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        Diameter tree = new Diameter();
        System.out.println(tree.diameter(root));

    }
}
