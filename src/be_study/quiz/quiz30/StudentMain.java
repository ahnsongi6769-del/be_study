package be_study.quiz.quiz30;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("컴퓨터 공학과", 2025123456);
		
	
//		s1.showInfo();
		s1.setMajor("컴퓨터 공학과");
		System.out.println(s1.getStudentNumber()); 
		System.out.println(s1.getMajor());
	
	}

}
