package com.zhe.springbasic.demo;

public class CarConstructorInjection implements CarInterface {
	 private int maxSpeed;
	    private String brand;
	    private double price;
	    

	    public CarConstructorInjection(int maxSpeed,String brand, double price){
	        this.maxSpeed=maxSpeed;
	        this.brand=brand;
	        this.price=price;
	    }
	    
	    public void run(){
	        System.out.println("brand:"+brand+",maxSpeed:"+maxSpeed+",price:"+price);
	    }
	}

