package plus;

import java.util.ArrayList;

public class Study02 {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		
		for(int i =0; i<number.size(); i++) {
			System.out.println(number.get(i));
		};
		
		ArrayList<String>name = new ArrayList<>();
		name.add("사과");
		name.add("바나나");
		name.add("딸기");
		for(int i =0; i<name.size(); i++) {
			System.out.println(name.get(i));
		};
		
		name.remove(1);
		
		for(int i =0; i<name.size(); i++) {
			System.out.println(name.get(i));
		};
		
		name.set(1, "포도");
		
		for(int i =0; i<name.size(); i++) {
			System.out.println(name.get(i));
		};
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(12);
		num.add(8);
		num.add(20);
		num.add(3);
		
		for(int i =0; i<num.size(); i++) {
			if (num.get(i) >=10) {
				System.out.println(num.get(i));
			}
		};
		System.out.println(num.size());
		
		ArrayList<String>names = new ArrayList<>();
		names.add("홍길동");
		names.add("김철수");
		names.add("이영희");
		
		if(names.contains("김철수")) {
			System.out.println("김철수는 존재합니다.");
		}
		
		ArrayList<Integer> num1 = new ArrayList<>();
		num1.add(3);
		num1.add(7);
		num1.add(2);
		num1.add(9);
		num1.add(5);
		
		int max =num1.get(0);
		for(int i =1; i <num1.size(); i++) {
			if(num1.get(i)>max) {
				max = num1.get(i);
			}
		}
		System.out.println("가장 큰 값: " + max);
	
	}

}
