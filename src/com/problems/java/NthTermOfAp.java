package com.problems.java;

public class NthTermOfAp {
    public static void main(String[] args) {
        System.out.println("Nth term in given AP is "  + nThTerm(5,6,6));
    }
    public static int nThTerm(int a, int b, int c) {
        return a + (c-1)*(b-a);
    }
}
