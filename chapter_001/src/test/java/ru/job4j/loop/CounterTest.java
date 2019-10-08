package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenIsThirty(){
        Counter count = new Counter();
        assertThat(count.add(1, 10), is(30));
    }

    @Test
    public void whenSumEvenNumbersFromFiveToNineIsFourteen(){
        Counter count = new Counter();
        assertThat(count.add(5, 9), is(14));
    }

    @Test
    public void whenSumEvenNumbersFromTwelveToSeventeenIsFourtyTwo(){
        Counter count = new Counter();
        assertThat(count.add(12, 17), is(42));
    }
}
