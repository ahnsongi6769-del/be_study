package be_study.test.t2;

import java.util.Scanner;

public class Roulette {

	String id;
	String rouletteName;
	int totalPoint;
	int successCount;
	int failCount;
	int remainingCount;
	int totalSales;
	boolean isOpened;
	
	public Roulette(){
		totalPoint = 0;
		successCount = 0;
		failCount = 0;
		remainingCount = 0;
		totalSales = 0;
		isOpened = false;
	}
	
	public Roulette(String id,String rouletteName){
		this.id =id;
		this.rouletteName = rouletteName;
	}
	

	
	public void startSales() {
		isOpened = true;
		System.out.println("======= "+rouletteName+"영업시작"+" =======");
		Scanner scanner =new Scanner(System.in);
		
		while(isOpened) {
			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1.충전 2.게임시작 3.마감");
			System.out.println(">>> 입력 : ");
			
			int menuInput = scanner.nextInt();
			
			switch(menuInput) {
			case 1:
				System.out.println();
				System.out.println("-------[충전]-------");
				System.out.println(">>>충전 금액을 입력해주세요");
				int rechargeAmount = scanner.nextInt();
				if(rechargeAmount >= 1000) {
					totalSales += rechargeAmount;
				}
				break;
			case 2:
				System.out.println();
				System.out.println("-------[게임시작]-------");
				for(int i=1; i<=6; i++) 
					System.out.print((int)(Math.random()*6) + 1 +" ");
				break;
			case 3:
				System.out.println();
				System.out.println("=====[영업마감]=====");
				isOpened = false;
				System.out.println("-----[마감정보]-----");
				System.out.println(">>> 총매출액 : " + totalSales);
				break;
			
			}
		}
			
			
		
		
	}
	
}

