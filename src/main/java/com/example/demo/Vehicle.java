package com.example.demo;

public abstract class Vehicle implements InterfaceDefault, InterfaceStatic {
	protected int weight;
	
	Vehicle(int weight) {
		this.weight = weight;
	}
	
	abstract void brake();
	
	abstract void printWeight();
}