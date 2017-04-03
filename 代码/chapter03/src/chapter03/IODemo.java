package chapter03;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class IODemo {
	public static void main(String[] args) throws IOException{
//		Scanner in = new Scanner(Paths.get("C:\\Users\\Administrator\\Desktop\\a.txt"));
		
		int[] arr = new int[] {2,3,4,5,6,7};
		
		System.out.println(Arrays.deepToString(arr));
	}
}
