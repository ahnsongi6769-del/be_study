package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
//		1.
//		2x + 4y = 10 이 만족하는
//		모든 x, y 쌍을 구하시오.
//		(x와 y는 자연수 1~10)
	   //x = 1,2,3
	  // y = 1,2
	
//		for(int x=1; x<10; x++){
//			for(int y=1; y<10; y++ ) {
//				
//				if((2*x)+(4*y)==10) {
//					System.out.println(x +" "+ y);
//				}
//			}
//		}

		
		
//		2.
//		정수 2개를 입력 받아서,
//		아래 계산 결과를 출력하시오.
//		큰수 - 작은수

		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자 2개를 입력하세요:");
//		int n1 = scanner.nextInt();
//		int n2 = scanner.nextInt();
//			if(n1>n2) { //true n1 크다
//				System.out.printf("%d-%d =%d\n", n1,n2,n1-n2);
//			}else {
//				System.out.printf("%d-%d =%d\n", n2,n1,n2-n1);
//			}
	
//		3.
//		윷놀이 게임
//		4개의 윷을 입력받고 결과를 출력하시오.
//		(뒷도는 없습니다!)
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개
		
		System.out.println("윷 4개 입력 (0 or1)");
//		int n1,n2,n3,n4;
//		n1 = scanner.nextInt();
//		n2 = scanner.nextInt();
//		n3 = scanner.nextInt();
//		n4 = scanner.nextInt();
			
//		int count = n1+n2+n3+n4;
		int count = 0;
		int[] arr = new int[4];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
			count = count + arr[i];
		}
		
		switch(count) {
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윳");
			break;
			default:
				System.out.println("모");
				break;
				
		}
			
			
			
			
//		4. 입력받은 수 만큼 별 출력하기
//		ex) 4
//		****
//		5
//		*****
		
		
//		int n = scanner.nextInt();
//		
//		for(int i=1; i<n; i++) {
//			System.out.print("*");
//		}
//		
		
		
		
		

	}

}
