package be_study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); // 스캐너 사용시 필요 import java.util.Scanner;
		
		int num1 = scanner.nextInt();
		
		int num2 = 10;
		
		boolean b1 = (num1 == num2);
		
		System.out.println(b1);
		
		scanner.nextLine(); // 앞에 남은 엔터(\n) 청소용 
		
		String str1 = scanner.nextLine();
		String str2 = "햄버거";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2 );
		System.out.println(str1 .equals(str2));
		System.out.println(str1 .equals(str1));
		System.out.println(str1 .equals("햄버거"));
	}

}
