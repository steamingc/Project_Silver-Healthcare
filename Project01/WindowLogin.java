package Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Panel;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;

public class WindowLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowLogin window = new WindowLogin();
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
	public WindowLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setFont(new Font("Tmon¸ó¼Ò¸® Black", Font.PLAIN, 12));
		frame.setTitle("\uCCA0\uC778\uC7A5\uC218");
		frame.getContentPane().setFont(new Font("±¼¸²", Font.PLAIN, 12));
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 344, 561);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(42, 268, 27, 21);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(124, 268, 159, 21);
		panel_1.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(124, 299, 159, 21);
		panel_1.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(42, 299, 71, 21);
		panel_1.add(lblPassword);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(135, 206, 250));
		separator.setBounds(29, 405, 279, 2);
		panel_1.add(separator);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setBounds(124, 352, 97, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(135, 206, 250));
		btnNewButton_1.setBounds(124, 430, 97, 23);
		panel_1.add(btnNewButton_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
