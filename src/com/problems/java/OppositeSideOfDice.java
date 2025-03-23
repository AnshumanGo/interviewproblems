package com.problems.java;

import java.util.Scanner;

public class OppositeSideOfDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean correctInput = true;
        if(a >6 || a <0){
            System.out.println("Invalid Input");
            a = sc.nextInt();
            if(a > 6 || a <0){
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("opposite Side of "+a+" in dice is "+ oppositeSide(a));
        }
    }
    public static int oppositeSide(int num) {
        return 7 - num;
    }
}
