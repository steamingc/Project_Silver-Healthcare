package Project01;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class _1_WindowLogin {

	private JFrame frame;
	private JTextField textFieldID;
	private JPasswordField textFieldPW;
	private JTextField textFieldmsg;
//	private MemberDAO dao;
//	private MemberVo vo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Unable to set LookAndFeel");
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_1_WindowLogin window = new _1_WindowLogin();
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
	public _1_WindowLogin() {
		initialize();
	}
	
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setFont(new Font("Tmon몬소리 Black", Font.PLAIN, 12));
		frame.setTitle("\uCCA0\uC778\uC7A5\uC218");
		frame.getContentPane().setFont(new Font("굴림", Font.PLAIN, 12));
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 344, 561);
		frame.getContentPane().add(panel_1);

		JLabel LId = new JLabel("ID");
		LId.setBounds(29, 268, 27, 21);
		panel_1.add(LId);

		textFieldID = new JTextField(14);
		frame.addWindowListener( new WindowAdapter() {
		    public void windowOpened( WindowEvent e ){
		        textFieldID.requestFocus();
		    }
		}); 
		
		textFieldID.setColumns(10);
		textFieldID.setBounds(92, 268, 141, 21);
		panel_1.add(textFieldID);

		textFieldPW = new JPasswordField(14);
		textFieldPW.setBounds(92, 299, 141, 21);
		panel_1.add(textFieldPW);

		JLabel LPw = new JLabel("Password");
		LPw.setBounds(29, 299, 71, 21);
		panel_1.add(LPw);

		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(135, 206, 250));
		separator.setBounds(29, 405, 279, 2);
		panel_1.add(separator);

		JButton login = new JButton("");
		login.setIcon(new ImageIcon(new Main().getImgpath() +"로그인.PNG"));

		// 로그인 버튼에 액션 넣기
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textFieldID.getText().equals("")) {
					textFieldmsg.setText("Enter your ID");
				} else if (textFieldPW.getText().equals("")) {
					textFieldmsg.setText("Enter your password.");
				} else {
					System.out.println(textFieldID.getText());
					System.out.println(textFieldPW.getText());

					MemberVo.vo = new MemberVo(textFieldID.getText(), textFieldPW.getText());
					boolean b = MemberDAO.dao.list(MemberVo.vo);
					
					MemberVo.vo.setId(textFieldID.getText());
					MemberVo.vo.setPassword(textFieldPW.getText());
					
					if (b == true) {
						textFieldmsg.setText("Login success");
						frame.dispose();
						new _3_WindowMenu().getFrame().setVisible(true);
					} else {
						textFieldmsg.setText("Login failed");
					}
				}
			}
		});

		login.setBounds(245, 267, 76, 53);
		panel_1.add(login);

		JButton JoinMember = new JButton("");
		JoinMember.setIcon(new ImageIcon(new Main().getImgpath() +"시작하기(회원가입).PNG"));
		//회원가입 버튼에 액션 달기
		JoinMember.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	                  frame.dispose();
	                  new _2_WindowJoinMember().getFrame().setVisible(true);
	         }
	      });
		
		JoinMember.setForeground(Color.WHITE);
		JoinMember.setBackground(Color.WHITE);
		JoinMember.setBounds(124, 434, 100, 40);
		panel_1.add(JoinMember);

		textFieldmsg = new JTextField();
		textFieldmsg.setEditable(false);
		textFieldmsg.setFocusable(false);
		textFieldmsg.setBounds(29, 342, 292, 32);
		panel_1.add(textFieldmsg);
		textFieldmsg.setColumns(10);
		
		JButton logo = new JButton("");
		logo.setForeground(Color.WHITE);
		logo.setBackground(Color.WHITE);
		logo.setFocusPainted(false);
		logo.setIcon(new ImageIcon(new Main().getImgpath() +"logo_main.png"));
		logo.setBounds(65, 30, 220, 204);
		panel_1.add(logo);
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
