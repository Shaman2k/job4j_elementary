package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    void whenCalc1Then1() {
        int n = 1;
        int result = Factorial.calc(n);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCalc0Then1() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCalc5Then120() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }

}