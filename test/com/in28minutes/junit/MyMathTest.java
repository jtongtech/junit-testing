package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test_sum_with3numbers() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] { 1, 2, 3 });
		assertEquals(6, result);
	}

}
