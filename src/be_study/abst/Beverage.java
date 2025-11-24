package be_study.abst;

// 추상 클래스
public abstract class Beverage { // 음료 
	String name; // 이름
	int ml; // 용량 
	
	public void introduce() {
		System.out.println("저는 음료 입니다.");
	}
	
	// 안전검사
	// 추상 메소드
	public abstract void checkSafety();

}
