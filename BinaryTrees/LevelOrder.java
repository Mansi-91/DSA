package BinaryTrees;
import java.util.*;
public class LevelOrder {
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> levelVal = new ArrayList<>();
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++){
                Node curr = q.poll();
                levelVal.add(curr.data);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            res.add(levelVal);
        }
        return res;
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        for (ArrayList<Integer> level : levelOrder(root)){
            System.out.println(level);
        }

    }
}
