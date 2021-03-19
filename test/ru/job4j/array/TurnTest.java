package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.Matchers.is;

public class TurnTest {

    @Test
    public void back() {
        int[] array = {0, 1, 4, 9};
        int[] out = Turn.back(array);
        int[] expected = {9, 4, 1, 0};
        Assert.assertThat(out, is(expected));
    }

    @Test
    public void back2() {
        int[] array = {0, 1, 4, 9, 16};
        int[] out = Turn.back(array);
        int[] expected = {16, 9, 4, 1, 0};
        Assert.assertThat(out, is(expected));
    }
}