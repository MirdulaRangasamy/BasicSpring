package com.mirdu.BasicSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle{
	private int regno;
	private int cc;
	private String model;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int regno, int cc, String model) {
		super();
		this.regno = regno;
		this.cc = cc;
		this.model = model;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Bike [regno=" + regno + ", cc=" + cc + ", model=" + model + "]";
	}
	public void drive() {
		System.out.println("I am riding a bike");
	}
}
