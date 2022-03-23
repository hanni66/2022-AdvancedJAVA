//***************************
// 파일명: Shape.java
// 작성자: 김하은
// 작성일: 2022.03.23
// 내용: Shape 인터페이스 작성
//***************************

public interface Shape {
	public static final double PI = 3.14;
	
	// 추상 메소드 
	public void draw();			// 도형을 그림
	public double getArea();		// 도형의 면적을 리턴
	
	// 디폴드 메소드 
	public default void redraw(){
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
