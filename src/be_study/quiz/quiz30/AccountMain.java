package be_study.quiz.quiz30;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Account a1 = new Account("영광",2000);
		 
		 
		 a1.deposit(300);
		 a1.withdraw(400);
		 System.out.println(a1.getBalance());
		 
		 a1.withdraw(200);
	}

}
