//***************************
// 파일명: MyFrame.java
// 작성자: 김하은
// 작성일: 2022.05.20
// 내용: GUI 기본을 학습한다.
//***************************


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tF1;
	private JTextField tF2;

	public static void main(String[] args) {
		System.out.println("hw15_1 : 김하은");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MyFrame() {
		setTitle("원 넓이 구하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel L1 = new JLabel("원의 반지름");
		contentPane.add(L1);
		tF1 = new JTextField();
		contentPane.add(tF1);
		tF1.setColumns(10);
		
		JLabel L2 = new JLabel("원의 넓이");
		contentPane.add(L2);
		tF2 = new JTextField();
		contentPane.add(tF2);
		tF2.setColumns(10);
	}

}
