package be_study.quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
	 // 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고 
	//	합계와 평균을 이용하여 합격/불합격 처리하는 기능을 구현하세요
	//	(합격 조건 세과목의 점수가 각각 40점 이상 이면서 평균이 60점 이상일 경우)
	// 합격했을경우 과목별 점수와 합계, 평균 "축하합니다. 합격입니다!"를 출력하고
	// 불합격인 경우에는 "불합격입니다" 를 출력하세요 
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("국어");
//		int score1 = scanner.nextInt();
//		System.out.print("수학");
//		int score2 = scanner.nextInt();
//		System.out.print("영어");
//		int score3 = scanner.nextInt();
//
//		int total = score1 +score2 +score3;
//		double average = (score1 +score2 +score3)/3;
//		if(score1>=40 && score2>=40 &&score3>=40 && average>=60) {
//			System.out.println("국어점수"+score1);
//			System.out.println("수학점수"+score2);
//			System.out.println("영어점수"+score3);
//			System.out.println("국어"+score1);
//			System.out.println("수학"+score2);
//			System.out.println("영어"+score3);
//			System.out.println("합계"+ total);
//			System.out.println("평균"+ (double)average);
//			System.out.println("축하합니다.함격입니다.");
//		}else {
//			System.out.println("국어점수"+score1);
//			System.out.println("수학점수"+score2);
//			System.out.println("영어점수"+score3);
//			System.out.println("불합격입니다.");
//		}
		
		//선생님 버전
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수:");
		int lang = scanner.nextInt();
		System.out.print("수학점수:");
		int math = scanner.nextInt();
		System.out.print("영어점수:");
		int eng = scanner.nextInt();
		
		//합격 기준 : 과락 40점 -> 40점 이상 , 평균 60점
		
		int total = lang + math + eng; // 총합점수
		double avg = (double)total /3; // 계산에 참여하는 변수를 실수형태로 바꿔줘야함
		
		
		if(lang>=40 && math>=40 && eng>=40 && avg>=60) {
			//합격
			System.out.println("국어"+lang);
			System.out.println("수학"+math);
			System.out.println("영어"+eng);
			System.out.println("합계"+ total);
			System.out.println("평균"+ avg);
			System.out.println("축하합니다.함격입니다.");
		}else { //불합격
			System.out.println("불합격입니다.");
		}
		
		//불합격 조건을 먼저 건다면 ?
		//if((lang>=40 && math>=40 && eng>=40 && avg>=60)==false) {
			//불합격 }
		if(lang<40 || math <40 || eng<40 || avg <60) {
			//불합격 || 연산자는 이 중에 하나라도 true 라면 모두 true
		}else {
			//합격
		}
		
		
		
	}

}
