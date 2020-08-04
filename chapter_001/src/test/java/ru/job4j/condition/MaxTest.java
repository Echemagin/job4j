package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstIsMax() {
        assertThat(
                Max.max(13, 10),
                is(13)
        );
    }

    @Test
    public void whenSecondIsMax() {
        assertThat(
                Max.max(10, 15),
                is(15)
        );
    }

    @Test
    public void whenFiguresIsEqual() {
        assertThat(
                Max.max(10, 10),
                is(10)
        );
    }

    @Test
    public void whenThreeFigures() {
        assertThat(
                Max.max(10, 10, 15),
                is(15)
        );
    }

    @Test
    public void whenFourFigures() {
        assertThat(
                Max.max(1, 5, 13, 7),
                is(13)
        );
    }
}
