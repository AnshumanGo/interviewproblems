package com.problems.java;

public class MinimumValue {
	
	public static void main(String[] args) {
		
		int[] numberArray = {18, 20,21, 26, 30, -11, 11, 13, 13, 17};
		int arryLength = numberArray.length;
		
		System.out.print(minValue(numberArray, 0,arryLength -1));

	}
	
	public static int minValue(int[] narray, int start, int end ) {
		
		if(end < start) {
			
			return narray[0];			
		}
		
		if(end == start) {
			
			return narray[start];
		}
		
		int value = start + (end - start)/2;
		
		if (value > start && narray[value] < narray[value - 1]) {
			
			return narray[value];			
		}
		
		if(value <end && narray[value+1] < narray[value] ) {
			
			return narray[value+1];
		}
		
		if (narray[end] > narray[value]) {
			
			return minValue(narray, start, value-1);
		}
		
		return minValue(narray, value+1, end);
	}

}
