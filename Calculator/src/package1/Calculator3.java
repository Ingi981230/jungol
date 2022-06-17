package package1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator3 implements ActionListener {
	private Frame f;
	private Panel p;
	private TextField tf;
	private Button[] btn;
	private int num1, num2;
	private char op;

	public Calculator3() {
		num1 = 0;
		num2 = 0;
		op = 'N';
		f = new Frame("계산기");
		tf = new TextField("0");
		p = new Panel();
		p.setBackground(Color.pink);
		p.setLayout(new GridLayout(4,4));
		btn = new Button[16];
		String atrArr[] = {"7","8","9","/",
				"4","5","6","*",
				"1","2","3","-",
				"C","0","=","+",};
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(atrArr[i]);
			p.add(btn[i]);
			btn[i].addActionListener(this);
		}

		f.add(tf, BorderLayout.NORTH);
		f.add(p, BorderLayout.CENTER);

		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator3();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		char c = e.getActionCommand().charAt(0);
		if(Character.isDigit(c)) { //0  ~9 
			System.out.println("숫자");
			if(tf.getText().equals("0")) {
				tf.setText( e.getActionCommand());
			}else {
				String cur = tf.getText();
				tf.setText(cur+e.getActionCommand());
			}
		}else {
			System.out.println("문자");
			if(c =='=') {
				int res = 0;
				num2 =Integer.parseInt(tf.getText());
				switch(op) {
				case '+':
					res = num1 +num2;
					break;
				case '-':
					res = num1 -num2;
					break;
				case '*':
					res = num1 *num2;
					break;
				case '/':
					res = num1 /num2;
					break;
				}
				tf.setText(String.valueOf(res));
			}else {
			op =c;
			num1 =Integer.parseInt(tf.getText());
			tf.setText("0");
			}
		}
//		System.out.println(e.getActionCommand());
	}

}
