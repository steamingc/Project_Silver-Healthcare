package Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

import Button.RoundedButton;
import GoogleMap.APIMain;

//import Project01.APIMain.Event;

public class _6_WindowFindHealth {

	private JFrame frame;
	private JTextField tf_location;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// 테마
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Unable to set LookAndFeel");
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_6_WindowFindHealth window = new _6_WindowFindHealth();
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
	public _6_WindowFindHealth() {
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
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 344, 561);
		frame.getContentPane().add(panel);

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
				frame.dispose();
				new _3_WindowMenu().getFrame().setVisible(true);
			}
		});
		tpanel.add(logo);

		JLabel LfindHealth = new JLabel("\uC8FC\uBCC0 \uC6B4\uB3D9 \uC2DC\uC124 \uCC3E\uAE30");
		LfindHealth.setForeground(new Color(30, 144, 255));
		LfindHealth.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		LfindHealth.setBounds(87, 121, 170, 27);
		panel.add(LfindHealth);
		
				tf_location = new JTextField();
				tf_location.setForeground(new Color(192, 192, 192));
				tf_location.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
				tf_location.setText("\uC8FC\uC18C \uCC3E\uAE30");
				tf_location.setBounds(25, 202, 297, 35);
				panel.add(tf_location);
				tf_location.setColumns(10);
		
		RoundedButton btn_find = new RoundedButton("검색");
		btn_find.setFont(new Font("Tmon몬소리 Black", Font.PLAIN, 12));
		
		//지도 검색 액션 넣기
		btn_find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				APIMain api = new APIMain();
				api.setMap(tf_location.getText());
			}
		});
		
		
		btn_find.setBounds(133, 260, 71, 35);
		panel.add(btn_find);
		
		JPanel bpanel = new JPanel();
		bpanel.setLayout(null);
		bpanel.setBounds(0, 501, 344, 60);
		panel.add(bpanel);

		JButton bexercisetip = new JButton();
		bexercisetip.setIcon(new ImageIcon(new Main().getImgpath() +"사람.PNG"));
		// 하단 꿀팁 버튼에 액션 달기
		bexercisetip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
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
				frame.dispose();
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
				frame.dispose();
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
				frame.dispose();
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
				frame.dispose();
				new _4_WindowMypage().getFrame().setVisible(true);
			}
		});
		bMypageButton.setFont(new Font("함초롬돋움", Font.BOLD, 8));
		bMypageButton.setBounds(292, 13, 32, 32);
		bpanel.add(bMypageButton);
	}
}
