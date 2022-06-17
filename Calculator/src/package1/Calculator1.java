package package1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator1 {
	private Frame frame;
	private Button zero, one, two, three, four, five, six, seven, eight, nine;

	public Calculator1() {
		Panel whole = new Panel();
		
		JFrame f = new JFrame("°è»ê±â");
		JPanel p1 = new JPanel();
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		
	}
	public void CalculatorFrame() {
		frame.setLayout(new GridLayout(3,0));
		frame.add(zero);
		frame.add(one);
		frame.add(two);
		frame.add(three);
		frame.add(four);
		frame.add(five);
		frame.add(six);
		frame.add(seven);
		frame.add(eight);
		frame.add(nine);
		
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Calculator flow = new Calculator();
		flow.startFrame();

	}

}
