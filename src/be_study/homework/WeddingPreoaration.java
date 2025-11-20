package be_study.homework;

public class WeddingPreoaration {
	
	class WeddingPreparation {
	    // 필드 (결혼 준비 상태)
	    int budget;              // 예산
	    int checklistProgress;   // 체크리스트 진행도 (0~100)
	    boolean venueBooked;     // 예식장 예약 여부
	    boolean dressSelected;   // 드레스/예복 선택 여부
	    boolean guestListDone;   // 하객 명단 확정 여부

	    // 생성자
	    WeddingPreparation(int budget) {
	        this.budget = budget;
	        this.checklistProgress = 0;	      
	        this.venueBooked = false;
	        this.dressSelected = false;
	        this.guestListDone = false;
	    }

	    // 메소드 (행동)
	    void bookVenue() {
	        venueBooked = true;
	        checklistProgress += 30;
	        System.out.println("예식장을 예약했습니다!");
	    }

	    void selectDress() {
	        dressSelected = true;
	        checklistProgress += 20;
	        System.out.println("드레스/예복을 선택했습니다.");
	    }

	    void finalizeGuestList() {
	        guestListDone = true;
	        checklistProgress += 20;
	        System.out.println("하객 명단을 확정했습니다.");
	    }



	    void showStatus() {
	        System.out.println("\n=== 결혼 준비 상태 ===");
	        System.out.println("예산: " + budget);
	        System.out.println("준비 진행도: " + checklistProgress + "%");
	       
	        System.out.println("예식장 예약: " + venueBooked);
	        System.out.println("드레스/예복: " + dressSelected);
	        System.out.println("하객 명단 완료: " + guestListDone);
	    }
	}}
