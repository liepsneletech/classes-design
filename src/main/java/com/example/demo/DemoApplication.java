package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ElectricCar car1 = new ElectricCar(4000, "Tesla", "yellow");
		DieselCar car3 = new DieselCar(1700, "Mercedes-benz", "green");
		PetroliumCar car2 = new PetroliumCar(1500, "Toyota", "black");

		Car[] arrOfCars = { car1, car2, car3 };

		for (Car car : arrOfCars) {
			car.brake();
		}
	}

	public void callCarBrake(Car car) {
		car.brake();
	}
}
