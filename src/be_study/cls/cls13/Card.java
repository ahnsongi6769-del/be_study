package be_study.cls.cls13;

public class Card {
	
	int id;
	String type;  // 신용카드 or 체크카드
	String owner; // 카드 소유주
	String brand; // 어디브랜드 카드
	
	public Card(int id, String type, String owner, String brand) { // source 탭에 자동 완성 기능 있음
		super();
		this.id = id;
		this.type = type;
		this.owner = owner;
		this.brand = brand;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
