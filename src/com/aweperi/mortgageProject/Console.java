package com.aweperi.mortgageProject;

import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt + ":\t");
            value = scanner.nextDouble();
            if (value >= min && value <= max) break;
            System.out.println("Enter a number  between " + min + " and " + max);
        }
        return value;
    }
}
