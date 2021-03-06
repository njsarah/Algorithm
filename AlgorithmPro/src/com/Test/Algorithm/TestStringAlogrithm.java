package com.Test.Algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Algorithm.String.FullyArranged;
import com.Algorithm.String.Palindrome;

public class TestStringAlogrithm {

	@Test
	public void test() {
		Palindrome palindrome = new Palindrome();
		assertEquals(palindrome.LongestPalindrome("12121"),5);
		assertEquals(palindrome.LongestPalindrome("123"),1);
		assertEquals(palindrome.LongestPalindrome("121213121216"),11);
		assertEquals(palindrome.LongestPalindrome(""),0);
		
		assertEquals(palindrome.isPalindrome("123"),false);
		assertEquals(palindrome.isPalindrome("12121"),true);
		assertEquals(palindrome.isPalindrome(""),true);
		
		assertEquals(palindrome.isPalindromeFunction2("123"),false);
		assertEquals(palindrome.isPalindromeFunction2("feabcbaef"),true);
		assertEquals(palindrome.isPalindromeFunction2(""),true);
		
		FullyArranged fullyarranged = new FullyArranged();
		assertEquals(fullyarranged.nextPermutation("321"),"321");
	}

}
