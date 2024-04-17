package com.chainsys.leetcode;

public class NumberPalindrome {
	public static boolean isPalindrome(int x) {
        int copy=x;
        int rev=0;
        while(x>0){
            rev=rev*10;
            rev=rev+x%10;
            x=x/10;
        }
        return rev==copy;
    }
	public static void main(String[] args) {
		System.out.println(isPalindrome(123));
		System.out.println(isPalindrome(-121));
	}
}
