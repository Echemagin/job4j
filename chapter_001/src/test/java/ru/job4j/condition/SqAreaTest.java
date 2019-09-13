package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squareFirst() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.0);

    }

    @Test
    public void squareSecond() {
        int p = 9;
        int k = 3;
        double expected = 3.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.0);

    }

    @Test
    public void squareThird() {
        int p = 12;
        int k = 4;
        double expected = 4.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.0);

    }

}
