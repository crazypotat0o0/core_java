package chapter03;

public class IdentifyChar {
	public static void main(String[] args) {
		char 变量 = 0;
		System.out.println(Character.isJavaIdentifierStart(变量));
		System.out.println(变量);
		System.out.println(0.0 / 0);
		System.out.println(3 % 5);
		System.out.println(-3 % 5);
		System.out.println(3 % -5);
		System.out.println(-3 % -5);
		String s = "";
		s.equals("");
		s = null;
		s.charAt(0);
	}
}
