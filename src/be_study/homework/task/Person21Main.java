package be_study.homework.task;

import java.util.Scanner;

public class Person21Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person21 person = new Person21();
		
		
//		21. 길이를 입력받아 Person 배열을 생성해 리턴하는 메서드를 작성하라.		
		Scanner scanner = new Scanner(System.in);
		System.out.print("길이를 입력하세요: ");
		int length = scanner.nextInt();
		
		Person [] creation =Person21.arr(length);
		System.out.print("21.배열을 생성해 리턴하는 메서드: ");
		for (int i = 0; i < creation.length; i++) {
		    System.out.print(creation[i].age + " ");
		}
		System.out.println();
//		22. Person 배열에 대해 모든 사람의 나이를 합산하는 메서드를 작성하라.		
	       Person21[] people = {
	               new Person21(10),
	               new Person21(20),
	               new Person21(30),
	               new Person21(40)
	           };
        int totalAge = Person21.sumAge(people);
        System.out.println("21.Person 배열에 대해 모든 사람의 나이를 합산하는 메서드 " + totalAge);
		
	
	}

}

	


