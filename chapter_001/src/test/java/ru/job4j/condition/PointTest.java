package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceFirst() {
        Point first = new Point(11,5);
        Point second = new Point(8,1);
        double expected = 5.0;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.0);
    }

    @Test
    public void distanceSecond() {
        Point first = new Point(3,4);
        Point second = new Point(6,8);
        double expected = 5.0;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.0);
    }

    @Test
    public void distanceThird() {
        Point first = new Point(5,3);
        Point second = new Point(7,3);
        double expected = 2.0;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.0);
    }

}