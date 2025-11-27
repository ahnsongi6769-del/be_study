package be_study.quiz.quiz41;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodTruck {

	String truckName; // 트럭이름
	int totalSales; // 총 매출액
	boolean isOpened; // 영업중 여부 
	
	ArrayList<Food> foodList = new ArrayList<Food>();
	
	public FoodTruck() {
		truckName =null;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}
	public FoodTruck(String truckName) {
		this.truckName = truckName;
	}
	public void addMenu(Food food) {
		foodList.add(food);
		
	}
	
	public void addMenu(String name, int price) {
	  Food food = new Food(name,price);
	  foodList.add(food);
		
	}
	
	public void startSales() {
		//영업시작 ~ 장사시작 
		isOpened = true;
		System.out.println("======= "+truckName+" 푸드트럭 영업시작"+"=======");
		
		Scanner scanner =new Scanner(System.in);
		
		while(isOpened) {
			
			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.println(">>> 입력 : ");
		
			int menuInput = scanner.nextInt();
			
			switch(menuInput){
			case 1:
				System.out.println();
				System.out.println("-------[메뉴]-------");
				for(int i=0; i<foodList.size(); i++) {
					System.out.printf("[%d] : %s\n" , i+1,foodList.get(i).getFoodInfo());
				}
				break;
			case 2: // 주문하기
				System.out.println();
				System.out.println("-------[메뉴]-------");
				for(int i=0; i<foodList.size(); i++) {
					System.out.printf("[%d] : %s\n" , i+1,foodList.get(i).getFoodInfo());
				}
				System.out.println(">>>주문 메뉴 번호 입력 : ");
				int orderMenu = scanner.nextInt();
				// 주문수량은 1개로 고정
				// orderMenu -> 인덱스 역할 하려면orderMenu -1
				
				int orderMenuIndex = orderMenu-1;
				if(foodList.get(orderMenuIndex).stock > 0) {
				foodList.get(orderMenuIndex).modifyStock(-1); // 1개 주문만큼 재고 감소
				totalSales += foodList.get(orderMenuIndex).price; //매출액 증가
				System.out.printf("[주문정보] %s 메뉴 %d개 주문완료!\n", foodList.get(orderMenuIndex).name,1);
				}else {
					System.out.println("[품절안내] 해당 메뉴는 품절입니다.");
				}
				
				
				break;
			case 3:// 재고관리 
				System.out.println();
				System.out.println("-------[메뉴]-------");
				for(int i=0; i<foodList.size(); i++) {
					System.out.printf("[%d] : %s\n" , i+1,foodList.get(i).getFoodInfo());
				}
				System.out.println(">>> 재고 관리할 메뉴 번호 입력");
				int input = scanner.nextInt();
				System.out.println(">>> 재고 조정할 개수를 입력 : ");
				int stockCount = scanner.nextInt();
				
				foodList.get(input -1).modifyStock(stockCount);
				//            몇번 인덱스에 있는 메뉴에게 너의 재고를 stockCount 만큼 조정해라
				System.out.println("[재고 조정 적용]");
				System.out.println(foodList.get(input-1).getFoodInfo());
				System.out.println();
				break;
			case 4:
				System.out.println();
				System.out.println("=====[영업마감]=====");
				isOpened = false;
				int loosSales = 0;
				for(Food food : foodList) {
					loosSales += (food.price *0.3 * food.stock);
				}
					
				System.out.println("-----[마감정보]-----");
				System.out.println(">>> 총매출액 : " + totalSales);
				System.out.println(">>> 원가차감 : " + loosSales);
				System.out.println(">>> 최종수익 : " +(totalSales-loosSales));
				break;
			}
			
			
		}

	
	}
	

}
