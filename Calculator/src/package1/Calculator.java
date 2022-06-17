package package1;

import java.awt.Button;
import java.awt.Frame;

public class Calculator {

	public static void main(String[] args) {
		Frame f = new Frame("°è»ê±â");
		f.setSize(300,200);
		f.setLayout(null);
		
		Button zero = new Button("0");
		Button one = new Button("1");
		Button two = new Button("2");
		Button three = new Button("3");
		Button four = new Button("4");
		Button five = new Button("5");
		Button six= new Button("6");
		Button seven = new Button("7");
		Button eight = new Button("8");
		Button nine = new Button("9");
		Button plus = new Button("+");
		Button minus = new Button("-");
		Button divide =new Button("/");
		zero.setSize(80,50);
		zero.setLocation(130,130);
		one.setSize(50,50);
		one.setLocation(40,80);
		two.setSize(50,50);
		two.setLocation(80,50);
		three.setSize(50,50);
		three.setLocation(90,50);
		four.setSize(50,50);
		four.setLocation(50,50);
		five.setSize(50,50);
		five.setLocation(50,50);
		six.setSize(50,50);
		six.setLocation(50,50);
		seven.setSize(50,50);
		seven.setLocation(50,50);
		eight.setSize(50,50);
		eight.setLocation(50,50);
		nine.setSize(50,50);
		nine.setLocation(50,50);
		
		f.add(zero);
		f.add(one);
		f.add(two);
		f.add(three);
		f.add(four);
		f.add(five);
		f.add(six);
		f.add(seven);
		f.add(eight);
		f.add(nine);
		f.setVisible(true);
	}

	public void startFrame() {
		
	}

}
