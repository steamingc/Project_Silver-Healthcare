package Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class WindowBookmarkList01 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBookmarkList01 window = new WindowBookmarkList01();
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
	public WindowBookmarkList01() {
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
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 344, 561);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 344, 82);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("\uBD81\uB9C8\uD06C");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 20));
		lblNewLabel.setBounds(143, 87, 57, 27);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC0DD\uD65C\uC6B4\uB3D9");
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 18));
		lblNewLabel_1.setBounds(12, 127, 74, 27);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 164, 320, 138);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uCE58\uB9E4 \uC608\uBC29");
		lblNewLabel_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(12, 312, 74, 27);
		panel.add(lblNewLabel_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(12, 349, 320, 138);
		panel.add(panel_2_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 501, 344, 60);
		panel.add(panel_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("1");
		btnNewButton_1_1_1_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 8));
		btnNewButton_1_1_1_1.setBounds(12, 10, 40, 40);
		panel_1_1.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("2");
		btnNewButton_1_1_1_1_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 8));
		btnNewButton_1_1_1_1_1.setBounds(82, 10, 40, 40);
		panel_1_1.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_2 = new JButton("3");
		btnNewButton_1_1_1_1_2.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 8));
		btnNewButton_1_1_1_1_2.setBounds(152, 10, 40, 40);
		panel_1_1.add(btnNewButton_1_1_1_1_2);
		
		JButton btnNewButton_1_1_1_1_2_1 = new JButton("4");
		btnNewButton_1_1_1_1_2_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 8));
		btnNewButton_1_1_1_1_2_1.setBounds(222, 10, 40, 40);
		panel_1_1.add(btnNewButton_1_1_1_1_2_1);
		
		JButton btnNewButton_1_1_1_1_2_2 = new JButton("5");
		btnNewButton_1_1_1_1_2_2.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 8));
		btnNewButton_1_1_1_1_2_2.setBounds(292, 10, 40, 40);
		panel_1_1.add(btnNewButton_1_1_1_1_2_2);
	}

}
