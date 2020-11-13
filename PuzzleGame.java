import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PuzzleGame extends JFrame implements ActionListener {
	JButton button1; 
	JButton button2; 
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton nextOne;

	public PuzzleGame() {
		super("THE BEST PUZZLE GAME");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton(" ");
		button9 = new JButton("8");
		nextOne = new JButton("TOO HARD? NEXT ONE!");

		button1.setBounds(50, 50, 50, 50);
		button2.setBounds(100, 50, 50, 50);
		button3.setBounds(150, 50, 50, 50);
		button4.setBounds(50, 100, 50, 50);
		button5.setBounds(100, 100, 50, 50);
		button6.setBounds(150, 100, 50, 50);
		button7.setBounds(50, 150, 50, 50);
		button8.setBounds(100, 150, 50, 50);
		button9.setBounds(150, 150, 50, 50);
		nextOne.setBounds(25, 210, 210, 50);

		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(nextOne);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		nextOne.addActionListener(this);

		nextOne.setBackground(Color.yellow);
		nextOne.setForeground(Color.blue);
		
		setSize(280, 330);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent action) {
		if (action.getSource() == nextOne) {
			String button = button4.getText();
			button4.setText(button9.getText());
			button9.setText(button);
			button = button1.getText();
			button1.setText(button5.getText());
			button5.setText(button);
			button = button2.getText();
			button2.setText(button7.getText());
			button7.setText(button);
		}
		if (action.getSource() == button1) {
			String button = button1.getText();
			if (button2.getText().equals(" ")) {
				button2.setText(button);
				button1.setText(" ");
			} 
			else if (button4.getText().equals(" ")) {
				button4.setText(button);
				button1.setText(" ");
			}
		}
		if (action.getSource() == button3) {
			String button = button3.getText();
			if (button2.getText().equals(" ")) {
				button2.setText(button);
				button3.setText(" ");
			} 
			else if (button6.getText().equals(" ")) {
				button6.setText(button);
				button3.setText(" ");
			}
		}
		if (action.getSource() == button2) {
			String button = button2.getText();
			if (button1.getText().equals(" ")) {
				button1.setText(button);
				button2.setText(" ");
			} 
			else if (button3.getText().equals(" ")) {
				button3.setText(button);
				button2.setText(" ");
			} 
			else if (button5.getText().equals(" ")) {
				button5.setText(button);
				button2.setText(" ");
			}
		} 
		if (action.getSource() == button4) {
			String button = button4.getText();
			if (button1.getText().equals(" ")) {
				button1.setText(button);
				button4.setText(" ");
			} 
			else if (button7.getText().equals(" ")) {
				button7.setText(button);
				button4.setText(" ");
			} 
			else if (button5.getText().equals(" ")) {
				button5.setText(button);
				button4.setText(" ");
			}
		}
		if (action.getSource() == button5) {
			String button = button5.getText();
			if (button2.getText().equals(" ")) {
				button2.setText(button);
				button5.setText(" ");
			} 
			else if (button4.getText().equals(" ")) {
				button4.setText(button);
				button5.setText(" ");
			} 
			else if (button6.getText().equals(" ")) {
				button6.setText(button);
				button5.setText(" ");
			} 
			else if (button8.getText().equals(" ")) {
				button8.setText(button);
				button5.setText(" ");
			}
		} 
		if (action.getSource() == button6) {

			String button = button6.getText();
			if (button9.getText().equals(" ")) {
				button9.setText(button);
				button6.setText(" ");
			} 
			else if (button3.getText().equals(" ")) {
				button3.setText(button);
				button6.setText(" ");
			} 
			else if (button5.getText().equals(" ")) {
				button5.setText(button);
				button6.setText(" ");
			}

		}
		if (action.getSource() == button7) {
			String button = button7.getText();
			if (button4.getText().equals(" ")) {
				button4.setText(button);
				button7.setText(" ");
			} 
			else if (button8.getText().equals(" ")) {
				button8.setText(button);
				button7.setText(" ");
			}
		}
		if (action.getSource() == button8) {
			String button = button8.getText();
			if (button7.getText().equals(" ")) {
				button7.setText(button);
				button8.setText(" ");
			} 
			else if (button9.getText().equals(" ")) {
				button9.setText(button);
				button8.setText(" ");
			} 
			else if (button5.getText().equals(" ")) {
				button5.setText(button);
				button8.setText(" ");
			}
		}
		if (action.getSource() == button9) {
			String button = button9.getText();
			if (button6.getText().equals(" ")) {
				button6.setText(button);
				button9.setText(" ");
			} 
			else if (button8.getText().equals(" ")) {
				button8.setText(button);
				button9.setText(" ");
			}
			if (button1.getText().equals("1") && button2.getText().equals("2") && button3.getText().equals("3")
					&& button4.getText().equals("4") && button5.getText().equals("5") && button6.getText().equals("6")
					&& button7.getText().equals("7") && button8.getText().equals("8") && button9.getText().equals(" ")) {
				JOptionPane.showMessageDialog(PuzzleGame.this, "UNBELIEVABLE!! YOU WON!!");
			}
		}
	}

	public static void main(String[] args) {
		new PuzzleGame();
	}
}
