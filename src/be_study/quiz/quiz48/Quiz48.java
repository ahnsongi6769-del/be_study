package be_study.quiz.quiz48;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz48 {

	public static void main(String[] args) throws ParseException {

		String jsonString = ""
				+ "{"
				+ "\"도서관\": {"
				+ "\"위치\": \"서울특별시 강남구\","
				+ "\"운영시간\": {"
				+ "\"평일\": [\"09:00\", \"21:00\"],"
				+ "\"주말\": [\"10:00\", \"18:00\"]"
				+ "},"
				+ "\"책목록\": ["
				+ "{"
				+ "\"제목\": \"자바 프로그래밍\","
				+ "\"저자\": \"홍길동\","
				+ "\"출판연도\": 2023,"
				+ "\"가격\": 25000,"
				+ "\"대출가능\": true,"
				+ "\"카테고리\": [\"프로그래밍\", \"자기계발\"]"
				+ "},"
				+ "{"
				+ "\"제목\": \"데이터 분석 입문\","
				+ "\"저자\": \"김철수\","
				+ "\"출판연도\": 2022,"
				+ "\"가격\": 28000,"
				+ "\"대출가능\": false,"
				+ "\"카테고리\": [\"데이터\", \"분석\"]"
				+ "}"
				+ "],"
				+ "\"특별서비스\": {"
				+ "\"키오스크\": true,"
				+ "\"스터디룸\": {"
				+ "\"개수\": 5,"
				+ "\"예약 가능\": true,"
				+ "\"비용\": {"
				+ "\"1시간당\": 5000,"
				+ "\"하루\": 30000"
				+ "}"
				+ "}"
				+ "}"
				+ "}"
				+ "}";
		
		JSONParser jsonparser = new JSONParser();
		JSONObject jsonObj = (JSONObject)jsonparser.parse(jsonString);

		JSONObject library = (JSONObject) jsonObj.get("도서관");
		
		System.out.println(library.get("위치"));
		
		JSONObject hours = (JSONObject) library.get("운영시간");	
		
		JSONArray weekday = (JSONArray) hours.get("평일");
		JSONArray weekend = (JSONArray) hours.get("주말");
		
		System.out.println("평일:" + weekday.get(0) +"~"+ weekday.get(1));
		System.out.println("주말:" + weekend.get(0) +"~"+ weekend.get(1));
		
		JSONArray bookList = (JSONArray) library.get("책목록");
		
		for(int i =0; i<bookList.size(); i++) {
			
			System.out.println("---------book----------");
			JSONObject bookListObj = (JSONObject) bookList.get(i);
			System.out.println(bookListObj.get("제목"));
			System.out.println(bookListObj.get("저자"));
			System.out.println(bookListObj.get("출판연도"));
			System.out.println(bookListObj.get("가격"));
			System.out.println(bookListObj.get("대출가능"));
			
			JSONArray category = (JSONArray) bookListObj.get("카테고리");
			for(int j =0; j<category.size(); j++) {
				System.out.print(category.get(j)+" ");
			}
			System.out.println();
		}
		
		
		
		JSONObject service = (JSONObject) library.get("특별서비스");	
		System.out.println(library.get("특별서비스"));
		System.out.println(service.get("키오스크"));
		System.out.println(service.get("스터디룸"));
		
		JSONObject studyRoom = (JSONObject) service.get("스터디룸");	
		
		System.out.println(studyRoom.get("개수"));
		System.out.println(studyRoom.get("예약 가능"));
		System.out.println(studyRoom.get("비용"));
		
		
		
	}

}
