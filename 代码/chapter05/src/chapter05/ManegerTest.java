package chapter05;

/**
 * 演示继承
 *
 */
public class ManegerTest {

	public static void main(String[] args) {
		// 创建经理对象
		Maneger boss = new Maneger("zhangsan", 12000, 1992, 7, 17);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		
		staff[0] = boss;
		staff[1] = new Employee("lisi", 5000, 1840, 7, 7);
		staff[2] = new Employee("zhaoliu", 6000, 1952, 5, 12);
		
		for (Employee e : staff) {
			System.out.println("name=" + e.getName() + " , salary=" + e.getSalary());
		}

	}

}
