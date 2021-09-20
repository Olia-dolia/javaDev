package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {
    private static void printArray(int[][] arr){
        int lngth = arr.length - 1;
        for (int i=0;i < arr.length;i++,System.out.println()) {
            for (int j=0;j < arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.print("Side diagonal: ");
        for (int i = lngth; i >= 0; i--) {
            if(arr[i][lngth - i] % 2 == 0) {
                System.out.print(arr[i][lngth - i] + " ");
            }
        }
    }
    private static int[] fillArray(int begin, int end, int step){
        int[] arr;
        if (begin < end) {
            arr = new int[(end - begin) / step + 1];
            for (int i = 0; begin <= end; i++, begin += step) {
                arr[i] = begin;
            }
        } else {
            arr = new int[(begin - end) / step + 1];
            for (int i = 0; begin >= end; i++, begin -= step) {
                arr[i] = begin;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[5][5];

        Random rnd = new Random();
        for (int i=0;i < a.length;i++) {
            for (int j=0;j < a[i].length;j++) {
                a[i][j]=rnd.nextInt(10);
            }
        }
        printArray(a);
        System.out.println("\nNext part!");
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();
        int[] k = fillArray(begin, end, step);
        for (int i = 0; i<k.length; i++){
            System.out.println(k[i] + " ");
        }
    }
}
