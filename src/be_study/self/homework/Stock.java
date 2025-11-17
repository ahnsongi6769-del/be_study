package be_study.self.homework;

public class Stock {

	    // 필드 (주식의 속성)
	    String ticker;        // 예: AAPL, TSLA, 삼성전자
	    String name;          // 회사명
	    double currentPrice;  // 현재가
	    double openPrice;     // 시가
	    double highPrice;     // 고가
	    double lowPrice;      // 저가
	    double marketCap;     // 시가총액
	    int volume;           // 거래량
	    boolean isKorean;     // 코스피/나스닥 여부

	    // 생성자 (필수 정보만)
	    Stock(String ticker, String name, double currentPrice) {
	        this.ticker = ticker;
	        this.name = name;
	        this.currentPrice = currentPrice;
	    }

	    // 생성자 (모든 정보)
	    Stock(String ticker, String name, double currentPrice,
	          double openPrice, double highPrice, double lowPrice,
	          double marketCap, int volume, boolean isKorean) {
	        this.ticker = ticker;
	        this.name = name;
	        this.currentPrice = currentPrice;
	        this.openPrice = openPrice;
	        this.highPrice = highPrice;
	        this.lowPrice = lowPrice;
	        this.marketCap = marketCap;
	        this.volume = volume;
	        this.isKorean = isKorean;
	    }

	    // 메소드 (기능)
	    void updatePrice(double newPrice) {
	        this.currentPrice = newPrice;
	    }

	    void printSummary() {
	        System.out.println(name + "(" + ticker + "): " + currentPrice + "원");
	    }

	    double priceDifference() {
	        return currentPrice - openPrice;
	    }

	    void buy(int quantity) {
	        System.out.println(quantity + "주 매수 완료");
	    }

	    void sell(int quantity) {
	        System.out.println(quantity + "주 매도 완료");
	    }
	}


