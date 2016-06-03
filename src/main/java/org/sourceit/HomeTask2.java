package org.sourceit;


import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.*;
public class HomeTask2 {

    /**
     * Конвертирует десятичное число в бинарную форму
     *
     * @param number может быть только позитивным
     * @return бинарная форма числа
     */
    public static long decimalToBinary (int number) {

        int a1 = 0;
        int a2 = 0;
        String s = "";

        while (number != 0){
            a1 = number % 2;
            s = a1 + s;
            number /= 2;
        }
        a2 = Integer.parseInt(s);
        System.out.print(s);

        return a2;
    }

    /**
     * Конвертирует десятичное число в октальную форму
     *
     * @param number может быть только позитивным
     * @return октальная форма числа
     */
    public static long decimalToOctal (int number) {

        int a1 = 0;
        int a2 = 0;
        String s = "";

        while (number != 0){
            a1 = number % 8;
            s = a1 + s;
            number /= 8;
        }

        a2 = Integer.parseInt(s);
        System.out.print(s);

        return a2;
    }

    /**
     * Конвертирует десятичное число в хексовою форму
     *
     * @param number может быть только позитивным
     * @return хексовая форма числа
     */
    public static long decimalToHex (int number) {

        int a1 = 0;
        int a2 = 0;
        String s = "";

        while (number != 0){
            a1 = number % 16;
            s = a1 + s;
            number /= 16;
        }

        a2 = Integer.parseInt(s);
        System.out.print(s);

        return a2;

    }


    /**
     * Конвертирует бинарную форму в десятичное число
     *
     * @param binary бинарная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int binaryToDecimal(long binary) {

        long a1;
        int i1 = 0;
        int i2 = 0;

        while (binary > 0){
            a1 = binary % 10;
            binary /= 10;
            a1 *= Math.pow(2, i2);
            i1 += a1;
            ++ i2;
        }
        return i1;
    }

    /**
     * Конвертирует октальную форму в десятичное число
     *
     * @param octal октальная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int octalToDecimal(long octal){

        long a1;
        int i1 = 0;
        int i2 = 0;

        while (octal > 0){
            a1 = octal % 10;
            octal /= 10;
            a1 *= Math.pow(8, i2);
            i1 += a1;
            ++ i2;
        }
        return i1;
    }

    /**
     * Конвертирует хексовую форму в десятичное число
     *
     * @param hex хексовая форма, может быть только позитивным
     * @return десятичное число
     */
    public static int hexToDecimal(long hex){

        long z1;
        int i1 = 0;
        int i2 = 0;

        while(hex > 0){
            z1 = hex % 10;
            hex /= 10;
            z1 *= Math.pow(16, i2);
            i1 += z1;
            ++ i2;
        }
        return i1;
    }

    /**
     * Генерируют двумерный массив, со случайными числами.
     *
     * @param rows
     * @param columns
     * @return двумерный массив
     */
    public static int[][] generateTwoDimensionArray(int rows, int columns)
    {
        int[][] m = new int[rows][columns];

        for (int i = 0; i < m.length; i++) {

            for (int i1 = 0; i1 < m[i].length; i1++) {
                m[i][i1] = ((int) (Math.random() * rows) - columns);
                System.out.print(m[i][i1]);
            }

            System.out.println("");
        }

        return m;
    }

    /**
     * Определить и вывести на экран индекс строки с
     * наибольшим по модулю произведением элементов.
     * Если таких строк несколько, то вывести индекс
     * первой встретившейся из них.
     *
     * @param  двумерный массив
     * @return индекс строки
     */
    public static int getRowProduct(int[] arr) {

        int i1 = 1;
        for (int i : arr) {
            i1 *= i;
        }
        return i1;
    }

    public static int findMax (int[][] input) {

        int[] row = new int[input.length];

        for (int i = 0; i < input.length; i++)
        {
            row [i] = getRowProduct(input[i]);
        }
        for (int i : row)
        {
            System.out.println("Result: " + i);
        }

        int max = row [0], maxValue = 0;

        for (int i = 0; i < row.length; i++)
        {

            if (row[i] > max)
            {
                max = row[i];
                maxValue = i+1;
            }
            System.out.println(maxValue);
        }


        return maxValue;
    }


    /**
     * Выводит все простые числа из интервала от 2 до n.
     *
     * @param n
     * @return массив простых чисел.
     */
    public static int[] getSimple (int n) {

        boolean[] prost = new boolean[n+1];
        Arrays.fill (prost, true);
        prost[0] = false;
        prost[1] = false;

        for(int i = 2; i*i < n; i++){
            if (prost[i])
            {
                for (int j = i*i; j < n; j+=i){
                    prost[j] = false;
                }
            }
        }
        List<Integer> arr = new ArrayList<Integer>();

        for (int i=0; i < n; i++)
        {
            if (prost[i])
            {
                arr.add(i);
            }
        }
        int[] arrInt = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++)
        {
            arrInt[i] = arr.get(i);
        }

        return arrInt;
    }




    // Рекурсивные методы. Реализовать их нужно с помощью рекурсии.

    /**
     * Вычисляет сумму чисел от 1 до n включительно.
     *
     * @param n предел
     * @return сумма
     */
    public static long summa (int n)
    {
        System.out.println(n*(n + 1) / 2);
        return n*(n + 1) / 2;

    }

    /**
     * Метод вычисляет, результат умножения.
     *
     * @param first
     * @param second
     * @return
     */
    public static int product(int first, int second) {

        int summa = 0;

        for (int i = second; i > 0; i--)
        {
            summa += first;
        }

        if (second < 0)
        {
            summa += first * second;
        }

        System.out.println(summa);

        return summa;
    }

}


