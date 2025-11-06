package be_study.refer;

public class Arr01 {

	public static void main(String[] args) {
		
		
		//Arr 배열 = 참조타입 변수 = 주소를 가지고 있다
		
		int score1 = 100;
		int score2 = 50;
		int score3 = 75;
		int score4 = 80;
		int score5 = 40;

		int sum = 0;
		sum = score1 +score2+score3+score4+score5;
		
		double avg = sum / 5.0;
		
		System.out.println("총점 :" + sum + " 평균 : " + avg);
			
		// 점수들 ~
		
		int[] scoreArr= {100, 50, 75, 80, 40};
		//index           0   1   2   3   4
		
		sum =0;
		sum = scoreArr[0] + scoreArr[1] +scoreArr[2] +scoreArr[3] +scoreArr[4];
		
		System.out.println("총점 :" + sum + " 평균 : " + avg);
		
		
	
		sum = sum +scoreArr[0];
		sum = sum +scoreArr[1];
		sum = sum +scoreArr[2];
		sum = sum +scoreArr[3];
		sum = sum +scoreArr[4];
		
		//index : 01234 
		sum=0;
		for(int i=0;i<5; i++) {
			sum = sum + scoreArr[i];
		}
		
		System.out.println("총점 : " + sum);
		
		//int[] poinArr; // 단순선언
		int[] pointArr = null; // null 값 초기화
		// pointArr = { 30,12,10,5,1} // 불가능한 사용 방법
		
		pointArr = new int[] {30,12,10,5,1}; // 사용가능
		
		pointArr = new int[5]; // 사이즈(공간)을 명시하면서 생성
		
		//int n;
		//n = 30;
		//pointArr =>
		
		//index 01234
		pointArr[0] = 30;
		pointArr[1] = 12;
		pointArr[2] = 10;
		pointArr[3] = 5;
		pointArr[4] = 1;
		//pointArr[5] = 50; 사용불가 인덱스 범위 벗어남
		
		//저장하고싶은값 : 12345
		//index 값 : 01234 
		
		for(int i=0; i<5; i++) {
		pointArr[i]=i+1;
		}
		
//		for(int i=0; i<5; i++) {
//			pointArr[i-1]=i;
//		}
		
		//배열 index : 0~ 
		for(int i=0; i<5; i++) {
			System.out.print(pointArr[i]+"");
		}
		System.out.println();
		System.out.println(pointArr);
		
		
		//초기값 확인
		int[]intArr = new int[6];
		double[] doubleArr = new double[12];
		String[] stringArr = new String[30];
		boolean[] booleanArr = new boolean[14];
		
//		for(int i =0; i <6; i++) {
		for(int i =0; i <intArr.length; i++) {
		System.out.print(intArr[i]+ " ");
		}
		System.out.println();
		for(int i =0; i <doubleArr.length; i++) {
			System.out.print(doubleArr[i]+ " ");
		}
		System.out.println();
		for(int i =0; i <stringArr.length; i++) {
			System.out.print(stringArr[i]+ " ");
		}
		System.out.println();
		for(int i =0; i <booleanArr.length; i++) {
			System.out.print(booleanArr[i]+ " ");
		}
		System.out.println();
		
	
	}

}
