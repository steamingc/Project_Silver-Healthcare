package Project01;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class _3_WindowMenu {

	private JFrame frmMainMenu;

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
					_3_WindowMenu window = new _3_WindowMenu();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public _3_WindowMenu() {
		initialize();
	}

	public JFrame getFrame() {
		return frmMainMenu;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainMenu = new JFrame();
		frmMainMenu.setTitle("Main Menu");
		frmMainMenu.setBounds(100, 100, 360, 600);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainMenu.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 344, 561);
		frmMainMenu.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel tpanel = new JPanel();
		tpanel.setBounds(0, 0, 344, 82);
		panel.add(tpanel);
		tpanel.setLayout(null);

		JButton logo = new JButton("");
		logo.setIcon(new ImageIcon(new Main().getImgpath() + "logo_small_bg.png"));
		logo.setFocusPainted(false);	//버튼 포커스시 테두리 점선 해제
		logo.setBounds(141, 10, 75, 62);
		// 로고 버튼에 액션 달기
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _3_WindowMenu().getFrame().setVisible(true);
			}
		});
		tpanel.add(logo);

		JButton mypageButton = new JButton("\uB9C8\uC774 \uD398\uC774\uC9C0");
		// 마이페이지버튼에 액션 달기
		mypageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _4_WindowMypage().getFrame().setVisible(true);
			}
		});
		mypageButton.setFont(new Font("함초롬돋움", Font.BOLD, 12));
		mypageButton.setBounds(35, 112, 279, 60);
		panel.add(mypageButton);

		JButton findButton = new JButton("\uB0B4 \uC8FC\uBCC0 \uC6B4\uB3D9\uC2DC\uC124");
		// 주변 운동 시설 찾기에 액션 달기
		findButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _6_WindowFindHealth().getFrame().setVisible(true);
			}
		});
		findButton.setFont(new Font("함초롬돋움", Font.BOLD, 12));
		findButton.setBounds(35, 212, 279, 60);
		panel.add(findButton);

		JButton exercisetipButton = new JButton("\uC0DD\uD65C \uC6B4\uB3D9 \uAFC0\uD301");
		// 생활운동 꿀팁에 액션 달기
		exercisetipButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _7_WindowExerciseTip().getFrame().setVisible(true);
			}
		});
		exercisetipButton.setFont(new Font("함초롬돋움", Font.BOLD, 12));
		exercisetipButton.setBounds(35, 312, 279, 60);
		panel.add(exercisetipButton);

		JButton braintipButton = new JButton("\uCE58\uB9E4 \uC608\uBC29\uC744 \uC704\uD55C \uB1CC \uC6B4\uB3D9");
		// 치매예방 꿀팁에 액션 달기
		braintipButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _8_WindowBrainTip().getFrame().setVisible(true);
			}
		});
		braintipButton.setFont(new Font("함초롬돋움", Font.BOLD, 12));
		braintipButton.setBounds(35, 412, 279, 60);
		panel.add(braintipButton);

		JPanel bpanel = new JPanel();
		bpanel.setBounds(0, 501, 344, 60);
		panel.add(bpanel);
		bpanel.setLayout(null);

		JButton bexercisetip = new JButton();
		bexercisetip.setIcon(new ImageIcon(new Main().getImgpath() +"사람.PNG"));
		// 하단 꿀팁 버튼에 액션 달기
		bexercisetip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _7_WindowExerciseTip().getFrame().setVisible(true);
			}
		});
		bexercisetip.setBounds(15, 11, 36, 38);
		bexercisetip.setFont(new Font("함초롬돋움", Font.BOLD, 8));
		bpanel.add(bexercisetip);

		JButton bfindButton = new JButton();
		bfindButton.setIcon(new ImageIcon(new Main().getImgpath() +"지도.PNG"));
		// 하단 지도 버튼에 액션 달기
		bfindButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _6_WindowFindHealth().getFrame().setVisible(true);
			}
		});
		bfindButton.setFont(new Font("함초롬돋움", Font.BOLD, 8));
		bfindButton.setBounds(84, 10, 33, 39);
		bpanel.add(bfindButton);

		JButton bHomeButton = new JButton();
		bHomeButton.setIcon(new ImageIcon(new Main().getImgpath() +"홈.PNG"));
		// 하단 홈버튼에 액션 달기
		bHomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _3_WindowMenu().getFrame().setVisible(true);
			}
		});
		bHomeButton.setFont(new Font("함초롬돋움", Font.BOLD, 8));
		bHomeButton.setBounds(153, 11, 38, 37);
		bpanel.add(bHomeButton);

		JButton bBookmarkButton = new JButton();
		bBookmarkButton.setIcon(new ImageIcon(new Main().getImgpath() +"북마크.PNG"));
		// 하단 북마크 버튼에 액션 달기
		bBookmarkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _5_WindowBookmarkList01().getFrame().setVisible(true);
			}
		});

		bBookmarkButton.setFont(new Font("함초롬돋움", Font.BOLD, 8));
		bBookmarkButton.setBounds(224, 12, 38, 34);
		bpanel.add(bBookmarkButton);

		JButton bMypageButton = new JButton();
		bMypageButton.setIcon(new ImageIcon(new Main().getImgpath() +"마이페이지.PNG"));
		// 하단 마이페이지 버튼에 액션 달기
		bMypageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _4_WindowMypage().getFrame().setVisible(true);
			}
		});
		bMypageButton.setFont(new Font("함초롬돋움", Font.BOLD, 8));
		bMypageButton.setBounds(292, 13, 32, 32);
		bpanel.add(bMypageButton);
	}
}
