package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float ruble = 140;
        float out = Converter.rubleToEuro(ruble);
        float expected = 2f;
        boolean passed = expected == out;
        System.out.println(ruble + " rubles are 3 euro. Test result : " + passed);
        out = Converter.rubleToDollar((ruble));
        expected = 2.3333333f;
        passed = expected == out;
        System.out.println(ruble + " rubles are 5 dollar. Test result : " + passed);
    }
}
