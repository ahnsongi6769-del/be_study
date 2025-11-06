package be_study.refer;

public class Arr02 {

	public static void main(String[] args) {
		
		
		//int
		//int[] 
		//int[][] 다차원 배열
		//int[][][] 3차원 배열
		
		int n = 10; //
		int[] nArr1 = new int[5];// ㅁㅁㅁㅁㅁ
		
		int [][] nArr2 = new int[3][5];
		//						행	열
		
		/*
		 01234
		0 ㅁㅁㅁㅁㅁ
		1 ㅁㅁㅁㅁㅁ
		2 ㅁㅁㅁㅁㅁ
		 		 
		 */
		
		int[][] nArr3 = new int[4][3];
		
		/* 012
		  0ㅁㅁㅁ     
		  1ㅁㅁㅁ  
		  2ㅁㅁㅁ
		  3ㅁㅁㅁ
		 
		 */
		
		int[]nArray1= {1,2,3,4,5,6};   // 이렇게 들어감  ㅁㅁㅁㅁㅁㅁ
		int[][]nArray2 = {{1,2,3},{4,5,6}};
		// ㅁㅁㅁ 123
		// ㅁㅁㅁ 456
		int[][]nArray3 = {{1,2},{3,4},{5,6}};
		
		// ㅁㅁ 12
		// ㅁㅁ 34
		// ㅁㅁ 56
		
		System.out.println(nArray2[0][2]);
		
		int[][] nArray4=new int[2][3];
		// ㅁㅁㅁ
		// ㅁㅁㅁ
		
		//2행 3열 nArray2 출력 하기
		
		for(int i=0; i<nArray2.length; i++) {
			for(int j=0;j<nArray2[i].length; j++) {
				System.out.print(nArray2[i][j]+"");
				// i : 000111
				// j : 012012
				//nArray2[0][0]   nArray2[0][1]   nArray2[0][2]
				//nArray2[1][0]   nArray2[1][1]   nArray2[1][2]
			
			}
			System.out.println();
		}
		
		
		
		
	}

}
