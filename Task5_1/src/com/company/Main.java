package com.company;

import java.util.Scanner;

public class Main {

    public static Double so1(String str){
        String symbol[] = str.split("");
        Double res = Double.parseDouble(symbol[0]);
        for(int i = 1; i<symbol.length; i+=2){
            switch (symbol[i]){
                case "*":{
                    res *= Double.parseDouble(symbol[i + 1]);
                    break;
                }
                case "/": {
                    res /= Double.parseDouble(symbol[i + 1]);
                    break;
                }
                case "+": {
                    res += Double.parseDouble(symbol[i + 1]);
                    break;
                }
                case "-": {
                    res -= Double.parseDouble(symbol[i + 1]);
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
	    System.out.println("Enter str: ");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        System.out.println(so1(inputStr));
    }
}
