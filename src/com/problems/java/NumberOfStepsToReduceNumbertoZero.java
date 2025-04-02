package com.problems.java;

public class NumberOfStepsToReduceNumbertoZero {
    static int numberOfSteps(int number) {
        int steps = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                number /= 2;
                steps++;
            } else {
                number -=1;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
