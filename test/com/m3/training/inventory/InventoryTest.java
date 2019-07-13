package com.m3.training.inventory;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryTest {
	
	
	private Inventory objectUnderTest;
	@BeforeEach void test() throws Exception{
		objectUnderTest = new Inventory();
	}
	
	@Test
	void test_TestInventory_addItem() {
		Item fruit1 = new Item("apple", "fruit", 5);
//		Item veggie1 = new Item("carrot", "veggie", 10);
		objectUnderTest.addItem(fruit1);
		List<Item> inventory = objectUnderTest.getInventory();
//		System.out.println(inventory);
	}

}
