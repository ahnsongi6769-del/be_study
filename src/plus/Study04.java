package plus;

import java.util.Scanner;

public class Study04 {

	public static void main(String[] args) {
		// 1~24 중 하나의 정수를 입력받습니다. 범위를 넘어선 값을 입력할 수도 있음.
		// 입력받은 숫자를 보고 아래 기준에 맞게 출력하세요.
		// 1) 범위를 벗어나면, "잘못입력했습니다." 라고 출력
		// 2) 시간<=12 오전입니다. 시간>12 오후입니다.
		// 3) 1~6시 이른 오전입니다. 7~12 늦은 오전입니다.
		// 4) 13~18시 이른 오후입니다. 19~24 늦은 오후입니다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~24의 정수를 입력하세요");
		int num = scanner.nextInt();
		if(num>=1 && num<=12) {
			System.out.println("오전입니다.");
			if(num>1 && num <=6) {
				System.out.println("이른 오전입니다.");
			}else {
				System.out.println("늦은 오전입니다.");
			}
		}else if (num>12 && num<=24) {
			System.out.println("오후입니다.");
			if(num>13 && num <=18) {
				System.out.println("이른 오후입니다.");
			}else {
				System.out.println("늦은 오후입니다.");
			}
		}else {
			System.out.println("잘못입력했습니다.");
		}
		
		}

	}


