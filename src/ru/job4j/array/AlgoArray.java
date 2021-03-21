package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        arraySwap(array, 0, 3);
        arraySwap(array, 4, 3);
        arraySwap(array, 1, 2);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static int[] arraySwap(int[] array, int one, int two) {
        int temp = array[two];
        array[two] = array[one];
        array[one] = temp;
        return array;
    }
}