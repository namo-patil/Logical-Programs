package com.bridgelabz.logical;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();
        perfectNumber.CheckNumber();
    }

    public void CheckNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a Number :");
        int number = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= number / 2) {
            if (number % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == number) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is not a Perfect Number");
        }
    }
}
