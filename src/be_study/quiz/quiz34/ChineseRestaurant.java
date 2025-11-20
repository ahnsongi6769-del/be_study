package be_study.quiz.quiz34;

import java.util.ArrayList;

//Base코드
public class ChineseRestaurant {
	public static void main(String[] args) {
//주문을 위한 메뉴 선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);
//메뉴를 조합하여 주문을 생성
		ArrayList<Menu> menuArr = new  ArrayList<Menu>(); // 1. ArrayList를 Menu형으로 초기화 선언 
		menuArr.add(jjajang);	 // 2. 메뉴 어레이리스트에 메뉴 담기 
		menuArr.add(jjambbong);
		menuArr.add(tangsook);
		//= { jjajang, jjambbong, tangsook };
		Order order = new Order(123, menuArr);
//주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
	}
}

class Order {
//필드(인스턴스 필드)
	int orderNum;
	ArrayList<Menu> menus; // 3. 인스턴스 필드를 어레이리스트 메뉴형으로 선언 
	//Menu[] menus;

//생성자
	public Order(int i, ArrayList<Menu> arr) { // 4. 생성자 매개변수에 어레이리스트 메뉴형을 담을 수 있도록 선언 
												// 필드의 자료형을 바꿨으니까 생성자도 자료형을 바꿔야합니다.
		orderNum = i;
		menus = arr;
	}

//메소드(인스턴스 메소드)
	public int totalPrice() {
		
		int sum = 0 ;
		for(int i =0; i <menus.size(); i++) {
		sum += menus.get(i).price; 	
		}
		return sum; 
	}
}

class Menu {
//필드
	String name;
	int price;

//생성자
	public Menu(String str, int i) {
		name = str;
		price = i;
	}
}