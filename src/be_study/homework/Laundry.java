package be_study.homework;

public class Laundry {
	 // 🔹 필드(속성)
    String clothingType;       // 의류 종류: 면, 니트, 기능성, 수건 등
    double weight;             // 무게(kg)
    boolean isColorSeparated;  // 색깔 분리했는지?
    boolean isDelicate;        // 울, 니트 등 섬세 모드 필요한지
    String detergentType;      // 세제 종류
    String washMode;           // 표준, 울코스, 찬물 세탁 등
    String status;             // 진행 상태: "대기", "세탁중", "헹굼중", "탈수중", "완료"

    // 🔹 생성자(기본 정보)
    Laundry(String clothingType, double weight) {
        this.clothingType = clothingType;
        this.weight = weight;
        this.status = "대기";
    }

    // 🔹 생성자(모든 정보)
    Laundry(String clothingType, double weight, boolean isColorSeparated,
            boolean isDelicate, String detergentType, String washMode) {
        this.clothingType = clothingType;
        this.weight = weight;
        this.isColorSeparated = isColorSeparated;
        this.isDelicate = isDelicate;
        this.detergentType = detergentType;
        this.washMode = washMode;
        this.status = "대기";
    }

    // 🔹 메소드(행동)
    void prepare() {
        System.out.println("빨래 준비중… 색 분리 및 세탁망 확인");
        status = "준비됨";
    }

    void startWashing() {
        System.out.println("세탁 시작! 모드: " + washMode);
        status = "세탁중";
    }

    void rinse() {
        System.out.println("헹굼 중…");
        status = "헹굼중";
    }

    void spinDry() {
        System.out.println("탈수 중…");
        status = "탈수중";
    }

    void finish() {
        System.out.println("세탁 완료!");
        status = "완료";
    }

    void printStatus() {
        System.out.println("현재 상태: " + status);
    }

    boolean isSuitableForDelicateMode() {
        return isDelicate || clothingType.equals("니트") || clothingType.equals("울");
    }
}
