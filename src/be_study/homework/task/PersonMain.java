package be_study.homework.task;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();
		
		Person p1 = new Person("Alex",20);
		
		System.out.print("11. 이름과 나이를 출력 : "+ p1.name +" "+ p1.age );

		System.out.println();
		System.out.print("12. hello 메서드 실행 : ");
		p1.hello();
		
		p1.member();
		
		Person p2 =p1.setPerson();
		System.out.println("14. Person 객체를 리턴하는 메서드: " + p2.name + p2.age);
		
		Person p3 = new Person("Ben",30);
		Person p4 = new Person("Emma",35);
		
		Person p5 = person.oldAge(p3, p4);
		System.out.println("15. age가 큰 사람을 출력: " + p5.age +" " +p5.name);
		
		person.addAge(p5); 
		System.out.println("Person 객체를 매개변수로 받아 age를 1 증가시키는 메서드: " + p5.age +" " +p5.name);
	
	
	}

}
