package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenFirstMax() {
        SqMax max = new SqMax();
        int result = max.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        SqMax max = new SqMax();
        int result = max.max(3, 4, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        SqMax max = new SqMax();
        int result = max.max(2, 3, 4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenFourthMax() {
        SqMax max = new SqMax();
        int result = max.max(1, 3, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void additionalTest() {
        SqMax max = new SqMax();
        int result = max.max(4, 3, 8, 1);
        assertThat(result, is(8));
    }
}
