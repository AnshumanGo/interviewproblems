package com.problems.java;

import java.math.BigInteger;

public class GreatCommonDivisorOfString {

    public static void main(String[] args) {
        BigInteger str1Length = BigInteger.valueOf(Math.abs("asdaas".length()));
        BigInteger str2Length = BigInteger.valueOf(Math.abs("dsa".length()));
        BigInteger gcd = str1Length.gcd(str2Length);
        System.out.println(gcd);
    }
}
