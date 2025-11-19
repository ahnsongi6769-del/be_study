package be_study.quiz.quiz30;

public class Account {

	// 필드
	
	private String owner;
	private long balance;
	
	// 생성자
	
	Account(){
		owner = null;
		balance = 0;
	}
	Account(String owner){  
		this.owner = owner;
		}
	Account(long balance){  
		this.balance = balance;
		}
	Account(String owner,long balance){  
		this.owner = owner;
		this.balance = balance;
		}
	
	//메소드
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long deposit(long amount) {
	// sum += I
		this.balance += amount;
		return 0; 
	}
	public long withdraw(long amount) {
		
		if(balance<amount) {
			System.out.println("잔액이 부족하다");
		}else {
			this.balance -= amount;
		}
		return 0;
	}
	
	
	
}
