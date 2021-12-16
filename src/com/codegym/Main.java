package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] numbers;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        numbers = new int[size];
        int i = 0;
        while (i < numbers.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j] + "\t");
        }


        for (int j = 0; j < numbers.length / 2; j++) {
            int temp = numbers[j];
            numbers[j] = numbers[size - 1 - j];
            numbers[size - 1 - j] = temp;
        }

        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + "\t");
        }
    }
}
