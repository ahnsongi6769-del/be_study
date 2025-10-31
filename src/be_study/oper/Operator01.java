package be_study.oper;

public class Operator01 {

	public static void main(String[] args) {
		
		//  산술 연산자 ( + _ * / % )
		
		System.out.println( 1+1 );
		System.out.println( 10-5);
		System.out.println( 5*9 );
		System.out.println( 30/7 );
		System.out.println((double)30/7);
		System.out.println(30/7.0);
		System.out.println( 9%5 );
		System.out.println( 28%9 );
		
		// 부호 연산자 ( + - )
		System.out.println(10);
		System.out.println(+10);
		System.out.println(-10);
		System.out.println(-(-10));
		
		
		// 증감 연상자 ( ++ -- ) 1증가 1감소
//		++변수  증가 먼저
//		변수 ++ 증가 나중
		System.out.println("================증감연산자 연습=======================");
		
		int x = 10;
		System.out.println(x);
		System.out.println( ++x );
		System.out.println(x); // 여기 기준으로 x=11
		
		System.out.println(1+x);
		System.out.println(x);//x=11
		System.out.println(x++);
		System.out.println(x);
		
		int y =8;
		System.out.println(y--);
		System.out.println(--y);
		System.out.println(y);
		
		int z = 30;

		System.out.println( z + 1);
		System.out.println( z++);
		System.out.println( z);
		
		z++;
		++z;
		z = z + 1;
		
		int q = 1;
		int w = 3;
		int e = 10 + ++q;
		int r = 3 + w--;
		
		System.out.printf("%d %d %d %d\n", q, w, e, r);
		
		
		//논리 부정 ! true false
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry);
		System.out.println(isHungry);
		System.out.println(true);
		System.out.println(false);
		System.out.println(!true);
		System.out.println(!false);
	
		isHungry = false;
		isHungry = !isHungry;
		
		// 문자열 결합 연산자 + 
		System.out.println(133 + 3.345 +"문자");
		
		System.out.println("==============비교 연산자 연습 (boolean 타입)================");
		// ! = 부정
		System.out.println(1 == 2); // 두 값이 같은지 검사
		System.out.println( 1 !=2 ); // 두 값이 다른지 검사
		System.out.println( 3 < 5);
		System.out.println(10 >= 9);
		System.out.println(4 > 4);
		System.out.println(9 <= 1); 
		boolean b1 = ( 9 > 8);
		
		
		System.out.println("==============논리 연산자 연습 (boolean 타입)================");
		// AND - && , OR - ||
		
		boolean b2 = (10 > 6) && (10>5);
		System.out.println(b2);
		
		boolean b3 = ( 5 !=1) || (10<4);
		System.out.println(b3);
		
		boolean b4 = (2 >= 1) && !(3<4);
		System.out.println(b4);
		
		
		System.out.println("=================대입 연산자 연습 ===================");
		
		int a = 30;
		a = 50;
		
		a += 30; 	// 앞에 있는 피연산자에 30을 더해서 a에 다시 저장 :  a = a+30
		a -= 10; 	// a = a - 10
		a *=3;		// a = a * 3
		a /=2;		// a=a / 2 
		a %= 4; 	// a=a % 4
  		
		System.out.println("================삼항 연산자(조건) 연습 ===================");
		// 중첩이 가능한 연산자
		int point = 300; // 포인트
		
		// 포인트 200점 까지는 사은품 생수
		// 200점 넘으면 커피 
		// 조건식 ? 앞 : 뒤
		//        참 : 거짓
		
		String eventItem = point > 200 ? "커피" : "생수";
		System.out.println(eventItem);
		
		eventItem = point <= 200 ? "생수" : "커피";
		System.out.println(eventItem);
		System.out.println(point > 50 ? "단골" : "신규");
		
		/* 하기의 내용대로 중첩 가능  
			(조건식) ? 참 : 거짓
			(조건식) ? 참 : ((조건식) ? 참 : 거짓)
		*/
	
		// 0 ~ 200 		: 생수
		// 201 ~ 300 	: 커피
		// 301 ~ 		: 맥주
		point = 350;
		//삼항연산자 조건식 
		System.out.println(point <= 200? "생수" : (point > 300? "맥주" : "커피"));
		
		int num = -30;
		System.out.println(num < 0? "음수": "양수");
		// 음수 0 양수 - >논리 구조를 어떻게 따질거냐 ?
		
		System.out.println(num == 0? "0":(num > 0? "양수": "음수"));
		System.out.println(num != 0? (num < 0? "음수": "양수"):"0");
		
		System.out.println(num > 0 ? "양수" : (num < 0? "음수" : "0"));
		System.out.println(num >= 0 ? (num ==0 ? "0" : "양수"):"음수");
		// 논리구조에 따른 식은 다르지만 모두 같은 값 //
	}

}
