package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        int in = 200;
        int expected = 115;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void womanWeight() {
        int in = 200;
        double expected = 103.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }
}
