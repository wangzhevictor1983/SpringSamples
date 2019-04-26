package com.zhe.springbasic.demo;

import org.springframework.stereotype.Service;

@Service
public class CarAnnotation implements CarInterface {

	private String brand = "Lexis";
	private String maxSpeed = "270";
	private String price = "300000.0";
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("brand:"+brand+",maxSpeed:"+maxSpeed+",price:"+price);
	}

}
