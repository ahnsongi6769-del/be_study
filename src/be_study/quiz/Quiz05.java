package be_study.quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1번. num 값을 확인하여 "양수" "음수" "0" 이라고 출력하도록 코드를 작성하세요.
		
		int num = 10;
		System.out.println(num == 0? "0":(num > 0? "양수": "음수"));

//		2번. 아래와 같이 프로그램이 진행되면서 숫자 2개를 입력받고 각각의 결과를 출력하세요.
//		ㅇ 모양은 사용자가 입력한 숫자와 계산된 결과입니다.
//		나누기 결과는 소수점을 포함하여 나타나도록 해주세요.

//		첫번째 숫자를 입력하세요 : ㅇ
//		입력한 숫자=ㅇ
//		두번째 숫자를 입력하세요 : ㅇ
//		입력한 숫자=ㅇ

//		더하기 : ㅇ+ㅇ=ㅇ
//		뺴기 : ㅇ-ㅇ=ㅇ
//		곱하기 : ㅇ*ㅇ=ㅇ
//		나누기 : ㅇ/ㅇ=ㅇ
		Scanner scanner = new Scanner(System.in);
//		키보드로 입력을 받을 수 있는 Scanner 객체를 만들어 scanner라는 이름으로 사용하겠다 선언을 하고, 스캐너 사용 가능
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int number = scanner.nextInt(); // 내가 입력한 숫자가 number 로 저장됨 
		System.out.println("입력한 숫자는" + number);
		System.out.print("두번째 숫자를 입력하세요 : ");
		int number1 = scanner.nextInt();		
		System.out.println("입력한 숫자는" + number1);
		
		System.out.println("더하기 :" + number +"+"+ number1 +"="+ (number+number1));
		System.out.printf( "빼기 : %2d -%2d=%2d\n",number,number1,(number-number1) );
		System.out.printf( "곱하기 : %2d *%2d=%2d\n",number,number1,(number*number1) );
		System.out.printf( "나누기 : %2d /%2d=%2.2f\n",number,number1,((double)number/number1) );
		
	}

}
