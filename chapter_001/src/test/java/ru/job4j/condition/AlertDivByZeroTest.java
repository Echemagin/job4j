package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class AlertDivByZeroTest {
    @Test
    public void whenNumberIsZero() {
        assertThat(
                AlertDivByZero.possibleDiv(0),
                is("Could not div by 0.")
        );
    }

    @Test
    public void whenNumberIsNegative() {
        assertThat(
                AlertDivByZero.possibleDiv(-5),
                is("This is negative number.")
        );
    }
}
