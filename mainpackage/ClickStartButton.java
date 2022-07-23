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

public class ClickStartButton implements ListSelectionListener {

	private JFrame frame2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	private ArrayList<String> values;
	private DefaultListModel model;
	private ApiDAO dao;
	private JTextField textField_3;
	private JList<String> list;

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
					ClickStartButton window = new ClickStartButton();
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
	public ClickStartButton() {
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
		lblNewLabel_5.setBounds(47, 2, 64, 82);
		lblNewLabel_5
				.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uBC84\uC2A4.JPG"));
		frame2.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(162, 0, 7, 473);
		lblNewLabel_6.setIcon(new ImageIcon(
				"C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uC138\uB85C \uAE34\uC120.JPG"));
		frame2.getContentPane().add(lblNewLabel_6);

		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.BOLD, 20));
		textField.setText(
				"\uACE0   \uC18D   \uBC84   \uC2A4   \uC608   \uB9E4 ");
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(177, 0, 642, 82);
		frame2.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("\uCD9C/\uB3C4\uCC29\uC9C0 \uC120\uD0DD");
		textField_1.setBounds(300, 80, 352, 38);
		frame2.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setText("\uCD9C\uBC1C\uC9C0");
		textField_2.setBounds(300, 121, 153, 49);
		frame2.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uC655\uBCF5.JPG"));
		lblNewLabel.setBounds(465, 129, 19, 33);
		frame2.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1
				.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022PDJJA\\Desktop\\2222\\\uCEA1\uCC98.JPG"));
		lblNewLabel_1.setBounds(300, 174, 352, 15);
		frame2.getContentPane().add(lblNewLabel_1);

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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(409, 194, 243, 166);
		frame2.getContentPane().add(scrollPane);

		values = new ArrayList<String>();
		model = new DefaultListModel<String>();
		list = new JList<String>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(model);
		scrollPane.setViewportView(list);

		textField_3 = new JTextField();
		textField_3.setText("\uD130\uBBF8\uB110 \uC774\uB984");
		textField_3.setBounds(284, 193, 122, 167);
		frame2.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB3C4\uCC29\uC9C0 \uC120\uD0DD", "\uB3D9\uB300\uAD6C", "\uC11C\uB300\uAD6C", "\uB300\uC804\uBCF5\uD569", "\uB300\uC804\uCCAD\uC0AC", "\uB300\uC804\uB3C4\uB8E1", "\uBD80\uC0B0", "\uC11C\uBD80\uC0B0", "\uC778\uCC9C", "\uB3D9\uC11C\uC6B8"}));
		comboBox.setBounds(503, 121, 149, 49);
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
		JButton btnNewButton = new JButton("\uC120\uD0DD\uC644\uB8CC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				new Arrivaltime(textField_2.getText(), comboBox.getSelectedItem());
			}
		});
		btnNewButton.setBounds(284, 368, 368, 73);
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

		list.addListSelectionListener(this);

	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		
//	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		textField_2.setText(list.getSelectedValue());
//		textField_4.setText("동대구");
//		textField_4.setText("서대구");
//		textField_4.setText("대전복합");
//		textField_4.setText("대전청사");
//		textField_4.setText("대전도룡");
//		textField_4.setText("부산");
//		textField_4.setText("서부산");
//		textField_4.setText("동서울");
	}
}
