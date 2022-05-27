//***************************
// 파일명: Main.java
// 작성자: 김하은
// 작성일: 2022.05.27
// 내용: GUI 기초 연습
//***************************
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("카드 레이아웃");
		setSize(450, 150);
		setLayout(new BorderLayout(0,0));
		
		JPanel panel1 = new JPanel(new GridLayout(1,4,0,10));
		add(panel1, BorderLayout.NORTH);
		
		JButton btn1 = new JButton("<<");
		panel1.add(btn1);
		JButton btn2 = new JButton("<");
		panel1.add(btn2);
		JButton btn3 = new JButton(">");
		panel1.add(btn3);
		JButton btn4 = new JButton(">>");
		panel1.add(btn4);
		
		JPanel panel2 = new JPanel(new CardLayout());
		add(panel2);
		JButton card1 = new JButton("카드 번호1!");
		panel2.add(card1, BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		Main frame = new Main();
		frame.setVisible(true);
		System.out.println("hw15_2 : 김하은");
	}

}
