package ru.job4j.array;
/*
    - Массив на 10 элементов типа short с именем ages.
    - Массив на 100500 элементов типа String c именем surnames.
    - Массив на 40 элементов типа float с именем prices.
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        String[] names = getNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static String[] getNames() {
        String[] names = new String[4];
        names[0] = "Andrei Hincu";
        names[1] = "Rail Shamsemuhametov";
        names[2] = "Korobeinikov Stas";
        names[3] = "Petr Bogomolov";
        return names;
    }
}
