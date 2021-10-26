package com.company;

public class Main {
        public static double findUncommon(double[] arr) {
            double uncommon = 0;
            int l = arr.length;
            if (arr[0] != arr[1] && arr[0] != arr[2]) {
                uncommon = arr[0];
            } else if (arr[l - 1] != arr[l-2] && arr[l-1] != arr[l-3]) {
                uncommon = arr[l-1];
            } else {
                for (int i = 1; i < l; i++) {
                    if (arr[0] != arr[i]) {
                        uncommon = arr[i];
                        break;
                    }
                }
            }
            return uncommon;
        }

        public static int[] sortArray(int[] arr) {
            int l = arr.length;
            if (l == 0) {
                return arr;
            }
            String[] newArray = new String[l];

            for (int i = 0; i < l; i++) {
                if (arr[i] % 2 == 0) {
                    newArray[i] = String.valueOf(arr[i]);
                }
            }

            for (int i = 0; i < l - 1; i++) {
                for (int j = 0; j < l - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            for (int i = 0, j = 0; i < l; i++) {
                if (arr[j] % 2 == 0) {
                    j++;
                }
                if (newArray[i] == null && arr[j] % 2 != 0) {
                    newArray[i] = String.valueOf(arr[j++]);
                }
            }

            for (int i = 0; i < l; i++) {
                arr[i] = Integer.parseInt(newArray[i]);
            }

            return arr;
        }

    public static void main(String[] args) {
        System.out.println(findUncommon(new double[]{1, 0.55, 0.55, 0.55, 0.55}));
        System.out.println(findUncommon(new double[]{2, 1, 2, 2, 2}));
        System.out.println(findUncommon(new double[]{1, 1, 1, 1, 1, 1, 1, 0.55}));
        System.out.println(findUncommon(new double[]{2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2}));
        for (int i : sortArray(new int[]{5, 3, 2, 8, 1, 6, 4})) {
            System.out.print(i + " ");
        }
    }
}
