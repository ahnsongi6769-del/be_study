package be_study.inter.inter01;

public interface TempInterface {
	
	// 변수 선언 -> 상수로 인식
	//  (개별 인스턴스 멤버 변수가 되지 않는다)
	int SUCESS = 20; // 무조건 상수 
	static final int FAIL = 500; // 실패값 상수
	
	// 추상 클래스로 인식
	//인터페이스는 여러개 구현 가능 
	public void method3();
}
