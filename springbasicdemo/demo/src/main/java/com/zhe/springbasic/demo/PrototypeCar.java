package com.zhe.springbasic.demo;

import com.zhe.springbasic.demo.CarInterface;

public class PrototypeCar implements CarInterface {

	private String brand = "Prototype";
	private String maxSpeed = "300";
	private String price = "350000.0";
	private static int index = 0;
	
	public void run() {
		// TODO Auto-generated method stub	
		System.out.println("brand:"+brand+",maxSpeed:"+maxSpeed+",price:"+price + ",index:" + index++);
	}

}
