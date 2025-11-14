package be_study.cls.cls05;

import java.util.Scanner;

public class Galaxy {
	
	
	//필드변수
	
	//인스턴스 멤버 - > 변수 만든다 
	
	String owner; // 소유자
	String model; // 갤럭시 10 20 25 25plus 25ultra
	
	//정적멤버 -> static 변수 
	static String madeBy = "삼성";
	// 객체생성을 안해도 이미 존재한다라고 보면 된다. 
	// 클래스 공통으로 사용하는 !  (각자 객체들에서 접근해도 동일하게 적용된다)
	 
	//메소드
	//인스턴스 메소드 
	void showInfo() {
		System.out.println(owner + "님의 " + model+" 상품 입니다.");
		System.out.println("근데 저는" + madeBy+" 에서 만들어졌어요");
	}
	
	static void showMadeBy() {
		System.out.println(madeBy + "에서 만든 갤럭시 상품입니다.");
		//System.out.println(owner + "님의 것입니다. ");
		// static 메소드에서 인스턴스 멤버 변수에는 접근이 안된다. 
		

	
	}
	
	
}
