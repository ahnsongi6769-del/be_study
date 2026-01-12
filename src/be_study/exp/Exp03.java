package be_study.exp;

import java.util.ArrayList;
import java.util.List;

public class Exp03 {

	public static void main(String[] args) throws InvalidParameterValueException,ListFullException {
		
		SampleEx s = new SampleEx();
		
		try{s.addItem1("하나");
		}catch(Exception e){
			System.out.println("addItem1을 호출한 main 에 하나 예외처리");
		}
		
		try {
		s.addItem2("둘");
		}catch(Exception e){
			System.out.println("addItem2을 호출한 main 에 둘 예외처리");
		}
		
		try {
			s.addItem3("셋");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
		s.addItem4("넷");
		}catch(NullPointerException e) {
			System.out.println("addItem4를 호출한 main 에서 넷 예외처리");
		}
		
		try {
			s.addItem5("다섯");
		} catch (Exception e) {
			
			System.out.println("addItem5를 호출한 main 에서 다섯 예외처리");
		}
		
		try {
			s.addItem6("여섯");
		} catch (Exception e) {
			
			System.out.println("addItem6를 호출한 main 에서 여섯 예외처리");
		}
		
		int result = s.addItem7("일곱");
		if(result == 1) {
			// o 정상처리
		}else {
			//X Exception
		}
		
		try {
			s.addItem8("여덟");
		} catch (InvalidParameterValueException e) {
			e.printStackTrace();
		}catch(ListFullException e) {
			e.printStackTrace();
		}
		
		try {
			s.addItem8("여덟");
		}catch(Exception e) { //exception 이 inval .. list .. 상위 클래스 개념 
			e.printStackTrace();
		}
		
	}
}

/******************************************/
class SampleEx {
	List<String> list;
	
	void addItem1(String s) {
		list.add(s);
	
	}
	void addItem2(String s) {
		try {
		list.add(s);
		}catch(Exception e) {
			System.out.println("SampleEx 내부 addItem2에서 예외처리 ");
		}
	}
	
	void addItem3(String s) throws Exception {
		list.add(s);
	}
	
	void addItem4(String s) throws NullPointerException { //RuntimeException 실행해봐야하는 오류
		list.add(s);
	}
	
	void addItem5(String s) throws Exception {
		try{
			list.add(s);
		}catch(Exception e) {
			System.out.println("SampleEx 내부 addItem5에서 예외처리 ");
			
		}
	}
	
	void addItem6(String s) throws Exception { //throws는 이메소드에서 이 Exception 예외가 발생할 수 있음 주의
		try{
			list.add(s);
		} catch(Exception e) {
			System.out.println("SampleEx 내부 addItem6에서 예외처리 ");
			throw e; //실제 예외를 던진다 (발생시킨다 /전달한다.) 내부와 외부 둘다 처리 됨 
			
		}
	}
	int addItem7(String s) {
	try{
		list.add(s);
	}catch(Exception e) {
	 //문제 발생
		return -1; //-1 예외 발생 잘못되었다.
	}
	return 1;
	}
	
	void addItem8(String s)throws InvalidParameterValueException,ListFullException{
		
		if (s == null) {
			throw new InvalidParameterValueException();
		}
	
		try {
			list.add(s);
		}catch (Exception e) {
			// 우리가 저장하는 최대길이 
			// 현재 리스트 길이 
			//문제가 발생
			throw new ListFullException();
		}
	}
	void addItem9(String s) {
		try {
			list.add(s);
		}catch (Exception e) {
			if(list == null) {
				list = new ArrayList<String>();
				list.add(s);
			}
		}
	}

}


/*****************************/
// Custom Exception

class ListFullException extends Exception{}

class InvalidParameterValueException extends Exception{}

class SuperVeryThirstyValueException extends Exception{}

