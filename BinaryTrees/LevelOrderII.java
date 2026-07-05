package BinaryTrees;

import java.util.*;

public class LevelOrderII {
    public static ArrayList<ArrayList<Integer>> levelOrderII(Node root){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> levels = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node curr = q.poll();
                levels.add(curr.data);
                if(curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            res.add(0,levels);
        }
        return res;
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        for (ArrayList<Integer> level : levelOrderII(root)){
            System.out.println(level);
        }

    }
}
