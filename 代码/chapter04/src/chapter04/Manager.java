package chapter04;

public class Manager extends Employee {
	{
		System.out.println("this run....");
	}
	
	static {
		System.out.println("this static run....");
	}

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		// TODO Auto-generated constructor stub
		System.out.println("this constructor run..." + name);
	}


}
