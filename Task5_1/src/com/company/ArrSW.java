package com.company;

import java.util.Scanner;

public class ArrSW {
    public static void main(String[] args) {
        System.out.println("Enter odd number(arr length): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n %2 == 0){
            System.out.println("Enter odd number(arr length): ");
            n = sc.nextInt();
        }
        int arr[] = new int[n];
        for (int i = 0, center = (n-1)/2; i < arr.length; i++) {
            if (i < arr.length / 2) {
                arr[i] = center--;
            } else {
                arr[i] = center++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
