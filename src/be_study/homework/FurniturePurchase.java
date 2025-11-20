package be_study.homework;

public class FurniturePurchase {
    // 필드
    String furnitureType;   // 가구 종류
    int budget;             // 예산
    String storeName;       // 구매처

    // 생성자
    FurniturePurchase(String furnitureType, int budget) {
        this.furnitureType = furnitureType;
        this.budget = budget;
    }

    // 메소드
    void search() {
        System.out.println("가구를 검색합니다.");
    }

    void buy() {
        System.out.println(storeName + "에서 가구를 구매합니다.");
    }

    void deliver() {
        System.out.println("가구가 배송됩니다.");
    }
}
