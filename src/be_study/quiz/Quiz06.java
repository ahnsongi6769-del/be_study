package be_study.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
	
		
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("삼각형의 밑변 : ");
//		double num1 = scanner.nextDouble(); 
//		System.out.print("삼각형의 높이 : ");
//		double num2 = scanner.nextDouble();		
//		System.out.println("삼각형의 넓이는 :" + ((double)num1 * num2 / 2));

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
//		System.out.print("사다리꼴의 윗변 : ");
//		double num3 = scanner.nextDouble(); 
//		System.out.print("사다리꼴의 밑변 길이 : ");
//		double num4 = scanner.nextDouble();		
//		System.out.print("사다리꼴의 높이 : ");
//		double num5 = scanner.nextDouble();		
//		System.out.println("사다리꼴의 넓이는 : "  + (num3 + num4)*num5 / 2);

		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
//		
//		int x =24;
//		int y =100;
//		
//		int result1=y/x;
//		int result2=y%x;
//		
//		System.out.println("한명당 과자 갯수는 : "+result1);
//		System.out.println("나머지 과자는 :" + result2);

		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		
		System.out.print("세자리의 정수를 입력하세요 : ");
		int hun = scanner.nextInt(); 
		
		//158
		//158 / 100 => 1.58 => 1
		//158 / 10 => 15.8 => 15
		//158 % 100 => 58
		//158 % 10 => 8
		System.out.println("백의자리 : " + (hun/100));
		System.out.println("십의자리 : " + (hun/10%10));
		System.out.println("일의자리 : " + (hun%10));

//		// 5번
//		x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x1 = 10;
		int y1 = 20;
//		System.out.println("x="+x1+ " y="+y1);
//		//x와 y를 바꾼 작업
		int z = x1;
		x1 = y1;
		y1 = z;

		System.out.println("x="+x1+ " y="+y1);

	}

}
