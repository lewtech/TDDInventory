package com.m3.training.inventory;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemTest {

	private Item objectUnderTest;
	
	
	
	@Test
	void test_TestItem_constructor() {
		Item objectUnderTest = new Item("apple", "fruit", 5);
		String expected = "fruit";
		String actual = objectUnderTest.getDescription();
		assertEquals(expected,actual);
	}
	
	
}
