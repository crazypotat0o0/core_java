package chapter03;

import java.util.Date;

public class PrintfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%,.2f\n", 10000.0 / 3);
		System.out.printf("%tc", new Date());
	}

}
