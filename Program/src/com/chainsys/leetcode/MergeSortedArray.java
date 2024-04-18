package com.chainsys.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
	/*
	Example 1:
	Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	Output: [1,2,2,3,5,6]
	Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
	The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
	 */
	public static void main(String[] args) {
		int[] num1= {1,2,3,0,0,0};
		int[] num2= {2,5,6};
		int[] num3=new int[num1.length+num2.length];
		int count=0;
		int left=0;
		int right =0;
		while(left<num1.length && right<num2.length) {
			if(num1[left]>=num2[right] && num1[left]>0 && num2[right]>0) {
				num3[count]=num2[right];
				right++;
				count++;
			}
			else if(num1[left]<num2[right] && num1[left]>0 && num2[right]>0) {
				num3[count]=num1[left];
				left++;
				count++;
			}
			else if(num1[left]==0) {
				left++;
			}
			else if(num1[right]==0) {
				right++;
			}
			
		}
		while(left<num1.length) {
			if(num1[left]>0) {
				num3[count]=num1[left];
				left++;
				count++;
			}
		}
		while(right<num2.length) {
			if(num2[right]>0) {
				num3[count]=num2[right];
				right++;
				count++;
			}
		}
		System.out.println(Arrays.toString(num3));
	}

}
