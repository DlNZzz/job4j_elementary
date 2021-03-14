package ru.job4j.calculator;
/*
Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.

Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
 */
public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);

        height = 167;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 167 is " + woman);
    }

}