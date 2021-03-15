package ru.job4j.calculator;
/*
Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.

Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
 */
public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        System.out.println("Man 187 is " + Fit.manWeight(height));

        height = 167;
        System.out.println("Woman 167 is " + Fit.womanWeight(height));
    }

}
