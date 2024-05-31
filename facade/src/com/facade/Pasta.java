package com.facade;
public class Pasta implements Food {
	public String preparedItems;
	public void prepareFood(String itemsRequired){
		preparedItems = "Pasta with " + itemsRequired;
	}
	public String deliverFood(){
		return preparedItems;
	}
}
