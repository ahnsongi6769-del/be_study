package be_study.quiz.quiz30;

public class Student {

	private String major;
	private int studentNumber;

	Student(String Major,int StudentNumber){
		this.major = Major;
		this.studentNumber = StudentNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
		
//	public void showInfo() {
//		System.out.print(" 학과 : "+Major+" 학번 : " +StudentNumber);
//	}
	

}
