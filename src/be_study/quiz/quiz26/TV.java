package be_study.quiz.quiz26;

public class TV {
	
	String made; //제조사
	int year; //연식
	int inch; // 크기

	
	
	TV(String made,int year,int inch){ //매개변수 3개 있어야함 	//기본생성자

	
		this.made = made;
		this.year = year;
		this.inch = inch;
				
	}
	// 메소드 
	
	void show() {
		System.out.println(made+"제품 "+year +"년형 "+ inch+"인치 "+"TV");
		System.out.printf("%s제품 %d년형 %d인치 TV \n",made,year,inch);
	}
	
}
