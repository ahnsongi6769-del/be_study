package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {

//		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*****
//		****
//		***
//		**
		
//		int rows1 = 5;
//        // 외부 반복문: 줄(행)의 수를 결정 (5부터 1까지 감소)
//        for (int i = rows1; i >= 1; i--) {
//            // 내부 반복문: 각 줄에서 출력할 별(*)의 개수를 결정 (i개)
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//        
//            System.out.println();
//        }
		
		
		
//		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*
//		**
//		***
//		****
//        int rows2 = 4;
//        // 외부 반복문: 줄(행)의 수를 결정 (1부터 4까지 증가)
//        for (int i = 1; i <= rows2; i++) {
//            // 내부 반복문: 각 줄에서 출력할 별(*)의 개수를 결정 (i개)
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//         
//            System.out.println();
//        }
//        
        
//		3. 입력된 수의 약수를 출력하시오.
//		ex) 입력 : 6
//		1 2 3 6

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("입력 : ");
//        int number = scanner.nextInt(); 
//        
//        System.out.print(number + "의 약수: ");
//      
//        for (int i = 1; i <= number; i++) {  // number를 i로 나누었을 때 나머지가 0이면, i는 약수이다.
//            if (number % i == 0) {
//                System.out.print(i + " ");
//           }
//        }System.out.println();
  
        
        
        
//		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		숫자를 입력받고 아래 문양으로 * 출력하기
//		ex) 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

//        System.out.print("숫자를 입력하세요 : ");
//        int n = scanner.nextInt(); 
//        
//        // 1. 삼각형 (윗부분: 1개부터 n개까지 증가)
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        
//        // 2. 역삼각형 (아랫부분: n-1개부터 1개까지 감소)
//        for (int i = n - 1; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//      


//		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?

//        int totalSum = 0; // 최종 누적 합 (S)
//        int currentSum = 0; // 내부 합 (1+2+...+i)
//        
//        // 외부 반복문: i = 1부터 10까지
//        for (int i = 1; i <= 10; i++) {
//            // 내부 합 계산: 1부터 i까지 더하기
//            currentSum += i;
//            
//            // 최종 합에 현재 내부 합을 더함
//            totalSum += currentSum;
//        }
//        
//        System.out.println("최종 결과: " + totalSum);
		
        //i : 1 2  3   4 ... 10
        //j : 1121231234     12345678910
        
//        int sum1 = 0;
//        for(int i =1; i<=10; i ++) {
//        	for(int j=1; j<=i; j ++) {
//        		sum1 = sum1 + j;
//        	}
//        }
//		System.out.println("누적된 총합 : " + sum1);
		
		
//		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		
        int sum = 0; // 누적 합
        int num = 0; // 현재 더하는/빼는 값 (1, 2, 3, ...)
        int sign = 1; // 부호 (+1, -1)
        
        // 합이 100 이상이 될 때까지 무한 반복
        while (sum < 100) {
            num++; // 다음 숫자 준비
            
            // 현재 숫자에 부호를 적용하여 더함/뺌
            int term = num * sign;
            sum += term;
            
            // 부호 반전 (1 -> -1, -1 -> 1)
            sign *= -1;
        }
        
        System.out.println("총합이 100 이상이 된 시점:");
        System.out.println("누적합: " + sum);
        System.out.println("최종 더해진 숫자까지: " + num);
		
        
        int i = 1;
        int total = 0;
        while(true) {
        	if(i%2 == 0) {//짝수 빼기
        		total = total -i ;
        	}else { // 홀수 더하기 
        		total = total +i;
        	}

        if(total>=100)
        break;
        i++;
        
        }
        
        System.out.println("총합이 100 이상이 된 시점:" + total + " 얼마까지 계산" + i);
        
        
	}

}
