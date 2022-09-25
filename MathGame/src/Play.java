import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Play extends JFrame{

	public Play() {
		setLayout(null);
		setTitle("猜數字小天才");
		setSize(600, 600);
		setVisible(true);
		setResizable(false);
		getContentPane().setBackground(new Color(184, 111, 111));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Method m = new Method();
		
		JLabel l1 = new JLabel("(*UwU*)", SwingConstants.LEFT);
		l1.setBounds(0, 0, 600, 50);
		l1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		l1.setForeground(Color.ORANGE);
		getContentPane().add(l1);
		
		JLabel l2 = new JLabel("請輸入差值:", SwingConstants.CENTER);
		l2.setBounds(0, 50, 600, 100);
		l2.setFont(new Font("標楷體", Font.PLAIN, 25));
		l2.setForeground(new Color(243, 231, 231));
		getContentPane().add(l2);
		
		JLabel l3 = new JLabel("你刪掉的數是...", SwingConstants.CENTER);
		l3.setBounds(0, 250, 600, 100);
		l3.setFont(new Font("標楷體", Font.PLAIN, 25));
		l3.setForeground(new Color(243, 231, 231));
		getContentPane().add(l3);
		l3.setVisible(false);
		
		JLabel l4 = new JLabel("", SwingConstants.CENTER);
		l4.setBounds(0, 350, 600, 200);
		l4.setFont(new Font("標楷體", Font.BOLD, 200));
		l4.setForeground(new Color(243, 231, 231));
		getContentPane().add(l4);
		
		JTextField entry = new JTextField("");
		entry.setBounds(225, 125, 150, 50);
		entry.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		getContentPane().add(entry);
		
		JButton b1 = new JButton("看結果!");
		getContentPane().add(b1);
		b1.setBounds(225, 200, 150, 50);
		b1.setFont(new Font("標楷體", Font.BOLD, 25));
		b1.setBackground(new Color(96, 47, 47));
		b1.setForeground(new Color(243, 231, 231));
	    b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String num = entry.getText();
				if(num.equals("") || !isNum(num)) {
					l3.setText("無效輸入");
					l3.setVisible(true);
					l4.setVisible(false);
				}
				else {
					m.getDifference(Integer.parseInt(num));
					l3.setText("你刪掉的數是...");
					l3.setVisible(true);
					l4.setText(m.computeD());
					l4.setVisible(true);
				}
				
				
			}
	    });
	}
	
	private boolean isNum(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
