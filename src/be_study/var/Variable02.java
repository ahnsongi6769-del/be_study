package be_study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2진수, 8진수, 10진수, 16진수
		
		int num2 = 0b10; //2진수 표기로 10->실제같은 2 1010  //0010010
		
		int num8 = 012; //8진수 표기로 12 -> 실제 값은 10
		int num10 =10; // 순수 10
		int num16 = 0x30; //16진수 표기 30-> 실제 값음 48 
		
		char chr1 = 'A'; // chat 타임 (정수타입) : 문자 1개 저장용으로 사용 . 꼭 작은 따옴표로 감싸서 저장
		char chr2 = 86;
		char chr3 = 0x023; 
		char chr4 = 'F';
		
		System.out.println(chr1);
		System.out.println(chr2);
		System.out.println(chr3);
		System.out.println(chr4);
		
		char chr5 = '안';
//		char chr5 = '안녕'; char 은 문자1개만 가능
//		문자열 타임 "" 큰 따옴표로 감싼 여러문자
		String s1 ="안";
		String s2 ="녕";
		String s3 ="안녕하세요~";
		String s4 ="1234"; // 연산이 안됨
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		int n = 1234; //정수형
		System.out.println(n+10); //1234 +10 =1244
		System.out.println(s4+10); // "1234" + 10 = "123410" 앞 뒤로 이어붙혀짐
		System.out.println("지금은 " + 16 + "시 입니다.");
		System.out.println("지금은 16시 입니다.");
		
		String msg = "\"안녕\"하세요";
		System.out.println(msg);
		System.out.println("어서\t오세요! \n반갑습니다.");
		
		double d1 = 12.123;
		double d2 = 500.0;
		double d3 = 5e2; // 5*10^2
		double d4 = 0.0012;
		double d5 = 0.12E-2; //0.12 *1/10^2
		
		float f1 = 12.45f; // float 타입은 값 뒤에 f 표기 
		
		// 논리형 true false 참 거짓 
		
		boolean open = true; //true 자체가 예약어 
		boolean close = false;
		boolean stop = false; 
	
		boolean isOpned = true;
		boolean isClosed = false;
		
		boolean hasOption = true;
	}

}
