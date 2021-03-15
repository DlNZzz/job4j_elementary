package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int rsl = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMax10To2Then2() {
        int left = 10;
        int right = 2;
        int rsl = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int rsl = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }
}
