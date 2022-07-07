package Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class WindowJoinMember {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtcm;
	private JTextField txtkg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowJoinMember window = new WindowJoinMember();
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
	public WindowJoinMember() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uCCA0\uC778\uC7A5\uC218");
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 344, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setBounds(31, 92, 101, 40);
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 344, 82);
		panel.add(panel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setText("\uC774\uB984");
		textField.setBounds(31, 167, 282, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uD544\uC218\uC785\uB825");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(31, 142, 57, 15);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setText("\uC774\uBA54\uC77C");
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(31, 211, 282, 34);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("\uBE44\uBC00\uBC88\uD638");
		textField_2.setForeground(Color.LIGHT_GRAY);
		textField_2.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(31, 255, 282, 34);
		textField_2.setToolTipText("영어 대문자, 소문자, 숫자, 특수문자 중 3종류를 조합한 8자리 이상");
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		textField_3.setForeground(Color.LIGHT_GRAY);
		textField_3.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(31, 299, 282, 34);
		textField_3.setToolTipText("영어 대문자, 소문자, 숫자, 특수문자 중 3종류를 조합한 8자리 이상");
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("\uD734\uB300\uD3F0 \uBC88\uD638");
		textField_4.setForeground(Color.LIGHT_GRAY);
		textField_4.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(31, 343, 282, 34);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC120\uD0DD\uC785\uB825");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(31, 387, 57, 15);
		panel.add(lblNewLabel_1_1);
		
		txtcm = new JTextField();
		txtcm.setText("\uD0A4 (cm)");
		txtcm.setForeground(Color.LIGHT_GRAY);
		txtcm.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		txtcm.setColumns(10);
		txtcm.setBounds(31, 410, 282, 34);
		panel.add(txtcm);
		
		txtkg = new JTextField();
		txtkg.setText("\uBAB8\uBB34\uAC8C (kg)");
		txtkg.setForeground(Color.LIGHT_GRAY);
		txtkg.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		txtkg.setColumns(10);
		txtkg.setBounds(31, 454, 282, 34);
		panel.add(txtkg);
		
		JButton btnNewButton = new JButton("\uAC00\uC785 \uC644\uB8CC");
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		btnNewButton.setBounds(31, 498, 282, 34);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("\uAC00\uC785\uD558\uBA74 \uC774\uC6A9\uC57D\uAD00\uACFC \uAC1C\uC778\uC815\uBCF4\uCDE8\uAE09\uBC29\uCE68\uC5D0 \uB3D9\uC758\uD55C \uAC83\uC73C\uB85C \uBD05\uB2C8\uB2E4.");
		lblNewLabel_2.setFont(new Font("함초롬돋움", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(43, 536, 263, 15);
		panel.add(lblNewLabel_2);
	}
}
