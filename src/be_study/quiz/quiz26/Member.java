package be_study.quiz.quiz26;

public class Member {
	int memberNumber;
	int age;
	String name;
	String loginId;
	String signUpDate;
	
	 Member(){}
	 Member(int age, String name){
		this.age = age;
		this.name = name;
		
	}
	 
	 Member(int _age, String _name, String _loginId, String _signUpDate){
		 age = _age;
		 name = _name;
		 loginId = _loginId;
		 signUpDate = _signUpDate;
	 }
	 
	 public void setMemberNember(int input) {
		 memberNumber = input;
	 }
	 public void setIdAndSingUpDate(String _id, String inputDate) {
		 this.loginId = _id;
		 this.signUpDate = inputDate;
	 }
	 public void printInfo() {
		 System.out.println("회원정보를 출력합니다.");
		 System.out.println(memberNumber + " " + age + " " + name + " " +loginId + " " + signUpDate);
	 }
}
