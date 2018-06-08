package com.basic;

public class Car {
	private String model;
	int i=0;
	private double speed=20;
	public Car() {
		System.out.println("emp cons called" );
	}
	public Car(int speed) {
		this.speed= speed;
		System.out.println("one cons called");
	}
	public Car(int speed,String model) {
		this.speed=speed;
		this .model=model;
		System.out.println("Two cons called");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void accelerate() {
		speed+=10;
	}
	public void accelerate(int speed) {}
	public void accelerate(double speed) {}
	public void accelerate(int speed,String mod) {}
	public void accelerate(String mod,int speed) {}
		
	public void changeInt(int i) {
		i =i+10;
	}
	public static void main(String args[] ) {
		Car car1=new Car(100);
		Car car2 =new Car(100);
		car1.setSpeed(20.0);
		car2.setSpeed(30.0);
		System.out.println(car1.getSpeed());
		System.out.println(car2.getSpeed());
		int count=100;
		car1.changeInt(count);
		System.out.println(count);
		
		
		
	}
	
	
	
			
	}

