package BinaryTrees;
import java.util.*;
public class ZigZag {
    public static ArrayList<ArrayList<Integer>> zigzagTraverseal(Node root){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Deque<Node> q = new LinkedList<>();
        boolean reverse = false;
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> levels = new ArrayList<>();
            int levelSize = q.size();
            if(reverse){
                for(int i =0; i < levelSize;i++){
                    Node curr = q.pollLast();
                    if(curr.right != null) q.addFirst(curr.right);
                    if(curr.left != null) q.addFirst(curr.left);
                    levels.add(curr.data);
                }
            }
            else{
                for(int i =0; i < levelSize;i++){
                    Node curr = q.pollFirst();
                    if(curr.left != null) q.addLast(curr.left);
                    if(curr.right != null) q.addLast(curr.right);
                    levels.add(curr.data);
                }
            }
            reverse = !reverse;
            res.add(levels);
        }
        
        return res;
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        for (ArrayList<Integer> level : LevelOrder.levelOrder(root)){
            System.out.println(level);
        }
        for (ArrayList<Integer> level : zigzagTraverseal(root)){
            System.out.println(level);
        }

    }
}
