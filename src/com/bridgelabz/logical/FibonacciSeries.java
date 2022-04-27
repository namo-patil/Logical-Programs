package com.bridgelabz.logical;

import java.util.Scanner;

public class FibonacciSeries {
    static void printSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum term of the series");
        int maxNum = scanner.nextInt();
        int num1 = 0, num2 = 1, num3;
        System.out.println("Fibonacci Series till " + maxNum + " terms");

        for (int i = 1; i <= maxNum; ++i) {
            System.out.print(num1 + ", ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        printSeries();
    }
}
