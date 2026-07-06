package BinaryTrees;
import java.util.*;
public class LeftSide {
    public static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node curr = q.poll();
                if(i == 0) res.add(curr.data);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,3,-1,-1,1,-1,2,-1,7,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(leftView(root));
    }
}
