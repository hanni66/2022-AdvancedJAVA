//***************************
// 파일명: Rect.java
// 작성자: 김하은
// 작성일: 2022.03.23
// 내용: Rect 클래스
//***************************
class Rect implements Shape{
	private double area;	// 넓이
	private double height;	// 높이 
	
	public Rect(double area, double height) {		//넓이와 높이를 매개변수로 받아 초기화하는 생성자 
		this.area = area;
		this.height = height;
	}
	
	@Override
	public double getArea() {		// 사각형의 넓이 구하기 
		return area * height;
	}
	
	@Override
	public void draw() {
		// 실수형태를 정수형태로 바꾸기 
		int iarea = (int)area;
		int iheight = (int)height;
		// 출력문 
		System.out.println(iarea + "X" + iheight + "크기의 사각형입니다.");
	}
}