package com.composite;

public class CompositeTest {

	public static void main(String[] args) {
		System.out.println("Name: Sameeksha Gupta\nRoll No.: 22BCP343");
		Component hd = new Leaf(4000, "Harddrive");
		Component mouse = new Leaf(500, "Mouse");
		Component monitor = new Leaf(8000, "Monitor");
		Component ram = new Leaf(3000, "RAM");
		Component cpu = new Leaf(9000, "CPU");
		Composite ph = new Composite("peri");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("Motherboard");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		ram.showPrice();
		ph.showPrice();
		computer.showPrice();
	}

}
