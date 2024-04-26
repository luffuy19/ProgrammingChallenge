package com.chainsys.leetcode;

import java.util.Arrays;

public class RemovElement {
	public static int remove(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        System.out.println(count);
        for(int i=0;i<count;i++) {
        	System.out.print(nums[i]+" ");
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,3,4,5};
		System.out.println(remove(arr, 2));
	}

}
