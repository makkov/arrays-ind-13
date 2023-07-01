package com.hw.maxim;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }

            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        double avg = (double) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", avg);
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
