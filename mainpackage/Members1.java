package mainpackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import Falied.AfterLoginMain;
import Falied.BUSMAINUI;
import Falied.MyPage;
import java.awt.Font;

public class Members1 {

	private JFrame frame2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private MemberDAO dao;

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
					Members1 window = new Members1();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Members1() {
		initialize();
	}

	public JFrame getFrame() {
		return frame2;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.getContentPane().setBackground(Color.WHITE);
		frame2.setBounds(100, 100, 843, 513);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		dao = new MemberDAO();

		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();
				new LoginUI2().getFrame().setVisible(true);
			}
		});
		btnLogin.setBounds(695, 0, 133, 30);
		frame2.getContentPane().add(btnLogin);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(48, 6, 64, 82);
		lblNewLabel_5
				.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uBC84\uC2A4.JPG"));
		frame2.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(154, -4, 7, 473);
		lblNewLabel_6.setIcon(new ImageIcon(
				"C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uC138\uB85C \uAE34\uC120.JPG"));
		frame2.getContentPane().add(lblNewLabel_6);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("\uD68C\uC6D0\uC815\uBCF4\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694");
		textField_1.setBounds(347, 115, 275, 30);
		frame2.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setColumns(10);
		textField_2.setBounds(304, 164, 331, 31);
		frame2.getContentPane().add(textField_2);

		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setColumns(10);
		textField_4.setBounds(304, 194, 331, 31);
		frame2.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setColumns(10);
		textField_5.setBounds(304, 220, 331, 31);
		frame2.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setColumns(10);
		textField_6.setBounds(304, 245, 331, 31);
		frame2.getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		textField_7.setColumns(10);
		textField_7.setBounds(304, 267, 331, 31);
		frame2.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setColumns(10);
		textField_8.setBounds(304, 291, 331, 31);
		frame2.getContentPane().add(textField_8);

		JButton MemberButton = new JButton("\uD68C\uC6D0\uAC00\uC785");

		// 회원가입 버튼
		MemberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// asdfsdafr
				String id = textField_2.getText();
				String password = new String(textField_4.getText());
				String apw = new String(textField_5.getText());
				String email = new String(textField_6.getText());
				String birth = new String(textField_7.getText());
				String gender = new String(textField_8.getText());

//				MemberVo vo = new MemberVo(textField_2.getText(), textField_4.getText(),textField_5.getText(),textField_6.getText(),textField_7.getText(),textField_8.getText());
//				
//				dao = new MemberDAO();
//				
//				boolean b = dao.list(vo);
//			
//				if (b == false) {
//					frame2.dispose();
//					new LoginUI2().getFrame().setVisible(true);
//					
//				}

				if (textField_2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하셔야 합니다");
				} else if (textField_4.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하셔야 합니다");
				} else if (!textField_4.getText().equals(textField_5.getText())) {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다");
				} else if (textField_4.getText().length() < 4 || textField_4.getText().length() > 20) {
					JOptionPane.showMessageDialog(null, "비밀번호는 4자리 이상, 20자리 이하만 가능합니다");
				} else if (textField_6.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이메일을 입력하셔야 합니다");
				} else if (textField_7.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "출생년도를 입력하셔야 합니다");
				} else if (textField_8.equals("")) {
					JOptionPane.showMessageDialog(null, "성별을 입력하셔야 합니다");
				} else {

					MemberVo vo = new MemberVo(textField_2.getText(), textField_4.getText(), textField_5.getText(),
							textField_6.getText(), textField_7.getText(), textField_8.getText());

					dao = new MemberDAO();

					boolean b = dao.signup(vo);

					if (b == false) {
						JOptionPane.showMessageDialog(null, "*****성공적으로 가입이 되었습니다!*****", "가입완료",
								JOptionPane.INFORMATION_MESSAGE);
						frame2.dispose();
						new LoginUI2().getFrame().setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "회원가입에 실패했습니다.", "가입 실패", JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		});

		MemberButton.setBounds(304, 319, 331, 88);
		frame2.getContentPane().add(MemberButton);

		MemberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField_2.getText();
				String password = new String(textField_4.getText());
				String apw = new String(textField_5.getText());
				String email = new String(textField_6.getText());
				String birth = new String(textField_7.getText());
				String gender = new String(textField_8.getText());

				MemberVo vo = new MemberVo(textField_2.getText(), textField_4.getText(), textField_5.getText(),
						textField_6.getText(), textField_7.getText(), textField_8.getText());

				boolean b = dao.signup(vo);

				if (b == true) {
					frame2.dispose();
					new AfterLoginMain().getFrame().setVisible(true);

				}
			}
		});

		JButton GoMainButton = new JButton("\uACE0 \uC18D \uBC84 \uC2A4 \uD1B5 \uD569 \uC608 \uB9E4");
		GoMainButton.setFont(new Font("SansSerif", Font.PLAIN, 11));
		GoMainButton.setBounds(16, 85, 138, 38);
		GoMainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();
				new Mainpage().getFrame().setVisible(true);
			}
		});
		frame2.getContentPane().add(GoMainButton);

		JButton GoMainButton_2 = new JButton("\uB3C4 \uCC29 \uC2DC \uAC04 \uC548 \uB0B4");
		GoMainButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();
				new ArrChoose().getFrame().setVisible(true);
			}
		});
		GoMainButton_2.setBounds(16, 140, 138, 38);
		frame2.getContentPane().add(GoMainButton_2);

		JButton GoMainButton_3 = new JButton("\uC2DC \uAC04 \uD45C \uC548 \uB0B4");
		GoMainButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();
				new chkTimetable().getFrame().setVisible(true);
			}
		});
		GoMainButton_3.setBounds(16, 190, 138, 38);
		frame2.getContentPane().add(GoMainButton_3);

		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(237, 168, 69, 18);
		frame2.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(237, 190, 69, 18);
		frame2.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(223, 223, 83, 18);
		frame2.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(237, 248, 69, 18);
		frame2.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\uCD9C\uC0DD\uB144\uB3C4");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(237, 271, 69, 18);
		frame2.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_7 = new JLabel("\uC131\uBCC4");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(237, 294, 69, 18);
		frame2.getContentPane().add(lblNewLabel_7);
	}
}
