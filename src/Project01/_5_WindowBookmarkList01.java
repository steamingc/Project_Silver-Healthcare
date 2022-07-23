package Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class _5_WindowBookmarkList01 {

	private JFrame frmBookmarkList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//테마
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Unable to set LookAndFeel");
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_5_WindowBookmarkList01 window = new _5_WindowBookmarkList01();
					window.frmBookmarkList.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public _5_WindowBookmarkList01() {
		initialize();
	}

	public JFrame getFrame() {
		return frmBookmarkList;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBookmarkList = new JFrame();
		frmBookmarkList.setTitle("Bookmark");
		frmBookmarkList.setBounds(100, 100, 360, 600);
		frmBookmarkList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBookmarkList.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 344, 561);
		frmBookmarkList.getContentPane().add(panel);

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
				frmBookmarkList.dispose();
				new _3_WindowMenu().getFrame().setVisible(true);
			}
		});
		tpanel.add(logo);

		JLabel LBookmark = new JLabel("\uBD81\uB9C8\uD06C");
		LBookmark.setForeground(new Color(30, 144, 255));
		LBookmark.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		LBookmark.setBounds(143, 87, 57, 27);
		panel.add(LBookmark);

		JLabel Lexercise = new JLabel("\uC0DD\uD65C\uC6B4\uB3D9");
		Lexercise.setForeground(new Color(192, 192, 192));
		Lexercise.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		Lexercise.setBounds(12, 127, 74, 27);
		panel.add(Lexercise);

		JPanel panel_excise = new JPanel();
		panel_excise.setBounds(12, 164, 320, 138);
		panel.add(panel_excise);
		panel_excise.setLayout(null);

		JLabel Lbrain = new JLabel("\uCE58\uB9E4 \uC608\uBC29");
		Lbrain.setForeground(Color.LIGHT_GRAY);
		Lbrain.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		Lbrain.setBounds(12, 312, 74, 27);
		panel.add(Lbrain);

		JPanel panel_brain = new JPanel();
		panel_brain.setLayout(null);
		panel_brain.setBounds(12, 349, 320, 138);
		panel.add(panel_brain);

		JPanel bpanel = new JPanel();
		bpanel.setLayout(null);
		bpanel.setBounds(0, 501, 344, 60);
		panel.add(bpanel);

		JButton bexercisetip = new JButton();
		bexercisetip.setIcon(new ImageIcon(new Main().getImgpath() +"사람.PNG"));
		// 하단 꿀팁 버튼에 액션 달기
		bexercisetip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBookmarkList.dispose();
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
				frmBookmarkList.dispose();
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
				frmBookmarkList.dispose();
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
				frmBookmarkList.dispose();
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
				frmBookmarkList.dispose();
				new _4_WindowMypage().getFrame().setVisible(true);
			}
		});
		bMypageButton.setFont(new Font("함초롬돋움", Font.BOLD, 8));
		bMypageButton.setBounds(292, 13, 32, 32);
		bpanel.add(bMypageButton);
	}
}
