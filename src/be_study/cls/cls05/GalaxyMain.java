package be_study.cls.cls05;

import java.util.Scanner;

public class GalaxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("정적:" + Galaxy.madeBy);
		Galaxy.showMadeBy();
		
		Galaxy g1 = new Galaxy();// 인스턴스 객체 생성
		g1.owner = "엄마";
		g1.model = "갤러시10";
		System.out.println(g1.madeBy); // 원래는 이렇게 사용하는게 올바른 사용법 Galaxy.madeBy 
		g1.showInfo();
		g1.showMadeBy();
		
		Galaxy g2 = new Galaxy();// 인스턴스 객체 생성
		g2.owner = "아빠";
		g2.model = "갤러시24";
		System.out.println(g2.madeBy);
		g2.showMadeBy();
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		
	}

}
