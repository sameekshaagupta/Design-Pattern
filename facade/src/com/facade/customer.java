package com.facade;
public class customer {
public static void main(String args[]){
	System.out.println("----Without Facade----");
	//without facade
	Food pasta = new Pasta();
	String pastaItems=Ingredient.getPastaItems();
	pasta.prepareFood(pastaItems);
	System.out.println(pasta.deliverFood());
	Food pizza = new Pizza();
	String pizzaItems=Ingredient.getPizzaItems();
	pizza.prepareFood(pizzaItems);
	System.out.println(pizza.deliverFood());
	//using facade
	System.out.println("----With Facade----");
	System.out.println(Waiter.deliverFood(FoodType.Pasta));
	System.out.println(Waiter.deliverFood(FoodType.Pizza));
	}
}