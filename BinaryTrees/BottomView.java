package BinaryTrees;
import java.util.*;
public class BottomView {
    static class Info {
        Node node;
        int hd;
        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Info> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        q.add(new Info(root,0));
        while(!q.isEmpty()){
            Info curr = q.poll();
            map.put(curr.hd, curr.node.data);
            if(curr.node.left != null) q.add(new Info(curr.node.left , curr.hd - 1));
            if(curr.node.right != null) q.add(new Info(curr.node.right, curr.hd + 1));
        }
        for(int val : map.values()){
            res.add(val);
        }
        return res;
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,3,-1,-1,1,-1,2,-1,7,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(bottomView(root));
    }
}
