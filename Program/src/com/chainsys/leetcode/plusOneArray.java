package com.chainsys.leetcode;

import java.util.Arrays;

public class plusOneArray {
	    public static int[] plusOne(int[] digits) {
	            for (int i = digits.length - 1; i >= 0; i--) {
		            if (digits[i] < 9) {
			            digits[i]++;
			        return digits;
		            }
		        digits[i] = 0;
	            }

	            digits = new int[digits.length + 1];
	            digits[0] = 1;
	            return digits;    
	    }
	    public static void main(String[] args) {
	    	int[] arr1= {9};
	    	int[] arr2= {3,9,9};
	    	System.out.println(Arrays.toString(plusOne(arr1)));
	    	System.out.println(Arrays.toString(plusOne(arr2)));
	    }

}
