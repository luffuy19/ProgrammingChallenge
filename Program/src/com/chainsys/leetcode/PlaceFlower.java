package com.chainsys.leetcode;

//You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new 
//flowers can be planted in the flowerbed 
//without violating the no-adjacent-flowers rule and false otherwise.
//Example 1:
//Input: flowerbed = [1,0,0,1], n = 1
//Output: true
//Example 2:
//
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false

public class PlaceFlower {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int[] flowerbed2 = new int[flowerbed.length + 2];
		System.arraycopy(flowerbed, 0, flowerbed2, 1, flowerbed.length);
		flowerbed2[0] = 0;
		flowerbed2[flowerbed2.length - 1] = 0;
		int count = 0;
		for (int i = 0; i < flowerbed2.length; i++) {
			int temp = 1;
			if (flowerbed2[i] == 0) {
				i++;
				while (i < flowerbed2.length && flowerbed2[i] == 0) {
					temp++;
					i++;
				}
				if (temp >= 3) {
					if (temp % 2 == 0)
						temp--;
					count = count + (temp - 1) / 2;
				}
			}
		}
		return (count >= n);
	}
	public static void main(String[] args) {
		int[] flowerbed = {1,0,0,0,1} ;
		int n = 1;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}

	
}
