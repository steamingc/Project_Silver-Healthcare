package Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import News.News;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class _7_WindowExerciseTip {

	private JFrame frmExerciseTip;
	private News news;
	

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
					_7_WindowExerciseTip window = new _7_WindowExerciseTip();
					window.frmExerciseTip.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public _7_WindowExerciseTip() {
		initialize();
	}

	public JFrame getFrame() {
		return frmExerciseTip;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExerciseTip = new JFrame();
		frmExerciseTip.setTitle("Exercise Tip");
		frmExerciseTip.setBounds(100, 100, 360, 600);
		frmExerciseTip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExerciseTip.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 344, 561);
		frmExerciseTip.getContentPane().add(panel);

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
				frmExerciseTip.dispose();
				new _3_WindowMenu().getFrame().setVisible(true);
			}
		});
		tpanel.add(logo);

		JLabel LExerTip = new JLabel("\uC0DD\uD65C \uC6B4\uB3D9 \uD301");
		LExerTip.setForeground(new Color(30, 144, 255));
		LExerTip.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		LExerTip.setBounds(118, 87, 107, 27);
		panel.add(LExerTip);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 10, 10);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 124, 320, 367);
		panel.add(scrollPane);
		
		
		JTextArea ta_article = new JTextArea();
		ta_article.setFont(new Font("Monospaced", Font.PLAIN, 13));
		ta_article.setBounds(0, 0, 320, 367);
		
		news = new News();
		String[] arr = news.getArr();
		String[] arr2 = news.getArr2();
		String textarr = "";
		
		
		
		for(int i=0; i<arr.length; i++) {
			textarr += arr[i] + "\n" + arr2[i] +"\n\n";
		}
		
		ta_article.setText(textarr);
		scrollPane.setViewportView(ta_article);

		JPanel bpanel = new JPanel();
		bpanel.setLayout(null);
		bpanel.setBounds(0, 501, 344, 60);
		panel.add(bpanel);

		JButton bexercisetip = new JButton();
		bexercisetip.setIcon(new ImageIcon(new Main().getImgpath() +"사람.PNG"));
		// 하단 꿀팁 버튼에 액션 달기
		bexercisetip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmExerciseTip.dispose();
				new _7_WindowExerciseTip().getFrame().setVisible(true);
			}
		});
		bexercisetip.setBounds(15, 11, 36, 38);
		bexercisetip.setFont(new Font("맑은 고딕", Font.BOLD, 8));
		bpanel.add(bexercisetip);

		JButton bfindButton = new JButton();
		bfindButton.setIcon(new ImageIcon(new Main().getImgpath() +"지도.PNG"));
		// 하단 지도 버튼에 액션 달기
		bfindButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmExerciseTip.dispose();
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
				frmExerciseTip.dispose();
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
				frmExerciseTip.dispose();
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
				frmExerciseTip.dispose();
				new _4_WindowMypage().getFrame().setVisible(true);
			}
		});
		bMypageButton.setFont(new Font("함초롬돋움", Font.BOLD, 8));
		bMypageButton.setBounds(292, 13, 32, 32);
		bpanel.add(bMypageButton);
	}
}
