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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import Falied.BUSMAINUI;
import Falied.MyPage;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

public class chkTimetable2 {

	private JFrame frame2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {

	        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

	    }  catch (Exception e) { }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chkTimetable2 window = new chkTimetable2("","");
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param string 
	 * @param object 
	 */
	public chkTimetable2(String string, Object object) {
		initialize(string, object);
	}

	public chkTimetable2(Object object) {
		initialize(object);
	}
	
	public JFrame getFrame() {
		return frame2;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String string, Object object) {
		frame2 = new JFrame();
		frame2.getContentPane().setBackground(Color.WHITE);
		frame2.setBounds(100, 100, 843, 513);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(52, 0, 64, 82);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uBC84\uC2A4.JPG"));
		frame2.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(155, 6, 7, 473);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uC138\uB85C \uAE34\uC120.JPG"));
		frame2.getContentPane().add(lblNewLabel_6);
		
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setText("출발지 : "+string);
		lblNewLabel.setBounds(290, 0, 122, 25);
		frame2.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setText("도착지 : "+(String) object);
		lblNewLabel_1.setBounds(560, 0, 122, 25);
		frame2.getContentPane().add(lblNewLabel_1);
		
		
		JTextArea ta_BusInfo = new JTextArea();
		API_VO.apivo = new API_VO(string, (String)object);
		int idx = ApiDAO.dao.count(API_VO.apivo);
		
		String s = "[출발시간] \t[버스등급] \t[금액] \n";
		String[] arr = ApiDAO.dao.load3(API_VO.apivo);
		for(int i=0; i<idx; i++) {
			s += arr[i]+"\n";
		}
		ta_BusInfo.setText(s);
		ta_BusInfo.setBounds(266, 159, 433, 293);
		
		JScrollPane scrollPane = new JScrollPane(ta_BusInfo);
		scrollPane.setBounds(185, 37, 615, 415);
		frame2.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\\uCEA1.JPG"));
		lblNewLabel_2.setBounds(459, 2, 32, 18);
		frame2.getContentPane().add(lblNewLabel_2);
		
		frame2.setVisible(true);
	}
	
	private void initialize(Object object) {
		frame2 = new JFrame();
		frame2.getContentPane().setBackground(Color.WHITE);
		frame2.setBounds(100, 100, 843, 513);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(48, 0, 64, 82);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uBC84\uC2A4.JPG"));
		frame2.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(155, 6, 7, 473);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uC138\uB85C \uAE34\uC120.JPG"));
		frame2.getContentPane().add(lblNewLabel_6);
		
		JMenuBar menuBar1 = new JMenuBar();
		menuBar1.setBackground(Color.WHITE);
		menuBar1.setMargin(new Insets(0, 22, 0, 0));
		menuBar1.setBounds(26, 139, 111, 25);
		frame2.getContentPane().add(menuBar1);
		
		JMenu mnNewMenu = new JMenu("\uC870\uD68C/\uBCC0\uACBD/\uCDE8\uC18C");
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar1.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uC870\uD68C/\uBCC0\uACBD/\uCDE8\uC18C");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuBar menuBar2 = new JMenuBar();
		menuBar2.setMargin(new Insets(0, 22, 0, 0));
		menuBar2.setBounds(26, 190, 111, 25);
		frame2.getContentPane().add(menuBar2);
		
		JMenu mnNewMenu_1 = new JMenu("\uC6B4\uD589\uC815\uBCF4");
		menuBar2.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\uC2DC\uAC04\uD45C \uC548\uB0B4");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\uB178\uC120 \uC815\uBCF4");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JButton GOMainButton = new JButton("\uACE0\uC18D\uBC84\uC2A4\uD1B5\uD569\uC608\uB9E4");
		GOMainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();
				new BUSMAINUI().getFrame().setVisible(true);
			}
		});
		GOMainButton.setBounds(13, 75, 130, 38);
		frame2.getContentPane().add(GOMainButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setText("도착지 : "+(String) object);
		lblNewLabel_1.setBounds(560, 0, 122, 25);
		frame2.getContentPane().add(lblNewLabel_1);
		
		
		JTextArea ta_BusInfo = new JTextArea();
		API_VO.apivo = new API_VO((String)object);
		int idx = ApiDAO.dao.count(API_VO.apivo);
		
		String s = "[출발지] \t[출발시간] \t  [도착지] \t[도착시간] \t  [버스등급] \t[금액] \n";
		String[] arr = ApiDAO.dao.load(API_VO.apivo);
		for(int i=0; i<idx; i++) {
			s += arr[i]+"\n";
		}
		ta_BusInfo.setText(s);
		ta_BusInfo.setBounds(266, 159, 433, 293);
		
		JScrollPane scrollPane = new JScrollPane(ta_BusInfo);
		scrollPane.setBounds(185, 37, 615, 415);
		frame2.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\\uCEA1.JPG"));
		lblNewLabel_2.setBounds(459, 2, 32, 18);
		frame2.getContentPane().add(lblNewLabel_2);
		
		frame2.setVisible(true);
	}
	
}
