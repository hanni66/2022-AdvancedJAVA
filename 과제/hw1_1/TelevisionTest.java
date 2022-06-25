package hw1_1;

//파일명: TelevisionTest.java
//작성자: 202014014 김하은
//작성일: 2022.03.11
//내용: 생성자를 이해한다.

public class TelevisionTest {
	public static void main(String[] args) {
		// 객체 생성 
		Television tv1 = new Television();
		Television tv2 = new Television("My TV2");
		Television tv3 = new Television("My TV3", 100);
		
		// 출력문
		System.out.println("hw1_1 : 김하은");
		System.out.println(tv1);
		System.out.println(tv2);
		System.out.println(tv3);
	}
}
