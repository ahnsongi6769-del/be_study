package be_study.homework.task;

public class Person21 {

//		22. Person 배열에 대해 모든 사람의 나이를 합산하는 메서드를 작성하라.
//		23. Person 배열을 전달하면, 모든 나이를 10으로 초기화하는 메서드를 만들어라.
//		24. Person 배열의 name만 따로 String[] 에 담아 리턴하는 메서드를 작성하라.
//		25. Person을 생성해서 배열 인덱스 0에 넣는 방법을 코드로 작성하라.
//		26. Person 배열 일부 요소는 null일 때, null 검사를 하며 출력하는 코드를 작성하라.
//		27. 이름으로 Person을 검색하여 해당 객체를 리턴하는 메서드를 작성하라.
//		28. Person 배열을 생성하되, 짝수 인덱스에만 객체를 넣고 나머지는 null로 두어라.
//		29. Person을 전달받아 새로운 Person을 만들어 반환하되, name만 복사해라.
//		30. Person 배열을 전달받아, age가 30 이상인 사람만 새로운 배열로 리턴하라.
		
	String name;
	int age;
	
	
	Person21(){}
	
	Person21(int age) {
        this.age = age;
    }
	

	
//		21. 길이를 입력받아 Person 배열을 생성해 리턴하는 메서드를 작성하라.
		public static Person[]arr(int length) {
			Person[] num = new Person[length];
			 for (int i = 0; i < num.length; i++) {
			        num[i] = new Person();
			        num[i].age = i;    // 숫자 넣기
			    }
			
			return num;
		}
		
//		22. Person 배열에 대해 모든 사람의 나이를 합산하는 메서드를 작성하라.
		
		 public static int sumAge(Person21[] people) {
		        int sum = 0;

		        for (int i = 0; i < people.length; i++) {
		            sum += people[i].age;
		        }

		        return sum;
		    }
		
		
		
		
		
	}

	
	

