package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        result(first > second);
        result(first < second);
        result(first == second);
    }

    public static void result(boolean res) {
        System.out.println(res);
    }
}