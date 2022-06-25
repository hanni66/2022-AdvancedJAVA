//***************************
// 파일명: Driver.java
// 작성자: 김하은
// 작성일: 2022.03.23
// 내용: Driver 클래스
//***************************
public class Driver {
	public static void main(String[] args) {
		// 크기가 4인 Shape 배열을 생성하고, Circle 객체 2, Rect 객체 2개를 생성하여 배열에 저장
		Shape[] shape = new Shape[4];
		shape[0] = new Circle(10);
		shape[1] = new Circle(20);
		shape[2] = new Rect(10, 40);
		shape[3] = new Rect(20, 40);
		
		// 출력문 
		System.out.println("hw7_1 : 김하은");
		
		// 반복문을 이용하여 배열 원소들의 redraw() 메소드 호출
		for(int i=0; i<shape.length; i++) {
			shape[i].redraw();
		}
		// 반복문을 이용하여 배열 원소들의 getArea() 메소드를 호출하여 아래와 같이 출력
		for(int i=0; i<shape.length; i++) {
			System.out.println("면적은 " + shape[i].getArea());
		}
	}
}
