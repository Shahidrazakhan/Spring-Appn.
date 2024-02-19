package com.shahid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {

	private int empId;
	private String empName;
	private double salary;
	@Autowired
	@Qualifier("oldAdd")
	private AddressBean addr;
	
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public AddressBean getAddr() {
		return addr;
	}

	public void setAddr(AddressBean addr) {
		this.addr = addr;
	}
	
	public void Employee()
	{
		System.out.println(getEmpId());
		
		
	}
	
	
}
