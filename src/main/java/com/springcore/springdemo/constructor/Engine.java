package com.springcore.springdemo.constructor;

public class Engine {
	private String enType;
	private int engNuber;
	
	public Engine(String type , int num) {
		
		this.enType   = type;
		this.engNuber = num;
	}

	@Override
	public String toString() {
		return "Engine [enType=" + enType + ", engNuber=" + engNuber + "]";
	}
	
	
	

}
