package be_study.homework.task;

public class Array {

	public static void main(String[] args) {
//		🔹 1단계: 기본 배열 연습 (1~10)
//		1. 정수 배열을 만들어 모든 요소를 출력하라.
		int[] num = {1,2,3,4,5};
		System.out.print("1. 정수 배열의 모든 요소는: ");
		for(int i = 0; i<num.length; i++) {
		System.out.print(num[i] +" ");
		}
		System.out.println();
//		2. 길이 5짜리 int 배열을 만들고 2번 인덱스에 50을 넣어라.
		int[] num1 = new int[5];
		System.out.print("2. 2번 인덱스 값은 : ");
		for(int i = 0; i<num1.length; i++) {
			num1[2] = 50;
		}
		System.out.print(num1[2]+" ");
		System.out.println();
//		3. 배열의 길이를 출력하라.
		int [] num2 = {1,2,3,4,5,6}; 
		System.out.println("3. 배열의 길이는: " + num2.length);
		
	
//		4. 배열 요소들의 합계를 구해라.
		int [] num3 = {1,2,3,4,5,6}; 
		int sum = 0;
		for(int i = 0; i<num3.length; i++) {
			sum += num3[i];
			}
			System.out.println("4. 배열 요소들의 합은: "+ sum);
		
//		5. for 문으로 배열 요소들을 출력하라.
			int [] num4 = {1,2,3,4,5,6};
			System.out.print("5. for 문으로 배열 요소 출력 : ");
			for(int i = 0; i<num4.length; i++) {
				System.out.print(num4[i]+" ");
				}
				
			System.out.println();
//		6. int 배열을 매개변수로 받아 평균을 구하는 메서드를 만들어라.
			int [] number = {7,8,9};
			System.out.println("6. 평균을 구하는 매서드 값은: " + avg(number));
			
			
//		7. 배열을 전달받아 가장 큰 값을 리턴하는 메서드를 만들어라.
			int [] number1 = {20,30,40,50};
			int top = topIndex(number1);
			System.out.println("7. 배열 중 가장 큰 값은 : " + top);
			
//		8. 배열을 전달받아 모든 요소를 1 증가시키는 메서드를 작성하라. (원본 변경 확인)
			int [] arr1 = {60,70,80};
			increase(arr1);
			System.out.print("8. 모든 요소를 1 증가 : ");
			for(int i = 0; i<arr1.length; i++) {
				System.out.print(arr1[i]+" ");
				}
			System.out.println();
//		9. 배열을 생성하는 메서드를 만들어라(길이를 받아서 0으로 채워진 배열 리턴).
			
			int [] creation = generation(5);
			
			System.out.print("9. 배열을 생성하는 메서드: ");
			for(int i = 0; i<creation.length; i++) {
				System.out.print(creation[i]+" ");
				}
			System.out.println();
//		10. 배열을 전달하면 역순으로 뒤집어주는 메서드를 만들어라.
			
			int []reverse = {1,2,3,4,5};
			int [] num6 = backwards(reverse);
			System.out.print("10. 배열을 뒤집어주는 매서드: ");
			for(int i = 0; i<reverse.length; i++) {
				System.out.print(num6[i]+" ");
				}
	
			
		
	}
	public static double avg(int[]number) {
		
		int totalSum = 0;
		for (int i = 0; i<number.length; i++) {
			totalSum += number[i];
		}
		
		return totalSum/number.length;
	}
	
	public static int topIndex(int[] arr) {
		int maxCount = 0;
		for (int i = 0; i<arr.length; i++) {
			 if (arr[i] > maxCount ) {
	                maxCount = arr[i];
	            }
		}		
		return maxCount;
	}
	
	public static void increase(int[] arr1) {
		for(int i = 0; i < arr1.length; i++) {
			arr1[i]++;
		}
	}
	
	public static int[] generation(int length) {
		int [] num = new int[length];
		return num;
	}
	
	public static int[] backwards (int[]reverse) {
		int [] num = new int[reverse.length];
		for(int i = 0; i < reverse.length; i++) {
			num[i] = reverse[(reverse.length - 1) - i];
		}
		
		return num;
	}
	
	
}
