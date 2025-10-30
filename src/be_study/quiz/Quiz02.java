package be_study.quiz;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// quiz 1번
		String key1 = "브랜드명 : 로지텍";
		String key2 = "상품명 : mx keys";
		String key3= "상품가격 : 135000";
		String key4= "시리얼번호 : 332L1545K";
		System.out.println(key1);
		System.out.println(key2);
		System.out.println(key3);
		System.out.println(key4);
		
		// quiz 2번
//		String monitor1 = "회사명 : SAMSUNG";
//		String monitor2 = "모니터인치 : 24";
//		String monitor3 = "모니터 색상: black";
//		String monitor4 = "HDMI포츠여부 : true";
//		String monitor5 = "소리출력가능여부 : false";
//		System.out.println(monitor1);
//		System.out.println(monitor2);
//		System.out.println(monitor3);
//		System.out.println(monitor4);
//		System.out.println(monitor5);
//		
		String company = "SAMSUNG";
		int inch = 24;
		String color = "black";
		boolean hasHdmiPort = true;
		boolean canPlayedSound = false;
		
		
		//quiz 3번
		double pi = 3.14;
		System.out.println("원주율:" + pi);
		
		//quiz 4번
		String mathScore = "85";
		String englishScore = "90";
		String artScore = "70";
		Integer.parseInt(mathScore);
		Integer.parseInt(englishScore);
		Integer.parseInt(artScore);
		
		System.out.println("총점 : " + (Integer.parseInt(mathScore) + Integer.parseInt(englishScore)+Integer.parseInt(artScore)));
		
		int math =Integer.parseInt(mathScore);
		int eng =Integer.parseInt(englishScore);
		int art =Integer.parseInt(artScore);
		System.out.println("총점: "+(math + eng + art));
		
		//quiz 5번
		
		int num1 = 4;
		int num2 = 10;
		double num3 = num1 / num2 ;
		num3 = (double)num1 / num2;
		
		System.out.println(num3);
		
		double num4 = num1;  // double num4 = 4.0
				
		

	}

}
