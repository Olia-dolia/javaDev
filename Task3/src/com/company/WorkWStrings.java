package com.company;

import java.util.Arrays;

public class WorkWStrings {
    private static String changeStr(String str){
        StringBuffer sb = new StringBuffer();
        Arrays.stream(str.split("")).forEach(x -> {
            if (x.matches("[h-t]")) {
                sb.append(x.toUpperCase());
            } else {
                sb.append(x);
            }
        });
        return sb.toString();
    }
    public static void main(String[] args) {
        String inputStr = "sjdhgfsjkavcqhjwagehf";
        String outputStr = changeStr(inputStr);
        System.out.println(outputStr);
    }
}
