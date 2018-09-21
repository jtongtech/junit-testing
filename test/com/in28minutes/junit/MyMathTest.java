package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@Before
	public void before() {
		System.out.println("Before");
	}

	@Test
	public void test_sum_with3numbers() {
		System.out.println("Test1");
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] { 1, 2, 3 });
		assertEquals(6, result);
	}

	@Test
	public void test_sum_with1number() {
		System.out.println("Test2");
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] { 3 });
		assertEquals(3, result);
	}

}
