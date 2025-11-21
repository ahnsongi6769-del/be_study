package be_study.homework.task;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();
		
		Person p1 = new Person("Alex",20);
		
		System.out.print("11. 이름과 나이를 출력 : "+ p1.name +" "+ p1.age );

		System.out.println();
		System.out.print("12. hello 메서드 실행 : ");
		p1.hello();
		
		System.out.println();
		p1.member();
		
		Person p2 =p1.setPerson();
		System.out.println("14. Person 객체를 리턴하는 메서드: " + p2.name + p2.age);
		
		Person p3 = new Person("Ben",30);
		Person p4 = new Person("Emma",35);
		
		Person p5 = person.oldAge(p3, p4);
		System.out.println("15. age가 큰 사람을 출력: " + p5.age +" " +p5.name);
		
		person.addAge(p5); 
		System.out.println("16. Person 객체를 매개변수로 받아 age를 1 증가시키는 메서드: " + p5.age +" " +p5.name);
	
		Person jack = new Person ("jack",28);
		System.out.println("17. Person을 만들고, 그 객체의 참조를 두 변수에 나눠 담은 뒤 값 변경 테스트 원래 이름: " + jack.name);
		Person jack1 = jack;
		jack1.name = "Lily";
		System.out.println("17. Person을 만들고, 그 객체의 참조를 두 변수에 나눠 담은 뒤 값 변경 테스트 변경 이름: " + jack1.name);
		
		ArrayList<Person> personArr = new  ArrayList<Person>();
		personArr.add(jack);
		personArr.add(p3);
		personArr.add(p4);
		System.out.print("18. Person 배열을 만들어 3명을 채워 넣고 이름을 출력: ");
		for(Person p : personArr) { //personArr 배열 0 1 2
									// personArr[0]  => p
									// personArr[1]  => p
									// 배열의 길이만큼 반복...
			System.out.print(p.name + " ");
		}
		System.out.println();
		System.out.print("19. Person 배열을 매개변수로 받아 모든 사람의 hello()를 호출: ");
		for(int p = 0; p<personArr.size(); p++ ) {
			//System.out.print(.name + " " );
			personArr.get(p).hello();
		}
		
//		20. Person 배열을 만들어 가장 나이가 많은 사람을 리턴하는 메서드를 작성하라.
		Person [] arr = new Person[3];
		arr[0] = new Person( "jack",28);
		arr[1] = new Person( "Ben",30);
		arr[2] = new Person( "Emma",35);
		System.out.println();
		System.out.println("20. Person 배열을 만들어 가장 나이가 많은 사람을 리턴하는 메서드를 작성: "+ Person.maxAge(arr).age);
	
	}
	
	
	
	
	
}
