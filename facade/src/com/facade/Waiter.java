package com.facade;
public class Waiter {
	public static String deliverFood(FoodType foodtype){
		switch(foodtype){
			case Pasta:
				Pasta pasta = new Pasta();
				String pastaItems=Ingredient.getPastaItems();
				pasta.prepareFood(pastaItems);
				return pasta.deliverFood();
			case Pizza:
				Pizza pizza = new Pizza();
				String pizzaItems=Ingredient.getPizzaItems();
				pizza.prepareFood(pizzaItems);
				return pizza.deliverFood();
		}
	return null;
	}
}
