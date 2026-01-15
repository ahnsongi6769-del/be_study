package be_study.quiz.quiz45;

public class Product {
	
	int pCode;  // db 에서는 p_code
	String pName;
	int pPrice;
	public int getpCode() {
		return pCode;
	}
	public void setpCode(int pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	
	@Override
	public String toString() {
		return "Product [pCode=" + pCode + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}

	
}
