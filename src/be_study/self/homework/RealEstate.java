package be_study.self.homework;

public class RealEstate {
    String address;        // 주소
    double area;           // 면적(m²)
    double price;          // 가격
    String type;           // 아파트/오피스텔/상가/토지 등
    int builtYear;         // 준공년도
    boolean isForSale;     // 매매/전세/월세 가능 여부

    // 생성자
    RealEstate(String address, double area, double price, String type) {
        this.address = address;
        this.area = area;
        this.price = price;
        this.type = type;
    }

    // 메소드
    void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    void printInfo() {
        System.out.println(type + " | " + address + " | " + area + "㎡ | " + price + "만원");
    }

    double pricePerSquareMeter() {
        return price / area;
    }
}
