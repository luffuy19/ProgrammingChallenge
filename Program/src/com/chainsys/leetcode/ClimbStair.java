package com.chainsys.leetcode;

public class ClimbStair {
	/*
	 * ou are climbing a staircase. It takes n steps to reach the top.

	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	Example 1:

	Input: n = 2
	Output: 2
	Explanation: There are two ways to climb to the top.
	1. 1 step + 1 step
	2. 2 steps
	 */
	public static int calculateStep(int n) {
		if (n == 0 || n == 1) {
            return 1;
        }
        return calculateStep(n-1) + calculateStep(n-2);
	}
	public static void main(String[] args) {
		System.out.println("There are "+calculateStep(30)+" Way to complete 3 Steps");
	}
}
