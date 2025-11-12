package be_study.quiz;

public class Quiz22 {

	public static void main(String[] args) {
//		학생 10명의 시험 점수가 다음과 같이 주어졌다고 가정합니다.
//		이 점수들을 배열에 저장한 뒤, 다음 조건에 따라 통계를 계산하는 프로그램을 작성하세요.
//
//		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
//
//		최고 점수와 최저 점수를 출력하세요.
//		평균 점수를 출력하세요.
//		80점 이상인 학생의 수를 출력하세요.
//
//		출력 예)
//
//		최고 점수: 100
//		최저 점수: 63
//		평균 점수: 82.5
//		80점 이상 학생 수: 6명
		
		
		// 1. 주어진 점수 배열 선언 및 초기화
        int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
        int numberOfStudents = scores.length;
        
        // 초기값 설정: 첫 번째 요소를 기준으로 초기화
        int maxScore = scores[0];
        int minScore = scores[0];
        int sumScore = 0;
        int aboveEighty = 0;

        // 2. 배열을 순회하며 통계 계산
        for (int score : scores) {
            
            // 총점 계산
            sumScore += score;
            
            // 최고 점수 (Max) 확인
            if (score > maxScore) {
                maxScore = score;
            }
            
            // 최저 점수 (Min) 확인
            if (score < minScore) {
                minScore = score;
            }
            
            // 80점 이상 학생 수 확인
            if (score >= 80) {
                aboveEighty++;
            }
        }
        
        // 3. 평균 점수 계산 (정확한 계산을 위해 double 타입 사용)
        // totalScore / totalStudents
        double averageScore = (double) sumScore / numberOfStudents;

        // 4. 결과 출력 (출력 예와 동일하게)
        System.out.println("--- 학생 점수 통계 ---");
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최저 점수: " + minScore);
        
        // 평균 점수는 소수점 한 자리까지만 출력하기 위해 printf 사용
        System.out.printf("평균 점수: %.1f\n", averageScore);
        
        System.out.println("80점 이상 학생 수: " + aboveEighty + "명");
        System.out.println("-------------------------");

	}

}
