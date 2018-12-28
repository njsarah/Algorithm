package com.Test.Algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Algorithm.DynamicPro.DynamicProgramming;

public class TestDynamicProgramming {

	@Test
	public void testisInterLeave() {
		DynamicProgramming dp = new DynamicProgramming();
		assertEquals(dp.isInterLeave("aabcc", "dbbca", "aadbbcbcac"),true);
		assertEquals(dp.isInterLeave("aabcc", "dbbca", "acdbbcbaac"),false);
		assertEquals(dp.isInterLeave("aaa", "bbb", "aaabbbb"),false);
		assertEquals(dp.isInterLeave("   ", "   ", "      "),true);
	}

}
