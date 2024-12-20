package com.example.Employees;

public class TestAccess {
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.setName("Annirudh");
		emp.setAge(25);
		emp.setCname("Kala");
		emp.setSalary(10000);
		
		System.out.println(emp.displayEmployeeDetails());
		
		Employee kunal = new Employee("Kunal", 22, "Kala", 100000);
		System.out.println(kunal);
	}
}
