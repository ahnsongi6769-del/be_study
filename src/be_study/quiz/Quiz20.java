package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
	

		/* 
		 수행해야하는 순서 (흐름)
		 조건 -> 처리 방향
		 언제까지 
		 플로우 차트 / 알고리즘 개발 순서도 
		  
		 // 메뉴 뭐 시켰는지 어디에 저장 / 관리 ?
		 // 메뉴 뭐 몇개 시켰는지 어디에 저장 / 관리 ?
		 // 메뉴 금액 얼만지 어디에 ?  
		 // 가지고 있는 메뉴가 어떤것들이 있지 ?
		  
		 1. 메뉴 보여주기 
		 	-> 메뉴관리 ? 
		 	-> 어떻게 보여줄건지?
		 2. 메뉴 선택 입력 받기
		 	-> 단순 입력
		 	-> 잘못 입력 대처 ?
		 3. 주문 수량 몇개 입력 받기
		 	-> 단순 입력
		 	-> 잘못 입력 대처 ?
		 4. 추가 주문 여부 체크 y or n
		 	- 추가 주문 y = 다시 메뉴 보여주기부터 반복
		 	- 추가 주문 n = 끝
		 5. 주문한 메뉴별 수량 보여주기
		 	주문 총금액 보여주기 
		*/
		// 몇번 반복하는지 확인 안될 때는 while  
		//while(true) {
			// 메뉴 보여주기
			//메뉴선택
			//수량 선택
			// 추가주문 여부 선택
			
			//if (추가 주문 여부가 n 이다 ?)
			// break; -> 주문 내역 / 금액 출력 -> 끝 
		
		   Scanner scanner = new Scanner(System.in);
//	        // 메뉴 이름과 가격을 배열로 저장
//	        String[] menuNames = {"아메리카노", "카페라떼", "바닐라라떼"};
//	        int[] menuPrices = {3500, 4100, 4300};
//	        int[] orderCount = {0, 0, 0};// 주문 수량 저장용 배열
//	        
//	        String addOrder = "y";
//	        while (true) {
//	            System.out.println("=========== 메뉴 =============");
//	            for (int i = 0; i < menuNames.length; i++) {
//	                System.out.println((i + 1) + ". " + menuNames[i] + " " + menuPrices[i] + "원");
//	            }
//	            System.out.println("==============================");
//	            System.out.print("메뉴 번호를 선택하세요 (1~3): ");
//	            int choice = scanner.nextInt();  // 정수로 입력 받음
//	            // 메뉴 선택 오류 처리
//	            if (choice < 1 || choice > 3) {
//	                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.\n");
//	                continue;
//	            }
//	            System.out.print("수량을 입력하세요: ");
//	            int qty = scanner.nextInt();
//	            if (qty <= 0) {
//	                System.out.println("수량은 1 이상이어야 합니다.\n");
//	                continue;
//	            }
//	            // 주문 누적 (배열이므로 인덱스는 choice - 1)
//	            orderCount[choice - 1] += qty;
//	            System.out.print("추가 주문하시겠습니까?(y/n): ");
//	            addOrder = scanner.next();
//	            if (addOrder.equals("n")) {
//	                break; // 반복문 완전히 종료
//	            } else if (addOrder.equals("y")) {
//	                continue; // 다음 주문으로 바로 넘어감
//	            } else {
//	                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
//	            }
//	        }
//	        // 주문 내역 출력
//	        System.out.println("\n=========== 주문 내역 ===========");
//	        int total = 0;
//	        for (int i = 0; i < menuNames.length; i++) {
//	            if (orderCount[i] > 0) {
//	                int sum = menuPrices[i] * orderCount[i];
//	                System.out.println(menuNames[i] + " " + orderCount[i] + "잔 : " + sum + "원");
//	                total += sum;
//	            }
//	        }
//	        System.out.println("-------------------------------");
//	        System.out.println("총액: " + total + "원");
//	        System.out.println("감사합니다! ");
//	        scanner.close();
	
		   System.out.println("---------------------------------------------------------------------------------------");		
		   
		   String[]menuArr = {"아메리카노","카페라떼","바닐라라떼"}; // 메뉴이름
		   int [] priceArr = {3500, 4100, 4300}; //메뉴가격
		   int [] countArr = new int [menuArr.length]; // 메뉴 주문 수량
		   
		   int menu; // 메뉴선택
		   int count; // 수량 선택
		   String addOrder; // 추가 주문 여부
		   
		   while(true) {
			   
			   while(true) {
			   System.out.println("========메뉴===========");
			   for(int i=0; i < menuArr.length; i ++) { // 인덱스 012 3개
				   System.out.printf("%d.%5s%7d원\n", i+1, menuArr[i], priceArr[i]);
			   }
			   System.out.println("=====================");
			   
			   //메뉴 선택
			   System.out.println("메뉴 선택 :");
			   menu = scanner.nextInt();
			   
			   if(menu >=1 && menu <= menuArr.length) {//정상선택
				   break;
			   }else {
				   System.out.println("잘못입력했습니다. 메뉴를 다시 선택해주세요!");
			   }
			   }
			   
		   }
		   
		   // 메뉴 선택을 정상적으로 했다면 이 다음으로 넘어옴
		   // 메뉴 선택 완료 
		   // 수량 선택 
		   
		
		   
		 // 선택한 메뉴번호 -1 위치 인덱스에 수량추가
		   
//		   if ( addOrder.equals("n")) {
//			   System.out.println("=================================");
//			   int total = 0;
//			   for(int i=0; i<menuArr.length; i++) {
//				   if(countArr[i] >0) {
//					   System.out.printf("%s %d잔 : %d\n", menuArr[i], countArr[i], countArr[i]*priceArr[i]);
//					   total += countArr[i]*priceArr[i];
//				   }
//				  
//				   }
//
//			   //총합금액
//			   System.out.println("===============================");
//			   System.out.println("총액 : " + total + "원");
//			   break;
//		   
//		   }
//		   
//		   
		   
		   
		   
		   
		   
		   
	}
	
}

	


