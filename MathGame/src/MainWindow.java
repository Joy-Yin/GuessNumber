import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame{
	
	public MainWindow(){
		setLayout(null);
		setTitle("猜數字小天才");
		setSize(600, 600);
		setVisible(true);
		setResizable(false);
		getContentPane().setBackground(new Color(184, 111, 111));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1 = new JLabel("哈囉~我是猜數字小天才", SwingConstants.CENTER);
		l1.setBounds(0, 0, 600, 200);
		l1.setFont(new Font("標楷體", Font.PLAIN, 30));
		l1.setForeground(new Color(243, 231, 231));
		getContentPane().add(l1);
		
		JLabel l2 = new JLabel("你敢來挑戰我嗎?", SwingConstants.CENTER);
		l2.setBounds(0, 50, 600, 200);
		l2.setFont(new Font("標楷體", Font.PLAIN, 30));
		l2.setForeground(new Color(243, 231, 231));
		getContentPane().add(l2);
		
		JLabel l3 = new JLabel("(*^-^*)", SwingConstants.LEFT);
		l3.setBounds(0, 0, 600, 50);
		l3.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		l3.setForeground(Color.ORANGE);
		getContentPane().add(l3);
		
		JButton b1 = new JButton("當然敢啊 誰怕誰");
		getContentPane().add(b1);
		b1.setBounds(150, 225, 300, 100);
		b1.setFont(new Font("標楷體", Font.BOLD, 25));
		b1.setBackground(new Color(96, 47, 47));
		b1.setForeground(new Color(243, 231, 231));
	    b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Rule();
				dispose();
			}
	    });
	    
	    JButton b2 = new JButton("不敢 我就孬");
	    getContentPane().add(b2);
		b2.setBounds(150, 375, 300, 100);
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
