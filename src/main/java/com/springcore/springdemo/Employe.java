package com.springcore.springdemo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employe {
	
	private int empId;
	private String empName;
	private String empAddress;
	private Manager empManager;
	private List<String> empFriends;
	private Set<Integer> empMobileNumbers;
	private Map<Long , String> empAdharNumbers;
	
	
	public void init() {
		
		System.out.println("init method");
	}
	
	public void destroy() {
		
		System.out.println("dsestroying  method");
	}
	
	
	//GETTER AND SETTER FOR PROPERTY INJECTION
	
	public Set<Integer> getEmpMobileNumbers() {
		
		return empMobileNumbers;
	}
	public List<String> getEmpFriends() {
		return empFriends;
	}
	public void setEmpFriends(List<String> empFriends) {
		this.empFriends = empFriends;
	}
	public void setEmpMobileNumbers(Set<Integer> empMobileNumbers) {
		System.out.println("setting mobile numbers");
		this.empMobileNumbers = empMobileNumbers;
	}
	public Map<Long, String> getEmpAdharNumbers() {
		return empAdharNumbers;
	}
	public void setEmpAdharNumbers(Map<Long, String> empAdharNumbers) {
		this.empAdharNumbers = empAdharNumbers;
	}
	public Manager getEmpManager() {
		return empManager;
	}
	public void setEmpManager(Manager empManager) {
		this.empManager = empManager;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empManager="
				+ empManager + ", empFriends=" + empFriends + ", empMobileNumbers=" + empMobileNumbers
				+ ", empAdharNumbers=" + empAdharNumbers + "]";
	}
	
	

}
