package be_study.test;

import java.util.Random;
import java.util.Scanner;

public class Level0 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		int user = 0;
		int outCount = 0;
		int hitCount = 0;
		
		while(outCount<3) {
				System.out.print("게임시작 ( 1 ~ 10까지 정수를 입력하세요)");
				user = scanner.nextInt();
				int pitcher = (int)(Math.random()*10)+1; 
				System.out.println("투수가 던진 공은? : "+ pitcher);
				if(user == pitcher) {
					hitCount++;
					System.out.println("안타입니다.");
				}else {
					outCount++;
					System.out.println("아웃입니다.");
					
				}
		}
		
				
			
			
			
			
			
			
			
		}

	}

