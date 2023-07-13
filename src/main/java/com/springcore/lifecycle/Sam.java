package com.springcore.lifecycle;

public class Sam {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setting price");
	}

	public Sam() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sam [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method:hey");
	}
	public void destroy() {
		System.out.println("Inside destroy method:bye bye i am detroyed");
	}

}
