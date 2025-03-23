package com.problems.java;

import java.util.Scanner;

public class SumOfFirstNNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum of first "+number+" natural numbers is : " +sum);
    }
}
