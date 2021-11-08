package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static final List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");

    public static void main(String[] args) {
	// write your code here
        list.stream().filter(elem -> elem.contains("c")).sorted().forEach(elem -> System.out.println(elem.toUpperCase()));
    }
}
