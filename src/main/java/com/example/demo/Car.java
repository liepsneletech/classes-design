package com.example.demo;

public class Car extends Vehicle {
	protected String model;
	
	Car(int weight, String model) {
		super(weight);
		this.model = model;
	}

	@Override
	public void brake() {
		System.out.println("The car is having a brake");		
	}
	
	@Override
	public void printWeight() {
		System.out.println("The car weight is " + this.weight);
	}
	
	public void printModel() {
		System.out.println("The model of the car is " + this.model);
	}
	
}
