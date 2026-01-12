package plus;

public class Study03 {

	public static void main(String[] args) {
		
//		// 2차원 배열 
//		
//		int[][]number = new int[8][9]; // int [행][열]
//		
//		//배열의 값을 초기화
//		
//		for(int i=0; i<number.length; i++) {
//			for(int j =0; j<number[i].length; j++ ) {
//			 number[i][j] = (i+2)*(j+1);
//			}
//		}
//		
//		// 구구단 출력 
//		
//		for(int i=0; i<number.length; i++) {
//			for(int j =0; j<number[i].length; j++ ) {
//			System.out.printf("%d*%d = %d\n", (i+2),(j+1) ,number[i][j]);
//			}
//		}
		
		int star = 5;
		for(int i= 1; i <= star;i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		int star1 = 5;
		for(int i=1; i <= star1; i++) {
			for(int j =1; j <= star1; j++) {
				if (i>j) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		int star2 = 5;
		for(int i=1; i <= star2; i++) {
			for(int j =1; j <= star2; j++) {
				if (i==j && i>=j) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}


	}

}
