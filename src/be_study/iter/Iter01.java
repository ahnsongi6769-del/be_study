package be_study.iter;

public class Iter01 {

	public static void main(String[] args) {
		// Iteration
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		
//		for(초기화식; 조건식; 증감식) {
//			실행문;}
		
		for(int i=1; i<=10; i++) {
			System.out.println("즐겁다");
		}
		
		int i = 0;
		for(i=1; i<3; i++) {
			System.out.println("화요일");
		}
		
		for(i=35; i<45; i++) {
			System.out.println("실행문1");
		}
		
		
		System.out.println(i);
		System.out.println("다이어트 1일차");
		System.out.println("다이어트 2일차");
		System.out.println("다이어트 3일차");
		System.out.println("다이어트 4일차");
		System.out.println("다이어트 5일차");
		
		for(int j=10; j>5; j--) { // 단순 5회 반복 용도
			System.out.println("다이어트 1일차");
			System.out.println("다이어트 2일차");
			System.out.println("다이어트 3일차");
			System.out.println("다이어트 4일차");
			System.out.println("다이어트 5일차");
		}
		System.out.println("------------------------------------------------------------------------");
		//실행문에서 사용할 목적으로 값을 조정 -> 반복

		for(int j = 1; j<6; j++) {
			System.out.println("다이어트" + j +"일차");
		}
		System.out.println("------------------------------------------------------------------------");
		
		int number = 1+2+3+4+5;
		
		number = number +1;
		number = number +2;
		number = number +3;
		number = number +4;
		number = number +5;
		
		int sum = 0;
		
		
		for(int n=1;n<=5; n++) {
			sum = sum +n;
			}
		System.out.println("최종합" + sum);
		
		int total = 0;
		for(int k=10; k<=100; k=k+10) {
			total = total +k;
		}System.out.println(total);
		
		total = 0;
		for(int k=1; k<=10; k++) {
			total = total +(k*10);
		}
		System.out.println(total);
		
		
		for (int k=2; k<20; k=k*2) {}
			//	k = 2 4 8 16 | 32
		 
		System.out.println(total);
		for (int k=400; k<100; k=k-50) {}
		//		k = 400 350 300 250 200 150 | 100
		System.out.println(total);
		for (int k=100; k>=90; k--) {}
		//		k = 100 99 98 97 96 95 94 93 92 91 90 | 89
		System.out.println(total);
	}

}
