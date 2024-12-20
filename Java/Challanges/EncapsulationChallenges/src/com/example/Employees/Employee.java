package com.example.Employees;

class Employee {
	private String name ;
	private long salary;
	private int age;
	private String Cname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Employee() {
		
	}
	
	
	public Employee(String name,int age, String cname, long salary ) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		Cname = cname;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + ", Cname=" + Cname + "]";
	}
	
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	
	String displayEmployeeDetails() {
		return " ******* Employee Details ******* \nName : "+ name + "\nAge : " + age + "\nSalary : " + salary + "\nCrush Name : " + Cname;
	}
	
}
