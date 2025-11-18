package be_study.cls.cls08;

public class SingetonMain {

	public static void main(String[] args) {
		
		// 외부에서 생성불가
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		Singleton s3 = new Singleton();
//		Singleton s3 = new Singleton(); // 생성을 못하는데 어떻게 생성한 인스턴스 객체를 통해서 필드변수에 접근을 하느냐 
		
		//Singleton.singleton = new Singleton(); // 외부에서 직접 못만듯
		//Singleton.singleton = null; // 기존에 있던 1개만 존재하는 객체를 삭제(파괴)
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();

		
		//무슨말인지 이해가 안됨 !
	}

}
