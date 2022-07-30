package calculator;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtField;
	private JTextField textField_1;
int choice;
double ans,reasult,num;
private JTextField txtByRishabInnani;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 562);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtField = new JTextField();
		txtField.setFont(new Font("Arial", Font.BOLD, 18));
		txtField.setBorder(null);
		txtField.setFocusTraversalKeysEnabled(false);
		txtField.setBackground(Color.WHITE);
		txtField.setEnabled(false);
		txtField.setEditable(false);
		txtField.setFocusable(false);
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setBounds(0, 11, 436, 54);
		contentPane.add(txtField);
		txtField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.BOLD, 22));
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBorder(null);
		textField_1.setBounds(0, 59, 436, 61);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"1");
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(10, 136, 71, 61);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"2");
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_1.setBounds(118, 136, 71, 61);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"3");
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_2.setBounds(225, 136, 71, 61);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				num=Double.parseDouble(textField_1.getText());
				choice=4;
				textField_1.setText(" ");
				txtField.setText(num+"/");
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_3.setBounds(335, 136, 71, 61);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"4");
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_4.setBounds(10, 230, 71, 61);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"5");
			}
		});
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_5.setBounds(118, 230, 71, 61);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"6");
			}
		});
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_6.setBounds(225, 230, 71, 61);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("x");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num=Double.parseDouble(textField_1.getText());
				choice=3;
				textField_1.setText(" ");
				txtField.setText(num+"*");
			}
		});
		btnNewButton_7.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_7.setBounds(335, 230, 71, 61);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"7");
			}
		});
		btnNewButton_8.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_8.setBounds(10, 316, 71, 61);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("c");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(" ");
				textField_1.setText(" ");
			}
		});
		btnNewButton_9.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_9.setBounds(10, 413, 71, 61);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("8");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"8");
			}
		});
		btnNewButton_10.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_10.setBounds(118, 316, 71, 61);
		contentPane.add(btnNewButton_10);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"0");
			}
		});
		button0.setFont(new Font("Arial", Font.BOLD, 18));
		button0.setForeground(Color.BLACK);
		button0.setBackground(Color.WHITE);
		button0.setBounds(118, 413, 71, 61);
		contentPane.add(button0);
		
		JButton btnNewButton_12 = new JButton("9");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"9");
			}
		});
		btnNewButton_12.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_12.setBounds(225, 316, 71, 61);
		contentPane.add(btnNewButton_12);
		
				
		JButton btnNewButton_14 = new JButton("-");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(textField_1.getText());
				choice=2;
				textField_1.setText(" ");
				txtField.setText(num+"-");
			
			}
		});
		btnNewButton_14.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_14.setBounds(335, 316, 71, 61);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
     			num= Double.parseDouble(textField_1.getText());
     			choice=1;
     			textField_1.setText(" ");
				txtField.setText(num+"+");
			}
		});
		btnNewButton_15.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_15.setBounds(335, 413, 71, 61);
		contentPane.add(btnNewButton_15);
		
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(choice) {
				case 1:
					ans=num + Double.parseDouble(textField_1.getText());
					txtField.setText(num+"+"+textField_1.getText());
								textField_1.setText(Double.toString(ans));
					break;
				case 2:
					ans=num - Double.parseDouble(textField_1.getText());
					txtField.setText(num+"-"+textField_1.getText());
					textField_1.setText(Double.toString(ans));
					break;
				case 3:
					ans=num * Double.parseDouble(textField_1.getText());
					txtField.setText(num+"*"+textField_1.getText());
					textField_1.setText(Double.toString(ans));
					break;
				case 4:
					ans=num / Double.parseDouble(textField_1.getText());
					txtField.setText(num+"/"+textField_1.getText());
					textField_1.setText(Double.toString(ans));
					break;
					
				}
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_13.setBounds(225, 412, 71, 61);
		contentPane.add(btnNewButton_13);
		
		txtByRishabInnani = new JTextField();
		txtByRishabInnani.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 11));
		txtByRishabInnani.setText("by Rishab Innani");
		txtByRishabInnani.setBounds(213, 494, 193, 20);
		contentPane.add(txtByRishabInnani);
		txtByRishabInnani.setColumns(10);

	}
}
