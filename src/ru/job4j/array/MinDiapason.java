package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        /*        for (int i = ...; i < ...; i++) { */
        /*        } */
        for (int i = ++start; i <= finish; i++) {
            min = array[i] < min ? array[i] : min;
        }
        return min;
    }
}