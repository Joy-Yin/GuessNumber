import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Example extends JFrame{

	public Example() {
		setLayout(null);
		setTitle("猜數字小天才");
		setSize(600, 600);
		setVisible(true);
		setResizable(false);
		getContentPane().setBackground(new Color(184, 111, 111));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1 = new JLabel("範例:", SwingConstants.CENTER);
		l1.setBounds(0, 0, 600, 100);
		l1.setFont(new Font("標楷體", Font.BOLD, 30));
		l1.setForeground(new Color(243, 231, 231));
		getContentPane().add(l1);
		
		JLabel l2 = new JLabel("假設我挑4231當被減數", SwingConstants.CENTER);
		l2.setBounds(0, 50, 600, 100);
		l2.setFont(new Font("標楷體", Font.PLAIN, 20));
		l2.setForeground(new Color(243, 231, 231));
		getContentPane().add(l2);
		
		JLabel l3 = new JLabel("(*‧o‧*)", SwingConstants.LEFT);
		l3.setBounds(0, 0, 600, 50);
		l3.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		l3.setForeground(Color.ORANGE);
		getContentPane().add(l3);
		
		JLabel l4 = new JLabel("然後挑3421當減數", SwingConstants.CENTER);
		l4.setBounds(0, 80, 600, 100);
		l4.setFont(new Font("標楷體", Font.PLAIN, 20));
		l4.setForeground(new Color(243, 231, 231));
		getContentPane().add(l4);
		
		JLabel l5 = new JLabel("注意這兩數只是調換順序而已", SwingConstants.CENTER);
		l5.setBounds(0, 110, 600, 100);
		l5.setFont(new Font("標楷體", Font.BOLD, 20));
		l5.setForeground(Color.YELLOW);
		getContentPane().add(l5);
		
		JLabel l6 = new JLabel("其中的數字不能更換", SwingConstants.CENTER);
		l6.setBounds(0, 140, 600, 100);
		l6.setFont(new Font("標楷體", Font.BOLD, 20));
		l6.setForeground(Color.YELLOW);
		getContentPane().add(l6);
		
		JLabel l7 = new JLabel("算出兩者的差值為810", SwingConstants.CENTER);
		l7.setBounds(0, 170, 600, 100);
		l7.setFont(new Font("標楷體", Font.PLAIN, 20));
		l7.setForeground(new Color(243, 231, 231));
		getContentPane().add(l7);
		
		JLabel l8 = new JLabel("由於不能刪除0", SwingConstants.CENTER);
		l8.setBounds(0, 200, 600, 100);
		l8.setFont(new Font("標楷體", Font.PLAIN, 20));
		l8.setForeground(new Color(243, 231, 231));
		getContentPane().add(l8);
		
		JLabel l9 = new JLabel("所以可以刪掉的數字剩下8或1", SwingConstants.CENTER);
		l9.setBounds(0, 230, 600, 100);
		l9.setFont(new Font("標楷體", Font.PLAIN, 20));
		l9.setForeground(new Color(243, 231, 231));
		getContentPane().add(l9);
		
		JLabel l10 = new JLabel("這裡就刪掉1得到80", SwingConstants.CENTER);
		l10.setBounds(0, 260, 600, 100);
		l10.setFont(new Font("標楷體", Font.PLAIN, 20));
		l10.setForeground(new Color(243, 231, 231));
		getContentPane().add(l10);
		
		JLabel l11 = new JLabel("跟我說80我就能猜出刪掉的數是1", SwingConstants.CENTER);
		l11.setBounds(0, 290, 600, 100);
		l11.setFont(new Font("標楷體", Font.PLAIN, 20));
		l11.setForeground(new Color(243, 231, 231));
		getContentPane().add(l11);
		
		JLabel l12 = new JLabel("就是這樣啦~趕快開始吧~~", SwingConstants.CENTER);
		l12.setBounds(0, 320, 600, 100);
		l12.setFont(new Font("標楷體", Font.PLAIN, 20));
		l12.setForeground(new Color(243, 231, 231));
		getContentPane().add(l12);
		
		JLabel l13 = new JLabel(" 還是不懂請去找開發者", SwingConstants.LEFT);
		l13.setBounds(0, 500, 600, 100);
		l13.setFont(new Font("標楷體", Font.PLAIN, 20));
		l13.setForeground(new Color(243, 231, 231));
		getContentPane().add(l13);
		
		JButton b1 = new JButton("開始!!");
		getContentPane().add(b1);
		b1.setBounds(225, 400, 150, 50);
		b1.setFont(new Font("標楷體", Font.BOLD, 25));
		b1.setBackground(new Color(96, 47, 47));
		b1.setForeground(new Color(243, 231, 231));
	    b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Play();
				dispose();
			}
	    });
	    
	    JButton b2 = new JButton("還是不要好了");
	    getContentPane().add(b2);
		b2.setBounds(455, 545, 130, 20);
		b2.setFont(new Font("標楷體", Font.BOLD, 15));
		b2.setBackground(new Color(96, 47, 47));
		b2.setForeground(new Color(243, 231, 231));
	    b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
	    });
	}

}
