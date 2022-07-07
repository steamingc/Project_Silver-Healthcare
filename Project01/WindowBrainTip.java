package Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class WindowBrainTip {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBrainTip window = new WindowBrainTip();
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
	public WindowBrainTip() {
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
		
		JLabel lblNewLabel = new JLabel("\uCE58\uB9E4 \uC608\uBC29\uC744 \uC704\uD55C \uB1CC \uC6B4\uB3D9");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 20));
		lblNewLabel.setBounds(65, 87, 214, 27);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(12, 124, 320, 367);
		panel.add(panel_2);
		
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
