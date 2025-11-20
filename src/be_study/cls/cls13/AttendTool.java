package be_study.cls.cls13;

public class AttendTool {
	//출근 체크하는 기계
	
	boolean isPowerOn;
	String org; // 어떤 조직을 위한 (organization)
	
	// 출근 체크  
	// 체크 결과를 return -> 처리 성공 true , 처리 실패 false
	//결과 return int 값 -? 1:출근성공 2: 실패  -> 코드화 하면 상세한 값을 지정가능 

	public boolean checkAttend(Card card) { // 출근체크
		
		//card.owner;  카드소유주 -> 로직성공 실패
		//처리 성공
		return true;

		// 처리 실패
		//return false;
	}
	public int checkAttend2(Card card) { // 출근체크
		
		//card.owner;  카드소유주 -> 로직성공 실패
		//처리 성공
		return 1;

		// 처리 실패
		//return false;
	}
	
	
	public boolean checkAttend(Card card,Student student) {
			// 로직 
		if (student.name == card.owner) {
			return true;
		}
		return false;
	}
	
	public boolean checkAttend(Student student) {
		return true;
	}
	
	
	// 전원을 켜는 기능 !
	public void powerOn() {
		this.isPowerOn = true; // 전원이 켜졌다는 상태로 변환
	}
	

}
