package be_study.quiz.quiz41;

public class Food {

	String name;
	int price;
	int stock;
	
	public Food(){}
	
	public Food(String name, int price){
		this.name = name;
		this.price = price;
		//초기 재고 수량은 5개로 가정한다. 
		this.stock = 5;
	}
	
	
	//재고를 설정 할 수 있다라는게 그냥 
	//숫자를 세팅을한다의 의미와  
	public void setStock(int stock) { // 각 음식별 재고를 설정할 수 있다. 
		this.stock = stock;
		}
	//재고가 변경이된다라는 개념으로 만들수있다.
	public void modifyStock(int count) {
		if((stock + count) <0) {
			stock = 0;
		}else {
			stock += count;
		}

	}
	// food 자체의 현재 정보 string 반환
	public String getFoodInfo() {
		
		return	String.format("%s : %d원 (잔여재고: %d)", name,price,stock);
	}
	
	
}
	

