package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {
    @Test
    void when1ThenMonday() {
        int input = 1;
        String result = SwitchWeek.nameOfDay(input);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when8ThenError() {
        int input = 8;
        String result = SwitchWeek.nameOfDay(input);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }
}