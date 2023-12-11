package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MultipleSwitchWeekTest {
    @Test
    void whenMondayThen1() {
        String input = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(input);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFridayThen5() {
        String input = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(input);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when8ThenError() {
        String input = "Sunny";
        int result = MultipleSwitchWeek.numberOfDay(input);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}
