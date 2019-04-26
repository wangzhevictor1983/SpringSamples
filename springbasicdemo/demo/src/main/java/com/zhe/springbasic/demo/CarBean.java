package com.zhe.springbasic.demo;

public class CarBean implements CarInterface {

	/*
	public CarBean(int test) {
		
	}
	*/
	public CarBean() {
		
	}
	private String brand = "Benz";
	private String maxSpeed = "300";
	private String price = "350000.0";
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("brand:"+brand+",maxSpeed:"+maxSpeed+",price:"+price);
	}

}
