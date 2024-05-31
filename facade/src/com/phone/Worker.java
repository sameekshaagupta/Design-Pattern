package com.phone;

public class Worker {
	public static String deliverPhone(PhoneType phonetype){
		switch(phonetype){
			case IPhone:
				IPhone iphone = new IPhone();
				String iphoneItems=Parts.getIPhoneItems();
				iphone.buildPhone(iphoneItems);
				return iphone.deliverPhone();
			case Samsung:
				Samsung samsung = new Samsung();
				String samsungItems=Parts.getSamsungItems();
				samsung.buildPhone(samsungItems);
				return samsung.deliverPhone();
		}
	return null;
	}
}
