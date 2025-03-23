package com.problems.java;

import java.util.Scanner;

public class ClosestDivisibleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println(extracted(a,b));

    }

    private static int extracted(int a, int b) {
        int q = a / b;

        // 1st possible closest number
        int n1 = b * q;

        // 2nd possible closest number
        int n2 = (a * b) > 0 ? (b * (q + 1)) : (b * (q - 1));

        // if true, then n1 is the required closest number
        if (Math.abs(a - n1) < Math.abs(a - n2))
            return n1;

        // else n2 is the required closest number
        return n2;
    }
}
