//***************************
// 파일명: LamdaTest.java
// 작성자: 김하은
// 작성일: 2022.03.29
// 내용: 두개의 정수를 받아서 두개의 정수를 곱한 값을 반환하는 프로그램 작성.
//***************************
import java.util.Scanner;

interface Multi {
	int multiply(int x, int y);
}

public class LamdaTest {
	public static void main(String[] args) {
		System.out.println("hw10_2 : 김하은");
		Multi m = (x, y) -> {return x * y;};
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		
		x = sc.nextInt();
		y= sc.nextInt();
		System.out.println(m.multiply(x, y));
		
		sc.close();
	}
}  