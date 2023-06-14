package com.example.demo;

public class PetroliumCar extends Car {

	protected String color;

	PetroliumCar(int weight, String model, String color) {
		super(weight, model);
		this.color = color;
	}

	@Override
	public void printModel() {
		System.out.println("The model of this petrolium car is " + this.model);
	}

	public void printColor() {
		System.out.println("The color of the car is " + this.model);
	}

}
