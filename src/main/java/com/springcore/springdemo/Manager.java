package com.springcore.springdemo;

public class Manager {
	private String managerName;
	private int mangerId;
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getMangerId() {
		return mangerId;
	}
	public void setMangerId(int mangerId) {
		this.mangerId = mangerId;
	}
	@Override
	public String toString() {
		return "Manager [managerName=" + managerName + ", mangerId=" + mangerId + "]";
	}
	

}
