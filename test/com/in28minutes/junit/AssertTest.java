package com.in28minutes.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		assertEquals(1, 1);
		assertTrue(true);
		assertTrue(false);
		assertEquals(1, "red");
		assertNotNull("hello");
	}

}
