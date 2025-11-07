package be_study.quiz;

public class Quiz16 {
	public static void main(String[] args) {
		
		//5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
		//규칙 찾아보기.
//		1 2 2 2 2
//		3 1 2 2 2
//		3 3 1 2 2
//		3 3 3 1 2
//		3 3 3 3 1
		
		int [][] arr = new int[5][5];
		
		/*
		 0 1 2 3 4
		0 ㅁㅁㅁㅁㅁ    
		1 ㅁㅁㅁㅁㅁ
		2 ㅁㅁㅁㅁㅁ
		3 ㅁㅁㅁㅁㅁ
		4 ㅁㅁㅁㅁㅁ		 
		 */
		int n =1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
			if(i==j) {
				arr[i][j] =1;
			}else if(i<j) {
				arr[i][j] =2;
			}else if(i>j){
				arr[i][j] =3;
			}
			System.out.printf("%3d", arr[i][j]);
				//i : 0000011111222223333344444
				//j : 0123401234012340123401234
				// arr[0][1]=1 arr[0][2]=2
			} System.out.println();
		} 
		
		
		
	}
}
