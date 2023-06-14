package com.example.demo;

public interface InterfaceDefault {
	default void hasEngine(boolean p_has_engine) {
		System.out.println("The vehicle has an engine: " + p_has_engine);
	}
}
