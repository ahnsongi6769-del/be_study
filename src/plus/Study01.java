package plus;

import java.util.ArrayList;

public class Study01 {

	public static void main(String[] args) {

//		// 10,20,30,40,56,83 숫자들의 총합과 평균 구하기 
//		
//		// 총합은 ~~ 
//		// 평균 ~~~ 
//		
		int[] score= {10,20,30,40,56,83};
		
		int sum = 0;
		for(int i=0;i<score.length; i++) {
			sum = sum + score[i];
		}
		
		double avg = sum / 6.00;
		
		System.out.println("총점 :" + sum);
		System.out.printf("평균 :%.2f",avg);
		System.out.println();
		
		int max = score[0];
		int min = score[0];
		
		for(int i=0; i<score.length; i++) {
			if(max<=score[i]) {
				max = score[i];
			}
			if (min >= score[i]) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 :" + max );
		System.out.println("최소값 :" + min );
		

	
	
	ArrayList<String> names = new ArrayList<>();
	
	names.add("철수");
	names.add("영희");
	names.add("영철");
	names.add("희수");
	names.add("정숙");
	
	// 1번 ~~~~ 
	// 2번 ~~~~ 
	for (int i=0; i < names.size(); i++) {
		System.out.printf("%d번 %s\n",i+1,names.get(i));
	}
	
	
	
	}
}