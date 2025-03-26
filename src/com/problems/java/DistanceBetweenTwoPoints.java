package com.problems.java;

public class DistanceBetweenTwoPoints {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    }

    public static void main(String[] args) {
        System.out.println(distance(1, 2, 3, 4));
    }
}
