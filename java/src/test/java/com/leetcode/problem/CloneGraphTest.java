package com.leetcode.problem;

import java.util.*;

import com.leetcode.problem.util.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CloneGraphTest {

    @Test
    public void test01() {
        CloneGraph instance = new CloneGraph();
        List<List<Integer>> graph = List.of(
                List.of(2, 4),
                List.of(1, 3),
                List.of(2, 4),
                List.of(1, 3)
        );
        Assertions.assertEquals(Utils.buildGraph(graph), instance.cloneGraph(Utils.buildGraph(graph)));
    }

}