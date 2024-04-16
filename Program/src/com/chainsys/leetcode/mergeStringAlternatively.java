package com.chainsys.leetcode;
/*
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating 
 * order, starting with word1. If a string is longer than the other,append the additional letters 
 * onto the end of the merged string.
 */
public class mergeStringAlternatively {
	public static String mergeAlternatively(String s1,String s2) {
		int a=0;
		int b=0;
		StringBuffer word=new StringBuffer();
		while(s1.length()>a && s2.length()>b) {
			word.append(s1.charAt(a));
			word.append(s2.charAt(b));
			a++;
			b++;
		}
		while(s1.length()>a) {
			word.append(s1.charAt(a));
			a++;
		}
		while(s2.length()>b) {
			word.append(s2.charAt(b));
			b++;
		}
		return word.toString();
	}
	public static void main(String[] args) {
		String word1 = "a b ";
		String word2 = "p qrs" ;
		System.out.println(mergeAlternatively(word1, word2));
	}
}
