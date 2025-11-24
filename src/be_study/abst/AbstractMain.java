package be_study.abst;

public class AbstractMain {

	public static void main(String[] args) {
		
		Hite h1 = new Hite();
		h1.name = "하이트라이트";
		h1.ml = 330;
		h1.alcol=6.3;
		Coke c1 = new Coke();
		c1.name = "제로콜라";
		c1.ml = 500;
		c1.sugar = 0;
		c1.introduce();
		
		Beverage b1 = new Coke();
		Beverage b2 = new Hite();
		Beverage[] bArr = {new Coke(), new Hite()};

		// bArr[0].checkSafety();
		b2.checkSafety();
		b2.introduce();
		
		Hite hh = (Hite)b2; // Hite 형변환을 해줘야 아래의 메소드를 쓸수있다.
		hh.checkAlcol();
	}

}
