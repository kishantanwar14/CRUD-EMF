package com.connect2java;

import curdoperation.Employee;

public class EmployeeService {
	 public static void main(String[] args) {
	        
	        EmployeeDAO empDAO = new EmployeeDAO();
	        
	        Employee createEmp1 = new Employee(1, "Sachin","S&D");
	        Employee createEmp2 = new Employee(2, "Rohit","R&D");
	        Employee createEmp3 = new Employee(3, "Rohan","Sales");
	        Employee createEmp4 = new Employee(4, "Ram","Sales");
	        Employee createEmp5 = new Employee(5, "Ram","Marketing");
	        
	       
	        empDAO.insert(createEmp1);//Create
	        empDAO.insert(createEmp2);//Create
	        empDAO.insert(createEmp3);//Create
	        empDAO.insert(createEmp4);//Create
	        empDAO.insert(createEmp5);//Create
	        
	        
/*          Employee readEmp = empDAO.get(1);//Read 
	        Employee readEmp1 = empDAO.get(2);//Read 
	        System.out.println(readEmp);
	        System.out.println(readEmp1);
	        
	        Employee updateEmp = new Employee(2,"Sachin sharma","Business");        
	        empDAO.update(updateEmp);//Update
	        
	        */
	        
	        //empDAO.delete(1); //Delete
	        
	    }
}




