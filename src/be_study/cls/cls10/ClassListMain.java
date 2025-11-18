package be_study.cls.cls10;

import java.util.ArrayList;
import be_study.cls.cls09.Temp;

public class ClassListMain {

	public static void main(String[] args) {

		Temp t1 = new Temp();
		Temp[] tArr = new Temp[3];
		tArr[0] = new Temp();
		tArr[1] = new Temp();
		tArr[2] = new Temp();

		ArrayList<Temp> tList = new ArrayList<Temp>(); // Temp 타입들이 모여있는 배열

		tList.add(new Temp());
		tList.add(new Temp());
		tList.add(new Temp());
		tList.add(new Temp());

		for (int i = 0; i < tList.size(); i++) {
			System.out.print(tList.get(i).num + " ");
			// (Temp 를 의미한다.)
			tList.get(i).method();
		}
		System.out.println();

		for (Temp t : tList) {
			System.out.print(t.num + " ");
			t.method();
		}
		System.out.println();
		printList(tList);

		generateList();

		ArrayList<Temp> returnList = generateList();
		printList(returnList);

	}

	public static void printList(ArrayList<Temp> tList) {
		System.out.println("-----------------------------------");
		for (Temp t : tList) {
			System.out.print(t.num + " ");
			t.method();
		}
		System.out.println();
	}

	// ArrayList<Temp> nn= null;
	public static ArrayList<Temp> generateList() {

		ArrayList<Temp> list = new ArrayList<Temp>();
		list.add(new Temp());

		Temp t1 = new Temp();
		list.add(t1);

		return list;

		// return null;
	}

}
