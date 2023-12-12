package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenSum1To4Then10() {
        int start = 1;
        int finish = 4;
        int result = Counter.sum(start, finish);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum5To3Then0() {
        int start = 5;
        int finish = 3;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum5To5Then5() {
        int start = 5;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumMinus5To0ThenMinus15() {
        int start = -5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = -15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEven1To4Then6() {
        int start = 1;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEven5To3Then0() {
        int start = 5;
        int finish = 3;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEven5To5Then0() {
        int start = 5;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEven6To6Then6() {
        int start = 6;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenMinus5To0ThenMinus12() {
        int start = -6;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = -12;
        assertThat(result).isEqualTo(expected);
    }
}