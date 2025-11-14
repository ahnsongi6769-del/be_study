package be_study.quiz.quiz26;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem1 = new Member();
		
		mem1.memberNumber = 1;
		mem1.loginId = "mem1Id";
		mem1.name = "이준호";
		mem1.signUpDate = "20220825";
		
		mem1.printInfo();
		
		Member mem2 = new Member(40,"정명석");
		mem2.memberNumber = 2;
		mem2.setIdAndSingUpDate("seok","20220701");
		mem2.printInfo();
		
		Member mem3 = new Member(27,"우영우", "wootothe","20220816");
		mem3.setMemberNember(3);
		mem3.printInfo();

	}

	}


