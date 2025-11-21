package be_study.homework.task;

import java.util.ArrayList;


public class Person {
	
	
	String name;
	int age;
	ArrayList<Person> persons;
	
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Person(ArrayList<Person> arr) { 
		persons = arr;
	}
	
		
	void hello() {
		System.out.print(name + " : Hello!");
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
//	16. Person 객체를 매개변수로 받아 age를 1 증가시키는 메서드를 작성하라. (원본 확인) 	
	public void addAge(Person p5) {
		p5.age++;
	}

//	20. Person 배열을 만들어 가장 나이가 많은 사람(개체 = Person)을 리턴하는 메서드를 작성하라.
	public static Person maxAge(Person[]arr) {
		int index = 0;
		for(int i=0; i< arr.length; i++) {
			if(arr[index].age < arr[i].age) { // 30 < 35  
				index = i; // 1;
			}
		}		
		return arr[index]; // arr[2]  = person[2] =
		// int[] arr  = 1 2 3
		// arr[0] = 1; 
	}

}