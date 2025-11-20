package be_study.homework.task;

public class Person {
	
//	11. Person 객체 하나를 만들어 name과 age를 설정하고 출력하라.
//	12. Person 객체를 생성해 hello() 메서드를 실행해보라.
//	13. Person 객체를 매개변수로 받아 name을 출력하는 메서드를 만들어라.
//	14. Person 객체를 리턴하는 메서드를 작성하라(name과 age 세팅 후 리턴).
//	15. Person 두 명을 만들어 age가 큰 사람을 출력하라.
//	16. Person 객체를 매개변수로 받아 age를 1 증가시키는 메서드를 작성하라. (원본 확인) 
//	17. Person을 만들고, 그 객체의 참조를 두 변수에 나눠 담은 뒤 값 변경 테스트를 해보라.
//	18. Person 배열을 만들어 3명을 채워 넣고 이름을 출력하라.
//	19. Person 배열을 매개변수로 받아 모든 사람의 hello()를 호출하라.
//	20. Person 배열을 만들어 가장 나이가 많은 사람을 리턴하는 메서드를 작성하라.
	
	String name;
	int age;
	
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
		
	void hello() {
		System.out.println(name + " : Hello!");
	}
	
	void member() {
		System.out.println("13. Person 객체를 매개변수로 받아 name을 출력하는 메서드: "+ name);
	}
	Person setPerson(){
		Person p1 = new Person("Anna ", 25);
	 return p1;	
	}
	
	public Person oldAge(Person p3, Person p4) {
		if(p3.age>p4.age) {
			return p3;
		}else {
			return p4;
		}
	}
//	16. Person 객체를 매개변수로 받아 age를 1 증가시키는 메서드를 작성하라. (원본 확인) 끝아니네여ㅛ?	
	public void addAge(Person p5) {
		p5.age++;
	}
	



	
	
}
