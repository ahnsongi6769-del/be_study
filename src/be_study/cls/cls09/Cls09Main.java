package be_study.cls.cls09;

public class Cls09Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1= 10;
		int n2= 20;
		int n3= 30;
		int[] nArr = {10,20,30};  // 값을넣어서 만든 배열
		int[] nArr1 = {n1,n2,n3}; // 변수를 넣어서 만든 배열
		int[] nArr2 = new int[5]; // 몇칸짜리로 만들지 선언
		nArr2[3] = 100;  
		
		for(int i =0; i<nArr.length; i ++) {
			System.out.print(nArr[i] + " " );
		}
		System.out.println();
		
		for (int n : nArr2) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println(methodA(n2));
		methodB(nArr);
		methodB(nArr2);
		
		int[] cArr = methodC(null); // int[]arr = null 00000
		// methodC(300) int[] arr = 300 xxxxxxxxxxx
		methodB(cArr);
		System.out.println("------------------------------");
		
		Temp t1 = new Temp();
		Temp t2 = new Temp();
		Temp t3 = new Temp();
		
		Temp[] tArr = {new Temp(), new Temp(),new Temp()};
		Temp[] tArr1 = {t1,t2,t3};
		Temp[] tArr2 = new Temp[5]; // 개별 공간 선언 5 개 짜리 
		tArr2[3] = new Temp(); // 3인덱스에 있는 곳에 객체 생성 new Temp()

		for(int i = 0; i < tArr.length; i++) {
			System.out.print(tArr[i].num);
			tArr[i].method();
		}
		System.out.println();
		for(Temp t :tArr1) {
			System.out.print(t.num);
			t.method();
		}
		System.out.println();
	}

	
	public static int methodA(int n) {
		return n + 10;
	}
	
	public static void methodB (int[]arr) {
		for(int i =0; i<arr.length; i ++) {
			System.out.print(arr[i] + " " );
		}
		System.out.println();
	}
	public static int[] methodC(int[] arr) {
		
		int [] ar = {5,4,3,2,1};
		
		return ar;
	}
	
	public static void methodD(Temp t) {
		System.out.println(t.num);
		t.method();
	}
	public static void methodE(Temp[] arr) {
		for(Temp t :arr) {
			System.out.print(t.num);
			t.method();
		}
		System.out.println();
	}
	
}
