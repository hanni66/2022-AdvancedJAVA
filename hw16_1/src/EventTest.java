//***************************
// 파일명: EventTest.java
// 작성자: 김하은
// 작성일: 2022.06.03
// 내용: event처리 구현 연습 
//***************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventTest extends JFrame {
	public EventTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("카드 레이아웃");
		setSize(450, 150);
		setLayout(new BorderLayout(0,0));

		JPanel panel1 = new JPanel(new GridLayout(1,4,10,0));
		add(panel1, BorderLayout.NORTH);

		JButton btn1 = new JButton("<<");
		panel1.add(btn1);
		JButton btn2 = new JButton("<");
		panel1.add(btn2);
		JButton btn3 = new JButton(">");
		panel1.add(btn3);
		JButton btn4 = new JButton(">>");
		panel1.add(btn4);

		CardLayout card = new CardLayout();
		JPanel p2 = new JPanel(card);
		add(p2);
		JButton btn5;

		for (int i=1; i<=5; i++) {
			btn5 = new JButton("카드 번호" + i + "!");
			p2.add(btn5);
		}

		ActionListener listener1 = e -> {
			card.first(p2);
		};
		
		ActionListener listener2 = e -> {
			card.previous(p2);
		};
		
		ActionListener listener3 = e -> {
			card.next(p2);
		};
		
		ActionListener listener4 = e -> {
			card.last(p2);
		};
		
		btn1.addActionListener(listener1);
		btn2.addActionListener(listener2);
		btn3.addActionListener(listener3);
		btn4.addActionListener(listener4);
	}
	public static void main(String[] args) {
		EventTest frame = new EventTest();
		frame.setVisible(true);
		System.out.println("hw16_1 : 김하은");
	}
}