package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {

    @Test
    public void distanceTest() {
        Point a = new Point(0, 1);
        Point b = new Point(4, 0);
        double result = a.distance(b);
        assertThat(result, closeTo(4.1, 0.1));
    }

    @Test
    public void distance3dTest() {
        Point a = new Point(0, 1, 6);
        Point b = new Point(4, 0, 1);
        double result = a.distance3d(b);
        assertThat(result, closeTo(6.48, 0.01));
    }
}
