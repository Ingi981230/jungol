package mainpackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import Falied.BUSMAINUI;
import Falied.MyPage;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.Font;

public class Mainpage2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {

			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

		} catch (Exception e) {
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage2 window = new Mainpage2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mainpage2() {
		initialize();
	}

	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 843, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(158, 0, 7, 473);
		lblNewLabel_6.setIcon(new ImageIcon(
				"C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uC138\uB85C \uAE34\uC120.JPG"));
		frame.getContentPane().add(lblNewLabel_6);

		JButton GoMainButton = new JButton("\uACE0 \uC18D \uBC84 \uC2A4 \uD1B5 \uD569 \uC608 \uB9E4");
		GoMainButton.setFont(new Font("SansSerif", Font.PLAIN, 11));
		GoMainButton.setBounds(16, 85, 138, 38);
		GoMainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Mainpage().getFrame().setVisible(true);
			}
		});
		frame.getContentPane().add(GoMainButton);

		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.setBounds(51, 12, 64, 61);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_1
				.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uBC84\uC2A4.JPG"));
		frame.getContentPane().add(btnNewButton_3_1);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("SansSerif", Font.BOLD, 40));
		textField.setText("\uACE0   \uC18D   \uBC84   \uC2A4");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(158, -4, 673, 132);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("\uACE0\uC18D\uBC84\uC2A4\uC608\uB9E4 \uBC14\uB85C\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new ClickStartButton().getFrame().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 57));
		btnNewButton.setBounds(158, 123, 673, 92);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("\uB3C4\uCC29\uC2DC\uAC04\uC548\uB0B4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new ArrChoose().getFrame().setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("SansSerif", Font.PLAIN, 57));
		btnNewButton_2.setBounds(158, 239, 673, 92);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\uC2DC\uAC04\uD45C \uC548\uB0B4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new chkTimetable().getFrame().setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("SansSerif", Font.PLAIN, 57));
		btnNewButton_3.setBounds(158, 357, 673, 92);
		frame.getContentPane().add(btnNewButton_3);

		JButton GoMainButton_2 = new JButton("\uB3C4 \uCC29 \uC2DC \uAC04 \uC548 \uB0B4");
		GoMainButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new ArrChoose().getFrame().setVisible(true);
			}
		});
		GoMainButton_2.setBounds(16, 140, 138, 38);
		frame.getContentPane().add(GoMainButton_2);

		JButton GoMainButton_3 = new JButton("\uC2DC \uAC04 \uD45C \uC548 \uB0B4");
		GoMainButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new chkTimetable().getFrame().setVisible(true);
			}
		});
		GoMainButton_3.setBounds(16, 190, 138, 38);
		frame.getContentPane().add(GoMainButton_3);
	}
}
