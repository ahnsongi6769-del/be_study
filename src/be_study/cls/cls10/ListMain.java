package be_study.cls.cls10;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		// ArrayList 개념 
		String[] sArr1 = new String[4]; // 4칸 짜리 배열 
		sArr1[0] = "A";
		sArr1[1] = "B";
		sArr1[2] = "C";
		sArr1[3] = "D";
		
		//sArr1[4] = "E"; 
		
		String[] sArr2 = new String[5];
		for(int i = 0; i<sArr1.length; i++) {
			sArr2[i]= sArr1[i];
		}
		sArr2[4] = "E";
		
		for(String s: sArr2) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//ArrayList
		//ArrayList<저장할타입> 변수명 = new ArrayList<저장할타입>();
		System.out.println("---------------------------------------");
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("A");
		sList.add("B");
		sList.add("C");
		sList.add("D");
		sList.add("E");
		sList.add("F");
		
		for(String s: sList) { // 요기서 s 는 지역변수 
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(int i =0; i<sList.size(); i++) { // size 는 길이 
			//List 의 특정 인덱스 위치의 값 접근 .get(index) arr[i]
			System.out.print(sList.get(i)+" ");
		}
		System.out.println();
		if(sList.contains("B"))
			System.out.println("contains 결과가 true면 B가 이미 있다.");
		else
			System.out.println("List에 B가 없다.");
		
		if(sList.contains("G")==false) {
			sList.add("G");
			}
			
			for(int i = 0; i<sList.size(); i++) {
				System.out.print(sList.get(i) + " ");
			}
			System.out.println();
			
			
			sList.set(2, "H");
			for(int i =0 ; i<sList.size(); i++) {
				System.out.print(sList.get(i)+ " ");
			}
			System.out.println();
			
			
			sList.remove(2);
			sList.remove("F");
			for(int i =0 ; i<sList.size(); i++) {
				System.out.print(sList.get(i)+ " ");
			}
			System.out.println();
			}
		
			
	}


