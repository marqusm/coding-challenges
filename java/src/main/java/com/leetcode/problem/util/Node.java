package com.leetcode.problem.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    @Override
    public String toString() {
        return "Node{" + "val=" + val + ", neighbors=" + neighbors.stream().map(o -> o.val).toList() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return val == node.val
                && neighbors.stream()
                    .map(i -> i.val + "")
                    .collect(Collectors.joining(","))
                .equals(node.neighbors.stream()
                        .map(i -> i.val + "")
                        .collect(Collectors.joining(","))
                );
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, neighbors);
    }

}
