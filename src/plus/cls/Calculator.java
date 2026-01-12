package plus.cls;

public class Calculator {
	
	int add(int a, int b) {
		int result = a + b;
		return result; 
	}
	
	int max(int a, int b) {
		int result2 = a;
				if (result2 > b) {
					return result2;
				}else {
					 result2 = b;
				};
			return result2;
	}
	
	
	public static void main(String[] args) {
		
		
		Calculator c1 = new Calculator();
		
		System.out.println(c1.add(10, 20));
		
		System.out.println(c1.max(55, 60));
		
	
	}

}
