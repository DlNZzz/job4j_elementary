package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int num = 5;
        int out = Factorial.calc(num);
        int expected = 120;
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int num = 0;
        int out = Factorial.calc(num);
        int expected = 1;
        Assert.assertEquals(out, expected);
    }
}