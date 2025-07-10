package com.leetcode.problem.util;

import java.util.*;

public class Utils {

    public static TreeNode buildTree(Integer[] nodes) {
        if (nodes.length == 0 || nodes[0] == null) return null;

        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < nodes.length) {
            TreeNode current = queue.poll();

            if (i < nodes.length && nodes[i] != null) {
                current.left = new TreeNode(nodes[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < nodes.length && nodes[i] != null) {
                current.right = new TreeNode(nodes[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public static Node buildGraph(List<List<Integer>> adjList) {
        if (adjList.isEmpty()) return null;

        // Step 1: Create all nodes
        Map<Integer, Node> map = new HashMap<>();
        for (int i = 0; i < adjList.size(); i++) {
            map.put(i + 1, new Node(i + 1));
        }

        // Step 2: Add neighbors
        for (int i = 0; i < adjList.size(); i++) {
            Node node = map.get(i + 1);
            for (int neighborVal : adjList.get(i)) {
                node.neighbors.add(map.get(neighborVal));
            }
        }

        return map.get(1); // or any node as the entry point
    }

}
