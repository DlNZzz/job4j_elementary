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
}