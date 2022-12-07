package com.mirdu.BasicSpring;

import org.springframework.stereotype.Component;

@Component("vv")
public class Car implements Vehicle {
	private int regno;
	private String color;
	private String model;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int regno, String color, String model) {
		super();
		this.regno = regno;
		this.color = color;
		this.model = model;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [regno=" + regno + ", color=" + color + ", model=" + model + "]";
	}
	public void drive() {
		System.out.println("I am driving a car...");
	}
	
}
