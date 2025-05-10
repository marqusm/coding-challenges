package com.hackerrank.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BiggerIsGreaterTest {

    @Test
    void tests() {
        Assertions.assertEquals("ba", BiggerIsGreater.biggerIsGreater("ab"));
        Assertions.assertEquals("no answer", BiggerIsGreater.biggerIsGreater("bb"));
        Assertions.assertEquals("hegf", BiggerIsGreater.biggerIsGreater("hefg"));
        Assertions.assertEquals("dhkc", BiggerIsGreater.biggerIsGreater("dhck"));
        Assertions.assertEquals("hcdk", BiggerIsGreater.biggerIsGreater("dkhc"));

        Assertions.assertEquals("lmon", BiggerIsGreater.biggerIsGreater("lmno"));
        Assertions.assertEquals("no answer", BiggerIsGreater.biggerIsGreater("dcba"));
        Assertions.assertEquals("no answer", BiggerIsGreater.biggerIsGreater("dcbb"));
        Assertions.assertEquals("acbd", BiggerIsGreater.biggerIsGreater("abdc"));
        Assertions.assertEquals("abdc", BiggerIsGreater.biggerIsGreater("abcd"));
        Assertions.assertEquals("fedcbabdc", BiggerIsGreater.biggerIsGreater("fedcbabcd"));
    }

}