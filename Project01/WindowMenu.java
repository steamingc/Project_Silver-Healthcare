package Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowMenu window = new WindowMenu();
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
	public WindowMenu() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 344, 82);
		panel.add(panel_1);
		
		JButton btnNewButton = new JButton("\uB9C8\uC774 \uD398\uC774\uC9C0");
		btnNewButton.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 12));
		btnNewButton.setBounds(35, 112, 279, 60);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB0B4 \uC8FC\uBCC0 \uC6B4\uB3D9\uC2DC\uC124");
		btnNewButton_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 12));
		btnNewButton_1.setBounds(35, 212, 279, 60);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uC0DD\uD65C \uC6B4\uB3D9 \uAFC0\uD301");
		btnNewButton_1_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(35, 312, 279, 60);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("\uCE58\uB9E4 \uC608\uBC29\uC744 \uC704\uD55C \uB1CC \uC6B4\uB3D9");
		btnNewButton_1_1_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 12));
		btnNewButton_1_1_1.setBounds(35, 412, 279, 60);
		panel.add(btnNewButton_1_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 501, 344, 60);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnNewButton_1_1_1_1 = new JButton("1");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1_1.setBounds(12, 10, 40, 40);
		btnNewButton_1_1_1_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 8));
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
