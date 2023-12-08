package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to64then5Dot38() {
        double expected = 5.38;
        int x1 = 1;
        int y1 = 2;
        int x2 = 6;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11toMinus1Minus1then2Dot82() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 1;
        int x2 = -1;
        int y2 = -1;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus5to28then13Dot15() {
        double expected = 13.15;
        int x1 = 0;
        int y1 = -5;
        int x2 = 2;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}