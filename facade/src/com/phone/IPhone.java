package com.phone;

public class IPhone implements Phone{
	public String buildedPhone;
	public void buildPhone(String itemsRequired){
		buildedPhone = "IPhone with " + itemsRequired;
	}
	public String deliverPhone(){
		return buildedPhone;
	}
}
