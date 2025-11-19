package be_study.quiz.quiz30;


public class SalaryManMain {

	public static void main(String[] args) {
		
		SalaryMan s1 = new SalaryMan();
		SalaryMan s2 = new SalaryMan();
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

}
