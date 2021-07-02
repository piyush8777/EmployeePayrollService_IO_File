package com.emppayroll;

public class EmployeePayrollData {
	 public int id;
	    public String name;
	    public double salary;

	    public EmployeePayrollData(int id,String name,double salary){
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }


	    public  String toString(){
	        return "EmployeePayRollData[id=" + id + ",name=" + name + ",salary=" + salary + "]";
	    }

}
