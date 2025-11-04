package be_study.iter;

public class Iter03 {

	public static void main(String[] args) {
		
		//반복문 중첩
		
		for(int i=1; i<=5; i++) {
			
			//실행문 
			System.out.println("for i 실행문" +i);
			
			for(int j =1; j<=3; j++) {
				System.out.println(">for j 실행문" + j);
			}
			System.out.println("--- for 실행문 end");
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				for(int k =1 ; k<2; k++) {
					
				}
			}
		}
		
		// 방 3개 
		  // 3번씩 쓸기
		  // 2번씩 닦기
		  // 1번씩 쓰레기 정리 
			
		//for 방3
			//for 쓸기3 
			//for 닦기2
		for(int i=1; i<=3; i++) {
			//i=방 3개를 의미
			 System.out.println(i+"번 방 청소");
			 for (int j=1; j<=3; j++) {
				 System.out.println("쓸기");
			 }
			 int k =1;
			 while (k<=2) {
				 System.out.println("닦기");
				 k++;
			 }
				 System.out.println("쓰레기 정리");
			}
				 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
