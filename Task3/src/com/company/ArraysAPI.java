package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysAPI {

    public static void main(String[] args) {
        System.out.println("Array length: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Random().nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Double avarNumber = Arrays.stream(array).filter(elem -> elem % 2 == 0 && elem != 0).average().getAsDouble();
        System.out.println(avarNumber);
    }
}
