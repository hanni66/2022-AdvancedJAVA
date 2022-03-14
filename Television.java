package hw1_1;

//파일명: Television.java
//작성자: 202014014 김하은
//작성일: 2022.03.11
//내용: 생성자를 이해한다.

public class Television {
	// 인스턴스 변수  
	private String model;    // 모델명 
	private Integer price;   // 가격 
	
	// 모델명의 getter & setter
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	// 가격의 getter & setter
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	// 생성자 1
	public Television() {
		this.model = "My TV";
		this.price = 0;
	}
	// 생성자 2
	public Television(String model) {
		this(model, 0);
	}
	// 생성자 3
	public Television(String model, Integer price) {
		this.model = model;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "모델명: " + model + " 가격: " + price;
	}
}
