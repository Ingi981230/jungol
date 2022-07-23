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

public class LoginUI2 {

	private JFrame frame2;
	private JTextField textField_1;
	private JTextField textFieldID;
	private JTextField textFieldPW;
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
					LoginUI2 window = new LoginUI2();
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
	public LoginUI2() {
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
		frame2.getContentPane().setForeground(Color.BLACK);
		frame2.getContentPane().setBackground(Color.WHITE);
		frame2.setBounds(100, 100, 843, 513);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);

		JButton btnMember = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();
				new Members1().getFrame().setVisible(true);
			}
		});
		
		
		btnMember.setBounds(250, 278, 432, 37);
		frame2.getContentPane().add(btnMember);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(52, 6, 64, 82);
		lblNewLabel_5
				.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uBC84\uC2A4.JPG"));
		frame2.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(159, 12, 7, 473);
		lblNewLabel_6.setIcon(new ImageIcon(
				"C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uC138\uB85C \uAE34\uC120.JPG"));
		frame2.getContentPane().add(lblNewLabel_6);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("SansSerif", Font.BOLD, 28));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("\uD68C\uC6D0 \uB85C\uADF8\uC778");
		textField_1.setBounds(250, 151, 432, 37);
		frame2.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textFieldID = new JTextField();
		textFieldID.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldID.setColumns(10);
		textFieldID.setBounds(371, 190, 206, 35);
		frame2.getContentPane().add(textFieldID);

		JButton login = new JButton("\uB85C\uADF8\uC778");
		
		//로그인 버튼에 액션 넣기
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String myid = textFieldID.getText();
				String mypwd = new String(textFieldPW.getText());
				
				
				MemberVo vo = new MemberVo(textFieldID.getText(), textFieldPW.getText());
				
				dao = new MemberDAO();
				
				boolean b = dao.list(vo);
			
				if (b == true) {
					JOptionPane.showMessageDialog(null, "로그인에 성공하였습니다");
					frame2.dispose();
					new Mainpage2().getFrame().setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "로그인에 실패하였습니다");
				}
			}
		});

	
		login.setToolTipText("");
		login.setBounds(585, 190, 97, 67);
		frame2.getContentPane().add(login);

		textFieldPW = new JTextField();
		textFieldPW.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldPW.setColumns(10);
		textFieldPW.setBounds(371, 231, 206, 35);
		frame2.getContentPane().add(textFieldPW);

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
		
		JLabel lblNewLabel = new JLabel("I D");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(260, 192, 99, 25);
		frame2.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PassWord");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("SansSerif", Font.BOLD, 19));
		lblPassword.setBounds(256, 233, 103, 25);
		frame2.getContentPane().add(lblPassword);
	}
}
