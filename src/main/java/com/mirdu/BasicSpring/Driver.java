package com.mirdu.BasicSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Driver {
	private String name;
	@Autowired
	@Qualifier("vv")
	private Vehicle veh;
	public Driver(String name, Vehicle veh) {
		super();
		this.name = name;
		this.veh = veh;
	}
	public Driver() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVeh() {
		return veh;
	}
	public void setVeh(Vehicle veh) {
		this.veh = veh;
	}
	@Override
	public String toString() {
		return "Driver [name=" + name + ", veh=" + veh + "]";
	}
	
}
