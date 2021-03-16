package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 10;
        int k = 2;
        double expected = 5.55;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square2() {
        int p = 10;
        int k = 3;
        double expected = 4.68;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square3() {
        int p = 29;
        int k = 9;
        double expected = 18.92;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}