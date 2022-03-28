//***************************
// 파일명: LamdaTest.java
// 작성자: 김하은
// 작성일: 2022.03.28
// 내용: 람다식 연습
//***************************
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class LamdaTest {
	public static void main(String[] args) {
		Timer t = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("beep");
			}
		});
		t.start();
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);                             
			}
			catch (InterruptedException e) {}
		}
	}
}