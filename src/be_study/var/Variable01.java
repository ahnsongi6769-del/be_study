package be_study.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수를 선언
		//타입 변수명
		// int 타입 : 정수형 숫자 타입 (목적이 정해져 있는 타입)
		
 		int abc; // 변수 선언
 		int def; // 정수형 숫자타입이 변수
 		
 		int point; //선언 
 		int score;
 		
 		score=90; // score 라는 변수에 90이란 값을 저장
 		// int score = 90;
 		
 		int s;
 		
// 		int x;
// 		int y;
// 		int z;
 		
 		int x,y,z;
 		
 		//level =99; 선언하지 않은 변수면 사용 불가능
 		int level; // 선언한 라인 보다 아래에서 사용 
 		
 		int math = 99; // 선언과 동시에 저장 = 초기화
 		
 		int time; // 변수 선언만 한 것
 		time = 12; //  12값 저장
 		time = 13; // 13 값 저장 -> 12는 덮어쓰기가 됨 
 		
 		int myTime = 10 + 5 -2;//연산 가능
 		myTime = time +5;
// 		time = 20;
 		myTime = time + 4 + time - 1 + time;
 		//        13 + 4 +13 + -1 +13 ;
 		//			42
 		
// 		int vlaue; //value 변수 선언만 !
//  		int result = value + 5; //초기화되지 않은 수는 연산 불가 
 		
 		
  		int value = 20; //value 변수 선언만 !
  		int result = value + 5; //초기화되지 않은 수는 연산 불가 
 		
  		//출력
  		System.out.println("문자를 넣으면 출력");
  		
  		System.out.println(12354);
  		System.out.println(value);
  		System.out.println(result);
//  		System.out.println(level);
//  		// level 초기화 되지 않은 변수
  		System.out.println(result + 50);
  		
  		
  		System.out.println(result + value + result + value);
// 		코드는 위에서 아래로 인식이 되기 떄문에 , 그 시점에 어떤 값인지 확인 필요 
  		
  		int totalScore = score + score + 50 ;
  		System.out.println(totalScore);
  		System.out.println(totalScore + 30);
  		System.out.println(totalScore);
  		
  		totalScore = totalScore + 70; // = 연산자는 자바에서 저장이라는 뜻
  		System.out.println(totalScore);
  		System.out.println(score);
  		
  		int a = 10;
  		int b = 20;
  		// a=10 b=20
  		System.out.println(a);
  		System.out.println(b);
  		
  		//a = b;
  		//b = a;
  		//값 바꾸기
  		// a:20 b:10
  		int c = a; // a:10 b:20 c:10
  		a = b;     //a:20 b:20 c:10
  		b = c;     //a: 20 b:1 c:10
  		
 		}

}
