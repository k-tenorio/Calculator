package calculator;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
	
		Font font = new Font("Arial", Font.BOLD, 25);
		
		JFrame frame = new JFrame("CALCULATOR");
		frame.setSize(400, 500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		// TextField
		JTextField field = new JTextField();
		field.setFont(font);
		field.setBounds(20, 20, 340, 50);
		field.setEditable(true);
		frame.add(field);
		
		// Button 7
		JButton button7 = new JButton("7");
		button7.setBounds(20, 90, 70, 70);
		button7.setFont(font);
		frame.add(button7);
		
		button7.addActionListener(e -> {
			field.setText(field.getText() + "7");
		});
		
		// Button 8
		JButton button8 = new JButton("8");
		button8.setBounds(110, 90, 70, 70);
		button8.setFont(font);
		frame.add(button8);
		
		button8.addActionListener(e -> {
			field.setText(field.getText() + "8");
		});
		
		// Button 9
		JButton button9 = new JButton("9");
		button9.setBounds(200, 90, 70, 70);
		button9.setFont(font);
		frame.add(button9);
		
		button9.addActionListener(e -> {
			field.setText(field.getText() + "9");
		});
		
		// Button Division
		JButton buttonDivision = new JButton("/");
		buttonDivision.setBounds(290, 90, 70, 70);
		buttonDivision.setFont(font);
		frame.add(buttonDivision);
		
		buttonDivision.addActionListener(e -> {
			field.setText(field.getText() + "/");
		});
		
		// Button 4
		JButton button4 = new JButton("4");
		button4.setBounds(20, 180, 70, 70);
		button4.setFont(font);
		frame.add(button4);
		
		button4.addActionListener(e -> {
			field.setText(field.getText() + "4");
		});
		
		// Button 5
		JButton button5 = new JButton("5");
		button5.setBounds(110, 180, 70, 70);
		button5.setFont(font);
		frame.add(button5);
		
		button5.addActionListener(e -> {
			field.setText(field.getText() + "5");
		});
		
		// Button 6
		JButton button6 = new JButton("6");
		button6.setBounds(200, 180, 70, 70);
		button6.setFont(font);
		frame.add(button6);
		
		button6.addActionListener(e -> {
			field.setText(field.getText() + "6");
		});
		
		// Button Multiplication
		JButton buttonMultiplication = new JButton("*");
		buttonMultiplication.setBounds(290, 180, 70, 70);
		buttonMultiplication.setFont(font);
		frame.add(buttonMultiplication);
		
		buttonMultiplication.addActionListener(e -> {
			field.setText(field.getText() + "*");
		});
		
		// Button 1
		JButton button1 = new JButton("1");
		button1.setBounds(20, 270, 70, 70);
		button1.setFont(font);
		frame.add(button1);
		
		button1.addActionListener(e -> {
			field.setText(field.getText() + "1");
		});
		
		// Button 2
		JButton button2 = new JButton("2");
		button2.setBounds(110, 270, 70, 70);
		button2.setFont(font);
		frame.add(button2);
		
		button2.addActionListener(e -> {
			field.setText(field.getText() + "2");
		});
		
		// Button 3
		JButton button3 = new JButton("3");
		button3.setBounds(200, 270, 70, 70);
		button3.setFont(font);
		frame.add(button3);
			
		button3.addActionListener(e -> {
			field.setText(field.getText() + "3");
		});
		
		// Button Subtraction
		JButton buttonSubtraction = new JButton("-");
		buttonSubtraction.setBounds(290, 270, 70, 70);
		buttonSubtraction.setFont(font);
		frame.add(buttonSubtraction);
		
		buttonSubtraction.addActionListener(e -> {
			field.setText(field.getText() + "-");
		});
		
		// Button 0
		JButton button0 = new JButton("0");
		button0.setBounds(20, 360, 160, 70);
		button0.setFont(font);
		frame.add(button0);
		
		button0.addActionListener(e -> {
			field.setText(field.getText() + "0");
		});
		
		// Button Addition
		JButton buttonAddition = new JButton("+");
		buttonAddition.setBounds(290, 360, 70, 70);
		buttonAddition.setFont(font);
		frame.add(buttonAddition);
		
		buttonAddition.addActionListener(e -> {
			field.setText(field.getText() + "+");
		});
		
		//Button Equals
		JButton buttonEquals = new JButton("=");
		buttonEquals.setBounds(200, 360, 70, 70);
		buttonEquals.setFont(font);
		frame.add(buttonEquals);
		
		buttonEquals.addActionListener(e -> {
			try {
				String text = field.getText();
				
				int result = 0;
				
				if (text.contains("+")) {
					String parts[] = text.split("\\+");
					int a = Integer.parseInt(parts[0]);
					int b = Integer.parseInt(parts[1]);
					result = a + b;
				} else if (text.contains("-")) {
					String parts[] = text.split("\\-");
					int a = Integer.parseInt(parts[0]);
					int b = Integer.parseInt(parts[1]);
					result = a - b;
				} else if (text.contains("*")) {
					String parts[] = text.split("\\*");
					int a = Integer.parseInt(parts[0]);
					int b = Integer.parseInt(parts[1]);
					result = a * b;
				} else if (text.contains("/")) {
					String parts[] = text.split("\\/");
					int a = Integer.parseInt(parts[0]);
					int b = Integer.parseInt(parts[1]);
					result = a / b;
				}
				
				field.setText(Integer.toString(result));
				
			} catch (Exception ex) {
				field.setText("ERROR");
			}
		});
			
		frame.setVisible(true);
	}

}

