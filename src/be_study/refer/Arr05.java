package be_study.refer;

public class Arr05 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		for(int i=0; i<5; i++) { //i : index 역할
			System.out.printf("arr[%d] = %d\n", i ,arr[i]);
		}
		System.out.println();
		for(int v : arr) { // {10,20,30,40,50};
			// 배열의 전체 갯수만큼 처음부터 끝까지 다 반복
			// v : 값이 주어진다. 인덱스는 모름 
			System.out.print(v + " ");
		}
		System.out.println();

		int[] scores = {90,95,100,85,80};
		int sum =0;
		
		for(int i=0; i<scores.length; i++) {
			sum = sum +scores[i]; // 90+95+100+85+80
		}
		System.out.println(sum);
	
		sum = 0;
		for(int s : scores) { // scores  에 있는 인덱스가  s 로 들어와서 반복
			sum = sum +s;
			//index++;
			//if(index==숫자)break;
		}
		System.out.println(sum);
		
		//{90,95,100,85,80}
		//채점점수 각 모든 점수 -5 점 처리
		//{85,90,95,80,75}
		
		
		//단순출력용
		for(int s :scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		for(int i = 0; i<scores.length; i++) {
			scores[i] = scores[i] - 5;
		}
		
		
		for(int s : scores) { // 여기서 s 는 지역변수만 변경되는거임 -> 원본 배열에 변경을 주지 않음
			s = s-5;
		}
		
	
	
	} 

}
