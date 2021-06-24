package com.epam.rd.autotasks.sequence;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class FindMaxInSeqTests {
    @Test
    public void testSeq11() {
        String input = "1 2 3 7 12 1 4 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals(12, FindMaxInSeq.max());
    }

    @Test
    public void testSeq12() {
        String input = "3 4 9 1 4 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals(9, FindMaxInSeq.max());
    }

    @Test
    public void testNegativeValues() {
        String input = "-3 4 -9 1 -4 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals(4, FindMaxInSeq.max());
    }

    @Test
    public void testNegativeMaximum() {
        String input = "-3 -4 -9 -1 -4 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals(-1, FindMaxInSeq.max());
    }

    @Test
    public void testNegativeDuplicatedMaximum() {
        String input = "-3 -4 -9 -4 -1 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals(-1, FindMaxInSeq.max());
    }

    @Test
    public void testDuplicatedMaximum() {
        String input = "9 -3 9 4 9 -1 4 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals(9, FindMaxInSeq.max());
    }

    @Test
    public void testPolydigitNumbers() {
        String input = "99 -321 9 431 99 -11 4 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals(431, FindMaxInSeq.max());
    }

    @Test
    public void oneNumberSequence1() {
        String input = "34567 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals(34567, FindMaxInSeq.max());
    }

    @Test
    public void oneNumberSequence2() {
        String input = "-934567 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals(-934567, FindMaxInSeq.max());
    }

    @Test
    public void testHavingIntegerMaxValue() {
        int maxValue = Integer.MAX_VALUE;
        String input = "-934567 4567 2147483647 -1 6273 -56789 3 2346 -18384 -483642347 6 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals(2147483647, FindMaxInSeq.max());
    }
}
