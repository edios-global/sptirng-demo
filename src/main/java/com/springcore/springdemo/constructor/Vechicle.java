package com.springcore.springdemo.constructor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Vechicle  implements InitializingBean ,  DisposableBean{
	
	private int vehHorsepower;
	private String driverName;
	private Engine  vEngine;
	
	public Vechicle(String vehHorsepower, int  driverName, Engine vEngine) {
		System.out.println("constructor String , String , Engine");
		this.vehHorsepower = Integer.parseInt(vehHorsepower);
		this.driverName = "sonu";
		this.vEngine = vEngine;
	}
	
	public Vechicle(int vehHorsepower, String driverName, Engine vEngine) {
		super();
		this.vehHorsepower = vehHorsepower;
		this.driverName = driverName;
		this.vEngine = vEngine;
		System.out.println("constructor int , String , Engine");

	}
	@Override
	public String toString() {
		return "Vechicle [vehHorsepower=" + vehHorsepower + ", driverName=" + driverName + ", vEngine=" + vEngine + "]";
	}
	public void destroy() throws Exception {
		System.out.println("destory");
		
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after property set");
		
	}
	
	
}
