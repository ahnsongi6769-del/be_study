package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		1.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		몇번째 수인가요? : 그에 해당하는 수를 출력
//		ex) 10 20 30 50 90
//		몇번째 수인가요? 5
//		결과 : 90
//		System.out.print("정수 입력 : ");
//		int num1 = scanner.nextInt();
//		System.out.print("정수 입력 : ");
//		int num2 = scanner.nextInt();
//		System.out.print("정수 입력 : ");
//		int num3 = scanner.nextInt();
//		System.out.print("정수 입력 : ");
//		int num4 = scanner.nextInt();
//		System.out.print("정수 입력 : ");
//		int num5 = scanner.nextInt();
//		
//		int[] arr3 = {num1,num2,num3,num4,num5};
//		for(int i=0; i<5; i++) {
//			System.out.print( arr3[i]);
//		}
//		System.out.println();
//		System.out.print("몇번째 수인가요? ");
//		int num6 = scanner.nextInt();
//	
//		System.out.println("결과 :" +arr3[num6-1]);
		
		
//		2.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		받은후에 순서를 거꾸로 출력하세요.
//		ex) 1 2 3 4 5
//		결과 : 5 4 3 2 1
		
//		System.out.print("정수 입력 : ");
//		int n1 = scanner.nextInt();
//		System.out.print("정수 입력 : ");
//		int n2 = scanner.nextInt();
//		System.out.print("정수 입력 : ");
//		int n3 = scanner.nextInt();
//		System.out.print("정수 입력 : ");
//		int n4 = scanner.nextInt();
//		System.out.print("정수 입력 : ");
//		int n5 = scanner.nextInt();
//		
//		int[] intArr= new int [5];
//		for(int i=0; i<intArr.length; i++) {    //0 +5 1 +3 2+1 3 4
//			System.out.print((i+1) +"정수 입력 : ");
//			int n1 = scanner.nextInt();
//			intArr[i] = n1;
//		}
//		for(int i=0; i<intArr.length; i++) {
//			System.out.print(intArr[i]);
//		}
//		for(int i=0; i<intArr.length; i++) { // 0 1 2 3 4
//			// 1 2 3 4 5
//			for(int j=1; j<intArr.length; i++){ // 1 2 3 4
//				if(intArr[i] > intArr[j]){// if 10  < 5
//					
//					// 7 4 6 9 11 -> 4 6 7 9 11
//					// 0 1 2 3 4 
//					// 7 > 
//					// intArr[1] = intArr[0]
//					// int a = 0;
//					// a = 1;
//					// 1 = 0
//					// 0 = 7;
//					 
//				}
//			
//			}
//		}
//		
		
		
		
		
		/*
		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		1   2   3   4
		5   6   7   8
		9  10 11 12
		13 14 15 16
		*/
		
		//int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
		int[][] arr = new int[4][4];
		
		//값 저장
		int n = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				// i: 0 0 0 0 1 1 1 1 2 2 2 2 3 3 3 3
				// j: 0 1 2 3 0 1 2 3 0 1 2 3 0 1 2 3
				// n: 1 2 3 4 5 6 7 8 9 ...         16
				// arr[0][3] = 4   arr[1][3] = 8    arr[3][3] = 16
				
				arr[i][j] = n;  // 1씩 증가하면서 저장
				n++;
				//n = n + 1;
				
//				arr[i][j] = i*4 + (j+1);  // i j 를 활용한 수식
				
				// arr[i][j] = n++;
			}
		}
		
		//값 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
