package plus.cls;

public class ScoreManager {
	void printScore(int[]scores) {
		//출력하기
		for(int i =0; i<scores.length; i++) {
		System.out.println(scores[i]);
		}
	}
	int getTotal(int[]scores) {
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	double getAverage(int[]scores) {
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {
			sum +=scores[i];
		}
		double avg = (double)sum / (double)scores.length;
		return avg;
	}
	//제일 작은 값 리턴
	
	int getMinScore(int[]scores) {
		int min = scores[0];
		 for(int i=0; i<scores.length; i++) {
			 if(min>scores[i]) {
				 min = scores[i];
			 }
		 }
		return min;
	}

	public static void main(String[] args) {
		
		int[] scores = {10,20,60,70,90,30};
		ScoreManager sm = new ScoreManager();
		//출력
		
		sm.printScore(scores);
		System.out.println("총점 "+sm.getTotal(scores));
		System.out.println("평균 "+sm.getAverage(scores));
		System.out.println("최소값 "+sm.getMinScore(scores));
		

	}

}
