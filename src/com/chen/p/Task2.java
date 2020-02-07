package com.chen.p;

//        2. Написать метод.
//        Входящий параметр: отсортированный массив типа int который содержит отрицательные и положительные значения.
//        Вернуть отсортированный массив который состоит из квадратов значений.
//        Не использовать при этом стандартный метод sort.
//
//        Пример:
//        Input: [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]


import java.util.Arrays;
import java.util.Random;

public class Task2 {
    static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] input = new int[10];
        for (int i = 0; i < input.length; i++) {
            input[i] = RANDOM.nextInt(20) - 10;
        }
        System.out.println("Input array:");
        System.out.println(Arrays.toString(input));
        System.out.println("Result array:");
        System.out.println(Arrays.toString(sort(sqr(input))));
    }

    static int[] sqr(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = (int) Math.round(Math.pow(input[i], 2));
        }
        return input;
    }

    static int[] sort(int[] input) {
        int n = input.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
        return input;
    }
}
