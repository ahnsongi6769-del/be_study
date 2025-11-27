package be_study.quiz.quiz41;

public class FoodTruckMain {

	public static void main(String[] args) {
		
		//메인은 전체 클래스를 제어하는 역할 
		
		FoodTruck ft = new FoodTruck("대박분식");
		
		ft.addMenu("김밥", 4000);
		ft.addMenu("떡볶이", 6000);
		ft.addMenu("순대", 7000);
		
		ft.startSales();
		
		
	}

}
