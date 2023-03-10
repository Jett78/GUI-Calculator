import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class calculation 
{
     JFrame frame;
     JTextField t1,t2,t3;
	
	public calculation() 
	  {
		frame = new JFrame();
		frame.setBounds(100, 100, 753, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		JLabel topic = new JLabel("Calculation");
		topic.setFont(new Font("Times New Roman", Font.BOLD, 56));
		topic.setBounds(235, 32, 290, 81);
		frame.getContentPane().add(topic);
		
		JLabel firstnum = new JLabel("Enter first num       :");
		firstnum.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		firstnum.setBounds(24, 175, 231, 44);
		frame.getContentPane().add(firstnum);
		
		JLabel secondnum = new JLabel("Enter second num :");
		secondnum.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		secondnum.setBounds(24, 230, 231, 44);
		frame.getContentPane().add(secondnum);
		
		t1 = new JTextField();
		t1.setBounds(267, 175, 177, 44);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(267, 230, 177, 44);
		frame.getContentPane().add(t2);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int c = a+b;
				
				t3.setText(" "+c);
			}
		});
		add.setFont(new Font("Tahoma", Font.PLAIN, 56));
		add.setBounds(499, 175, 85, 64);
		frame.getContentPane().add(add);
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int c = a-b;
				
				t3.setText(" "+c);
			}
		});
		sub.setFont(new Font("Tahoma", Font.PLAIN, 56));
		sub.setBounds(594, 175, 85, 64);
		frame.getContentPane().add(sub);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int c = a*b;
				
				t3.setText(" "+c);
			}
		});
		mul.setVerticalAlignment(SwingConstants.TOP);
		mul.setFont(new Font("Tahoma", Font.PLAIN, 56));
		mul.setBounds(499, 247, 85, 64);
		frame.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int c = a/b;
				
				t3.setText(" "+c);
			}
		});
		div.setFont(new Font("Tahoma", Font.PLAIN, 40));
		div.setBounds(594, 249, 85, 64);
		frame.getContentPane().add(div);
		
		JLabel result = new JLabel("Result");
		result.setFont(new Font("Tahoma", Font.BOLD, 26));
		result.setBounds(24, 318, 101, 55);
		frame.getContentPane().add(result);
		
		t3 = new JTextField();
		t3.setBounds(127, 327, 139, 46);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
			}
		});
		reset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		reset.setBounds(499, 321, 180, 44);
		frame.getContentPane().add(reset);	
	}
	
	public static void main(String[] args) 
	{
		calculation window = new calculation();
		window.frame.setVisible(true);
				
	}

}
