package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to64then5Dot38() {
        double expected = 5.38;
        Point a = new Point(1, 2);
        Point b = new Point(6, 4);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11toMinus1Minus1then2Dot82() {
        double expected = 2.82;
        Point a = new Point(1, 1);
        Point b = new Point(-1, -1);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus5to28then13Dot15() {
        double expected = 13.15;
        Point a = new Point(0, -5);
        Point b = new Point(2, 8);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}