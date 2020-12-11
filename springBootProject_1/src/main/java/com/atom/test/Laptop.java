package com.atom.test;

import org.springframework.stereotype.Component;

//import lombok.Data;

//@Component // creates object with name of class name
@Component("lap1") //creates object custom object name 
public class Laptop {

	private int id;
	private String brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + "]";
	}
	
	public void compile() {
		System.out.println("Compiling...");
	}
	
	
}
