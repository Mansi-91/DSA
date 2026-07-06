package BinaryTrees;

import java.util.*;

public class VerticalOrderTraversal {
    static class Info {
        Node node;
        int row;
        int col;

        Info(Node root, int row, int col) {
            this.node = root;
            this.row = row;
            this.col = col;
        }
    }

    public static ArrayList<ArrayList<Integer>> verticalTraversal(Node root) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (root == null)
            return res;

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Info> q = new LinkedList<>();

        q.offer(new Info(root, 0, 0));

        while (!q.isEmpty()) {

            Info curr = q.poll();

            map.putIfAbsent(curr.col, new TreeMap<>());
            map.get(curr.col).putIfAbsent(curr.row, new PriorityQueue<>());
            map.get(curr.col).get(curr.row).offer(curr.node.data);

            if (curr.node.left != null) {
                q.offer(new Info(curr.node.left, curr.row + 1, curr.col - 1));
            }

            if (curr.node.right != null) {
                q.offer(new Info(curr.node.right, curr.row + 1, curr.col + 1));
            }
        }

        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {

            ArrayList<Integer> list = new ArrayList<>();

            for (PriorityQueue<Integer> pq : rows.values()) {

                while (!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            }

            res.add(list);
        }

        return res;
    }
}
