package com.phone;

public class Samsung implements Phone{
	public String buildedPhone;
	public void buildPhone(String itemsRequired){
		buildedPhone = "Samsung with " + itemsRequired;
	}
	public String deliverPhone(){
		return buildedPhone;
	}
}
