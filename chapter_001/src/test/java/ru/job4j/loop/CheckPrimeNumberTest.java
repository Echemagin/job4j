package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when17() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(17);
        assertThat(rsl, is(true));
    }

    @Test
    public void when18() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(18);
        assertThat(rsl, is(false));
    }
}
