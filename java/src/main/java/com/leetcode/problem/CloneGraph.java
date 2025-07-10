package com.leetcode.problem;

import com.leetcode.problem.util.Node;

import java.util.*;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        Map<Integer, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        map.put(node.val, new Node(node.val));
        queue.add(node);

        while(!queue.isEmpty()) {
            Node current = queue.poll();

            for (Node n : current.neighbors) {
                if (!map.containsKey(n.val)) {
                    map.put(n.val, new Node(n.val));
                    queue.add(n);
                }
                map.get(current.val).neighbors.add(map.get(n.val));
            }
        }

        return map.get(node.val);
    }
}
