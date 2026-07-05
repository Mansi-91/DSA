package BinaryTrees;
import java.util.*;
public class AvgOfLevels {
    public static ArrayList<Double> avgOfLevels(Node root){
        ArrayList<Double> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Double average = 0.0;
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++){
                Node curr = q.poll();
                average += curr.data;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);   
            }
            average = average/levelSize;
            res.add(average);
        }
        return res;
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(avgOfLevels(root));

    }
}
