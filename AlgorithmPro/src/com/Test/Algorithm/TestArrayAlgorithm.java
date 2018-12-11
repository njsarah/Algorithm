package com.Test.Algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Algorithm.Array.ArrayAlgorithm;

public class TestArrayAlgorithm {

	@Test
	public void TestMink() {
		ArrayAlgorithm arrayAlgorithm = new ArrayAlgorithm();
		int[] data = {3,6,2,5,7,1,0,8};
		int[] actual = arrayAlgorithm.MinK(data,5);
		int[] expect = {0,1,2,3,5};
		assertArrayEquals("failuer-if not same",actual,expect);
	}
	@Test
	public void TestTwoSum()
	{
		
	}

}
