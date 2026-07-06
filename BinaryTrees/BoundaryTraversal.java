package BinaryTrees;

import java.util.*;

public class BoundaryTraversal {
    public static ArrayList<Integer> boundary(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        if(!isLeaf(root)) res.add(root.data);

        addLeftBoundary(root, res);
        addLeaf(root, res);
        addRightBoundary(root, res);
        return res;
    }
    public static boolean isLeaf(Node root){
        return (root.left == null && root.right == null);
    }
    public static void addLeftBoundary(Node root, ArrayList<Integer> res){
        if(root == null) return;
        Node curr = root.left;
        while(curr != null){
            if(!isLeaf(curr)) res.add(curr.data);
            if(curr.left != null) {
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }
    public static void addLeaf(Node root, ArrayList<Integer> res){
        if(root == null) return;
        if(isLeaf(root)) {
            res.add(root.data);
            return;
        }
        addLeaf(root.left, res);
        addLeaf(root.right, res);
    }
    public static void addRightBoundary(Node root, ArrayList<Integer> res){
        if(root == null) return;
        Node curr = root.right;
        Stack<Integer> st = new Stack<>();
        while(curr != null){
            if(!isLeaf(curr)) st.push(curr.data);
            if(curr.right != null) {
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }
        while(!st.isEmpty()){
            res.add(st.pop());
        }
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,3,-1,-1,1,-1,2,-1,7,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(boundary(root));
    }
}
