//***************************
// 파일명: LamdaTest.java
// 작성자: 김하은
// 작성일: 2022.03.29
// 내용: 람다식 연습
//***************************
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.Timer;

public class LamdaTest {
	public static void main(String[] args) {
		System.out.println("hw10_1 : 김하은");
		Timer t = new Timer(1000, 
				(ActionEvent event) -> {System.out.println("beep");}
		);
		t.start();
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);                             
			}
			catch (InterruptedException e) {}
		}
	}
	
	public void actionPerformed(ActionEvent event) {
		System.out.println("beep");
	}
}