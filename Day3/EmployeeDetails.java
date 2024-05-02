package com.demo;

public class EmployeeDetails implements Comparable<EmployeeDetails> {
	
	private int empid;
	private String name;
	private float sal;
	
	
	EmployeeDetails()
	{
		
	}
	
	
	                                                             
	public EmployeeDetails(int empid, String name, float sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}



	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid)
	{
		this.empid = empid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public float getSal() 
	{
		return sal;
	}
	public void setSal(float sal)
	{
		this.sal = sal;
	}
 
	@Override
	public String toString() {
		
		return "id:" +empid + "name:" +name +"salary:"+sal;
	}


//	@Override
//	public int compareTo(EmployeeDetails o) {
//		
//		return this.empid-o.empid;
//	}
//	
//	@Override
//	public int compareTo(EmployeeDetails o) {
//		
//		return (int) (o.sal-this.sal);
//	}

	@Override
	public int compareTo(EmployeeDetails o)
	{		
		return this.name.compareTo(o.name);
	}




	
	
}
