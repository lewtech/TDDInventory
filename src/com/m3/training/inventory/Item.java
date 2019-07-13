package com.m3.training.inventory;

public class Item {
	public String id;
	public static String description;
	public static Integer quantity;
	public boolean recalled;
	public boolean available;
	public Integer refillThreshold;
	public Integer refillAmount;
	public boolean onBackorder;
	
	public Item(String id, String description, Integer quantity) {
		
		this.id = id;
		this.description = description;
		this.quantity = quantity;
		recalled = false;
		available = true;
		refillThreshold = 10;
		refillAmount = 10;
		onBackorder = false;
	}



	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	@Override
	public String toString() {
		return String.format("{%s, %s, %s}", id, description, quantity);
	}




}
