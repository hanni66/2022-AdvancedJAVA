//***************************
// 파일명: Circle.java
// 작성자: 김하은
// 작성일: 2022.03.23
// 내용: Circle 클래스
//***************************

class Circle implements Shape {
//	속성: 반지름
	private double radius;
	
	public Circle(double radius) {		//반지름을 매개변수로 받아 초기화하는 생성자 
		this.radius = radius;
	}
	
	@Override
	public double getArea() {		// 원의 넓이 구하기 
		return PI * radius * radius;
	}
	
	@Override
	public void draw() {
		// 실수형태를 정수형태로 바꾸기 
		int iradius = (int)radius;
		// 출력문 
		System.out.println("반지름이 " + iradius + "인 원입니다.");
	}
	
}
