package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	1. 아래 1), 2) 에 맞게 풀이.
	int x = 10;
	int y = 4;
//	___result = ___x/y;
//	System.out.println(result);
//
//	1) 결과가 2가 나오도록 작성하세요
	int result1 = x / y;
	System.out.println(result1);
//	2) 결과가 2.5가 나오도록 작성하세요
	double result2 =(double) x / y;
	System.out.println(result2);
//	2. 결과가 7.5가 나오도록 작성하세요
	double a = 3.5;
	double b = 4.7;
	double result3 = a + (int)b;
	System.out.println(result3);
//
//	3. 계산결과가 12가 나오도록 작성하세요
	String a1 = "3.4";
	String b1 = "4";
	Double.parseDouble(a1);
	Integer.parseInt(b1);
	int result4 = (int)Double.parseDouble(a1)*Integer.parseInt(b1);
	System.out.println(result4);
//

//
//	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
	String a2 = "10";
	int b3 = 3;
	double c3 = 4.5;
	System.out.println(a2+((int)(b3*c3)));
//
//
//	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
	int a4 = 4;
	double b4 = 3.4;
	String c4 = "6.8";
	Double.parseDouble(c4);
	String str =String.valueOf(b4);
	String result5 = (a4 * (int)Double.parseDouble(c4))+String.valueOf((int)b4);
	System.out.println(result5);

//	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
//	int x = 111;
//	int y = 13;
//	int result = _____;
//	System.out.println(result);
//
//	1) 출력결과 : 7
//	2) 출력결과 : 8
	
	int x6 = 111;
	int y6 = 13;
	
	int result61 = x6%y6;
	System.out.println(result61);
	
	int result6 = x6/y6;
	System.out.println(result6);
	
	
	}

}
