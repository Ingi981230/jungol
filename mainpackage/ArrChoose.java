package mainpackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Falied.BUSMAINUI;
import Falied.MyPage;

import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ArrChoose implements ListSelectionListener {

	private JFrame frame2;
	private JTextField textField;
	private JTextField textField_1;

	private ArrayList<String> values;
	private DefaultListModel model;
	private ApiDAO dao;

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
					ArrChoose window = new ArrChoose();
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
	public ArrChoose() {
		initialize();
	}

	public JFrame getFrame() {
		return frame2;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		dao = new ApiDAO();
		frame2 = new JFrame();
		frame2.getContentPane().setBackground(Color.WHITE);
		frame2.setBounds(100, 100, 843, 513);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(49, 0, 64, 82);
		lblNewLabel_5
				.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uBC84\uC2A4.JPG"));
		frame2.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(155, 10, 7, 473);
		lblNewLabel_6.setIcon(new ImageIcon(
				"C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uC138\uB85C \uAE34\uC120.JPG"));
		frame2.getContentPane().add(lblNewLabel_6);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("SansSerif", Font.BOLD, 20));
		textField.setText(
				"\uB3C4   \uCC29   \uC9C0   \uC548   \uB0B4");
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(167, 0, 652, 82);
		frame2.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("SansSerif", Font.BOLD, 25));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("\uB3C4\uCC29\uC9C0\uB97C \uC120\uD0DD\uD558\uC138\uC694");
		textField_1.setBounds(300, 106, 352, 86);
		frame2.getContentPane().add(textField_1);
		textField_1.setColumns(10);

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

		values = new ArrayList<String>();
		model = new DefaultListModel<String>();
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("SansSerif", Font.BOLD, 20));
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB3C4\uCC29\uC9C0 \uC120\uD0DD", "\uB3D9\uB300\uAD6C", "\uC11C\uB300\uAD6C", "\uB300\uC804\uBCF5\uD569", "\uB300\uC804\uCCAD\uC0AC", "\uB300\uC804\uB3C4\uB8E1", "\uBD80\uC0B0", "\uC11C\uBD80\uC0B0", "\uC778\uCC9C", "\uB3D9\uC11C\uC6B8"}));
		comboBox.setBounds(300, 219, 352, 49);
		comboBox.addItem("도착지선택");
		comboBox.addItem("동대구");
		comboBox.addItem("서대구");
		comboBox.addItem("대전복합");
		comboBox.addItem("대전청사");
		comboBox.addItem("대전도룡");
		comboBox.addItem("부산");
		comboBox.addItem("서부산");
		comboBox.addItem("인천");
		comboBox.addItem("동서울");
		comboBox.addItem("서울경부");
		comboBox.getSelectedItem().toString();
		frame2.getContentPane().add(comboBox);
		JButton btnNewButton = new JButton("\uC120   \uD0DD   \uC644   \uB8CC");
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				new ArrChooseTime(comboBox.getSelectedItem());
			}
		});
		btnNewButton.setBounds(300, 307, 368, 73);
		frame2.getContentPane().add(btnNewButton);

		values = new ApiDAO().BusList("arrPlaceNm");
		model.addElement(values.get(1));
		model.addElement(values.get(39));
		model.addElement(values.get(49));
		model.addElement(values.get(56));
		model.addElement(values.get(68));
		model.addElement(values.get(76));
		model.addElement(values.get(473));
		model.addElement(values.get(477));
		model.addElement(values.get(481));
		model.addElement(values.get(492));

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		
//	}

//	@Override
//	public void valueChanged(ListSelectionEvent e) {
//		textField_2.setText(list.getSelectedValue());
////		textField_4.setText("동대구");
////		textField_4.setText("서대구");
////		textField_4.setText("대전복합");
////		textField_4.setText("대전청사");
////		textField_4.setText("대전도룡");
////		textField_4.setText("부산");
////		textField_4.setText("서부산");
////		textField_4.setText("동서울");
//	}
}
