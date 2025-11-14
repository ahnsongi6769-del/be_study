package be_study.quiz.quiz26;

public class Monitor {

	//필드 변수 (속성
	String company; // 제조회사
	int inch; // 인치
	int price; // 가격
	String color; // 색상
	int maxResX; // 최대해상도 x 
	int maxResY; // 최대해상도 y
	
	//생성자  new Monitor("제조사,40,101010") 이렇게 만들어야함 
	Monitor(String company,int inch,int price){
		System.out.println(company+"제품 "+ inch+"인치 "+price);
		this.company = company;
		this.inch = inch;
		this.price = price;
		this.color=null;
		this.maxResX=0;
		this.maxResY=0;
		
	}

	//메소드
	void setXY(int x,int y) {
		this.maxResX = x;
		this.maxResY = y;
	
	}
	void setcolor(String color) {
		this.color = color;
		
	}
	//전원을 켜는 기능	
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}			
	int addPrice(int p) { // 원래 금액 + 인상된 금액
		this.price = this.price + p ; // 매개변수로 가격인상 처리 -> 보유하고 있는 필드 변수 프라이스를 p 가격으로 인상시켜라 
		
		return this.price; // 인상된 최종금액을 반환하는 형태가 된다. 
		}
	//모니터 정보를 출력하는 기능
	void printInfo() {
		System.out.printf("제조사:%s %d인치 모니터 가격 : %d원 색상: %s 해상도: %d *%d\n",
							company, inch,price,color,maxResX,maxResY);
	}
	
	
	
	
	
	
	
	
}
