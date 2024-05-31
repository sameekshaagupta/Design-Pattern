package com.facade;
public class Pizza implements Food {
	public String preparedItems;
	public void prepareFood(String itemsRequired){
		preparedItems = "Thin crust pizza with " + itemsRequired;
	}
	public String deliverFood(){
		return preparedItems;
	}
}