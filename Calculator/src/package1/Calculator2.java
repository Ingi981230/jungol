package package1;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator2 extends JFrame {
	JTextField inputText;
	String name[] = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "c", "0", "=", "+" };
	int numOne, total, oper;

	public Calculator2() {
		super("자바 계산기");

		BorderLayout layout = new BorderLayout(2, 2);
		setLayout(layout);

		inputText = new JTextField("", SwingConstants.CENTER);
		inputText.setHorizontalAlignment(JTextField.RIGHT);
		inputText.setFont(new Font(Font.SERIF, Font.BOLD, 40));
		inputText.setBounds(0, 0, 450, 50);

		JPanel pad = new JPanel(new GridLayout(4, 0));
		JButton buttons[] = new JButton[name.length];

		for (int count = 0; count < name.length; count++) {
			buttons[count] = new JButton(name[count]);
			pad.add(buttons[count]);
			PadInput handler = new PadInput();
			buttons[count].addActionListener(handler);
		}

		add(inputText, BorderLayout.NORTH);
		add(pad, BorderLayout.CENTER);

		numOne = 0;
		total = 0;
		oper = 0;

	}

	class PadInput implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String eventText = event.getActionCommand();
			if (eventText.equals("c")) {
				inputText.setText("");
				numOne = 0;
				total = 0;
			} else if (eventText.equals("+")) {
				inputText.setText("");
				total += numOne;
				oper = 0;
			} else if (eventText.equals("-")) {
				inputText.setText("");
				total = numOne;
				oper = 1;
			} else if (eventText.equals("*")) {
				inputText.setText("");
				total += numOne;
				oper = 2;
			} else if (eventText.equals("/")) {
				inputText.setText("");
				total += numOne;
				oper = 3;
			} else if (eventText.equals("=")) {
				if (oper == 0) {
					total += numOne;
					inputText.setText("" + total);
					numOne = 0;

				} else if (oper == 1) {
					total -= numOne;
					inputText.setText("" + total);
					numOne = 0;

				} else if (oper == 2) {
					total *= numOne;
					inputText.setText("" + total);
					numOne = 0;

				} else if (oper == 3) {
					total /= numOne;
					inputText.setText("" + total);
					numOne = 0;

				}
			}

			inputText.setText(inputText.getText() + event.getActionCommand());
		}
	}

	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		cal.setSize(300, 400);
		cal.setResizable(false);
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal.setVisible(true);

	}

}
