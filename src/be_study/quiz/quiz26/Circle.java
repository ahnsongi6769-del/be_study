package be_study.quiz.quiz26;

public class Circle {
	
	//필드변수
	int radius; // 반지름 저장용
	
	//생성자는 안만들어도 됨 매개변수가 없어서 
	
	void setRadius(int radius) {
		this.radius = radius;
	}
	
	double getArea(){
		//return radius * radius *3.14;
		double area = radius * radius *3.14;
		return area;
	}
	
	

}
