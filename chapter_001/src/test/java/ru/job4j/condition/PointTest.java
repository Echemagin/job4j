package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceFirst() {
        int x1 = 11;
        int x2 = 8;
        int y1 = 5;
        int y2 = 1;
        double expected = 5.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.0);
    }

    @Test
    public void distanceSecond() {
        int x1 = 3;
        int x2 = 6;
        int y1 = 4;
        int y2 = 8;
        double expected = 5.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.0);
    }

    @Test
    public void distanceThird() {
        int x1 = 5;
        int x2 = 7;
        int y1 = 3;
        int y2 = 3;
        double expected = 2.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.0);
    }

}