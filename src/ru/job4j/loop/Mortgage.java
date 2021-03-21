package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent /= 100;
        double val = amount;
        while (val > 0) {
            val += percent * amount - salary;
            year++;
        }
        return year;
    }
}