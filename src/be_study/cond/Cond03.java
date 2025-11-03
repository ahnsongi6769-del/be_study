package be_study.cond;

public class Cond03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		
 		if
		
		
		if
		
		
		if
		
		----
		else 는 혼자 사용 x 
		
		if 
		else
		
		if 
		else if
		
		if
		else if
		else if
		else if
		else if
		else if
		else if
		else 
		
*/		
		int dice = 1;
		
		if(dice == 1) {
			System.out.println("1칸 전진");
		}
		if(dice == 1) {
			System.out.println("1칸 전진");
		}else {
			System.out.println("2칸 전진");
		}
		//1~6
		if(dice == 1) {
			
		}
		else if (dice == 2){
			
		}
		else if (dice == 3) {
			
		}
		else if (dice == 4) {
			
		}
		else if (dice == 5) {
			
		}
		else if (dice == 6) {
			
		}
		//--------전체 중에 하나만 실행됨-------------------------
		if(dice == 1) {
			
		}
		else if (dice == 2){
			
		}
		else if (dice == 3) {
			
		}
		else if (dice == 4) {
			
		}
		else if (dice == 5) {
			
		}
		else {
			
		}
		//--------전체가 다 실행됨----------------------	
		if(dice == 1) {}
		if (dice == 2){}
		if (dice == 3) {}
		if (dice == 4) {}
		if (dice == 5) {}
		if (dice == 6) {}
		
		// switch 문 은 내가 어떤 값이랑 같은지 물어보는 
		if(dice >10) {}
		if(dice>0 && dice <=6) {}
		// 괄호 안에는 비교하려고 하는 대상
		switch(dice) {
		case 1:
			System.out.println("case 1");
			System.out.println("case 1");
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");
			break;
		case 5:
			System.out.println("case 5");
			break;
		case 6:
			System.out.println("case 6");
			break;
		default : // if 문과 비교해보면 else에 해당
			System.out.println("default");
		}
		
		// ----------------------------------------------------
		/* 출근시간  	일
		 * 	8시		청소
		 	9시		회의
		 	10시		업무
		 	11시		외근
		 */
		int showTime = 10; // 출근시간
		if(showTime <= 8) {
			System.out.println("청소");}
		else if (showTime <= 9){System.out.println("회의");}
		else if (showTime <= 10){System.out.println("업무");}
		else if (showTime <= 11){System.out.println("외근");}
		
		if(showTime <= 8) {// 청소
		}
		if(showTime <= 9) {// 회의
		}
		if(showTime <= 10) {// 업무
		}
		if(showTime <= 11) {// 외근
		}
			
		switch (showTime) {
		case 8: //청소
			 	// 회의
				//업무
				//외근	
		case 9: // 회의
				//업무
				//외근
		case 10: //업무
				//외근
		case 11: //외근
			break;
		// default:
		}
		
	}
}
