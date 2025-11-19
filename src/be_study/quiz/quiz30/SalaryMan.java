package be_study.quiz.quiz30;

public class SalaryMan {
	
	int salary;
	int AnnualGross;


	SalaryMan(){ 
		salary = 1000000;
		AnnualGross = 0;
	}
	SalaryMan(int salary){//월급여액 매개변수로 전달 받아서 초기화
		this.salary = salary;
	}
	
	 public  int getAnnualGross() {
			return this.AnnualGross = (salary * 12) + (salary * 5) ;
	 }
	

	
}
