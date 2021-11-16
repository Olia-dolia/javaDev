package com.company;

import java.util.Scanner;

public class Task3Str {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        StringBuilder ourText = new StringBuilder();
        while (true) {
            System.out.println("Enter 1, 2 or 3");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    System.out.println("Enter your text or change: ");
                    String str = sc.nextLine();
                    if (str.contains("+")) {
                        ourText.append(str.substring(1)).append(" ");
                    } else if (str.contains("-") && ourText.toString().contains(str.substring(1))) {
                        ourText = new StringBuilder(ourText.toString().replace(str.substring(1)
                                + " ", ""));
                    } else{
                        System.out.println("No matches");
                    }
                    break;
                }
                case "2": {
                    String changedStr = ourText.toString().replaceAll(" ", ", ");
                    changedStr = changedStr.substring(0, changedStr.length() - 2);
                    System.out.println(changedStr);
                    break;
                }
                case "3": {
                    return;
                }
            }
        }
    }
}
