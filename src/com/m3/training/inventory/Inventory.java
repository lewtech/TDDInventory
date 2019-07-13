package com.m3.training.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	public List<Item> items = new ArrayList<>();


	
	@Override
	public String toString() {
		return String.format("{%s}", items);
	}



	public void addItem(Item item) {
		items.add(item);
		
	}



	public List<Item> getInventory() {
		// TODO Auto-generated method stub
		System.out.println(items);
		return items;
	}
	
	
	


}
