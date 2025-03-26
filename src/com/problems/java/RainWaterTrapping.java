package com.problems.java;

public class RainWaterTrapping {
    public static int trap(int[] height) {
        int total = 0, high1 = 0, high2 = 0;
        for (int l = 0, r = height.length - 1; l < r;) {
            if (height[l] < height[r]) {
                high1 = Math.max(high1, height[l]);
                total += high1 - height[l++];
            } else {
                high2 = Math.max(high2, height[r]);
                total += high2 - height[r--];
            }
        }
        return total;
    }

    public static void main(String[] args) {

    }
}
