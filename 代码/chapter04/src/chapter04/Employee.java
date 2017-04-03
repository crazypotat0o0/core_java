package chapter04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private static String name;
	private double salary;
	private Date hireDay;
	{
		System.out.println("Employee run...." + name);
	}
	static {
		System.out.println("Employee static run..." + name);
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public Date getHireDay() {
		return hireDay;
	}
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		Calendar d = new GregorianCalendar(year, month - 1, day);
		this.hireDay = d.getTime();
		System.out.println("Super Constructor run...." + name);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + "]";
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
}
