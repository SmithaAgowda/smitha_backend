package com.demo;

public class Emp {
	
	int id;
	String name;
	String dept;
	String desig;
	
	
	public Emp(int id, String name, String dept, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getDesig() {
		return desig;
	}


	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	@Override
	public String toString() {
		
		return this.id + " " +this.name +" "+this.dept + " "+this.desig;
	}


}
