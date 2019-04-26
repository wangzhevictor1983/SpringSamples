package com.zhe.springbasic.demo;

public class Car implements CarInterface{
	private int maxSpeed;
    private String brand;
    private double price;
    
    public Car() {
    	
    }
    
    
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void run(){
        System.out.println("brand:"+brand+",maxSpeed:"+maxSpeed+",price:"+price);
    }

}
