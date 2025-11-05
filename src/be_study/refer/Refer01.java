package be_study.refer;

import java.util.Scanner;

public class Refer01 {

	public static void main(String[] args) {
		
		int n; 		 //값 X	 기본타입 변수
		int num = 0; //값 O  -> 참조타입 변수가 아니니까 null 쓸수없다. 
 
		String s1;	//값 X  	참조타입 변수 
		String s2 = null;  // 참조하는게 없다 ! = null
		
//		System.out.println(n);  // 초기화가 안되어서 출력이 안됩
//		System.out.println(s1); // 초기화가 안되어서 출력이 안됩
//
		System.out.println(num);
		System.out.println(s2);
//		
		Scanner scanner = new Scanner(System.in);
		
		String t1 = "사과"; 
		String t2 = "사과";
		String t3 = scanner.nextLine(); //문자열 입력 받기
		String t4 = new String("사과");
		
		System.out.println(t1 == t2);			// 주소 비교
		System.out.println(t1.equals(t2)); // 실제 문자열값 비교
	
		System.out.println(t2 == t3);			// 
		System.out.println(t3.equals(t2)); // 실제 문자열값 비교
		
		System.out.println(t2 == t4);			// 
		System.out.println(t4.equals(t2)); // 실제 문자열값 비교
	
		System.out.println("-----------------------------------------------");
		String ne = null;
		System.out.println(ne == null);			// 
//		System.out.println(ne.equals("사과")); // NullPointerException
//		//참조 타입 변수를 쓰다보면 많이 나오는 오류

		// 값 복사
		 int n1 =10;
		 int n2 = n1;
		 System.out.println(n1);
		 System.out.println(n2);
		 
		 String ss1 = "배";
		 String ss2 = ss1;
		 System.out.println(ss1);
		 System.out.println(ss2);		 

	}

}
