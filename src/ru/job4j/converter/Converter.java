package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        /* формула перевода рублей в доллары. */
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int inD = 600;
        int expectedD = 10;
        int outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("140 rubles are 2. Test result : " + passedD);

        System.out.println("140 rubles are " + out + " euro.");
        System.out.println("600 rubles are " + outD + " dollar.");
    }
}