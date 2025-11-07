package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.입력 ");
		System.out.println("2.수정 ");
		System.out.println("3.조회 ");
		System.out.println("4.삭제 ");
		System.out.println("5.종료 ");
		System.out.println("메뉴 번호를 입력하세요: ");
		int num1 = scanner.nextInt();
		
		while(true) {
		if( num1==1) {
			System.out.println("입력메뉴입니다.");
			System.out.println("1.입력 ");
			System.out.println("2.수정 ");
			System.out.println("3.조회 ");
			System.out.println("4.삭제 ");
			System.out.println("5.종료 ");
			System.out.println("메뉴 번호를 입력하세요: ");
			num1 = scanner.nextInt();
		}else if (num1==2) {
			System.out.println("수정메뉴입니다.");
			System.out.println("1.입력 ");
			System.out.println("2.수정 ");
			System.out.println("3.조회 ");
			System.out.println("4.삭제 ");
			System.out.println("5.종료 ");
			System.out.println("메뉴 번호를 입력하세요: ");
			num1 = scanner.nextInt();
		}else if (num1==3) {
			System.out.println("조회메뉴입니다.");
			System.out.println("1.입력 ");
			System.out.println("2.수정 ");
			System.out.println("3.조회 ");
			System.out.println("4.삭제 ");
			System.out.println("5.종료 ");
			System.out.println("메뉴 번호를 입력하세요: ");
			num1 = scanner.nextInt();
		}else if (num1==4) {
			System.out.println("삭제메뉴입니다.");
			System.out.println("1.입력 ");
			System.out.println("2.수정 ");
			System.out.println("3.조회 ");
			System.out.println("4.삭제 ");
			System.out.println("5.종료 ");
			System.out.println("메뉴 번호를 입력하세요: ");
			num1 = scanner.nextInt();
		}else if(num1==5) {
			System.out.println("프로그램이 종료됩니다.");
			break;
		}else {
			System.out.println("잘못입력하셨습니다.");
			System.out.println("1.입력 ");
			System.out.println("2.수정 ");
			System.out.println("3.조회 ");
			System.out.println("4.삭제 ");
			System.out.println("5.종료 ");
			System.out.println("메뉴 번호를 입력하세요: ");
			num1 = scanner.nextInt();
		}
		
	}


	

	}

}
