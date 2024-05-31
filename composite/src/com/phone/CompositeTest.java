package com.phone;

public class CompositeTest {

	public static void main(String[] args) {
		System.out.println("Name: Sameeksha Gupta\nRoll No.: 22BCP343");
		Component mayo = new Leaf(40, "Mayonaise");
		Component jalepeno = new Leaf(50, "Jalepeno");
		Component corn = new Leaf(20, "Corn");
		Component peprika = new Leaf(100, "Peprika");
		Component basil = new Leaf(120, "Basil");
		Composite crust = new Composite("base");
		Composite sause = new Composite("sause");
		Composite toppings = new Composite("toppings");
		Composite pizza = new Composite("Pizza");
		
		pizza.addComponent(crust);
		
		crust.addComponent(toppings);
		crust.addComponent(sause);
		
		toppings.addComponent(corn);
		toppings.addComponent(basil);
		toppings.addComponent(peprika);
		
		sause.addComponent(mayo);
		sause.addComponent(jalepeno);
		
		pizza.showPrice();
	}

}
