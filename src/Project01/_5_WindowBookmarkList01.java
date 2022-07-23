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
		//�׸�
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
		logo.setFocusPainted(false);	//��ư ��Ŀ���� �׵θ� ���� ����
		logo.setBounds(141, 10, 75, 62);
		// �ΰ� ��ư�� �׼� �ޱ�
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBookmarkList.dispose();
				new _3_WindowMenu().getFrame().setVisible(true);
			}
		});
		tpanel.add(logo);

		JLabel LBookmark = new JLabel("\uBD81\uB9C8\uD06C");
		LBookmark.setForeground(new Color(30, 144, 255));
		LBookmark.setFont(new Font("���ʷҵ���", Font.BOLD, 20));
		LBookmark.setBounds(143, 87, 57, 27);
		panel.add(LBookmark);

		JLabel Lexercise = new JLabel("\uC0DD\uD65C\uC6B4\uB3D9");
		Lexercise.setForeground(new Color(192, 192, 192));
		Lexercise.setFont(new Font("���ʷҵ���", Font.BOLD, 18));
		Lexercise.setBounds(12, 127, 74, 27);
		panel.add(Lexercise);

		JPanel panel_excise = new JPanel();
		panel_excise.setBounds(12, 164, 320, 138);
		panel.add(panel_excise);
		panel_excise.setLayout(null);

		JLabel Lbrain = new JLabel("\uCE58\uB9E4 \uC608\uBC29");
		Lbrain.setForeground(Color.LIGHT_GRAY);
		Lbrain.setFont(new Font("���ʷҵ���", Font.BOLD, 18));
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
		bexercisetip.setIcon(new ImageIcon(new Main().getImgpath() +"���.PNG"));
		// �ϴ� ���� ��ư�� �׼� �ޱ�
		bexercisetip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBookmarkList.dispose();
				new _7_WindowExerciseTip().getFrame().setVisible(true);
			}
		});
		bexercisetip.setBounds(15, 11, 36, 38);
		bexercisetip.setFont(new Font("���ʷҵ���", Font.BOLD, 8));
		bpanel.add(bexercisetip);

		JButton bfindButton = new JButton();
		bfindButton.setIcon(new ImageIcon(new Main().getImgpath() +"����.PNG"));
		// �ϴ� ���� ��ư�� �׼� �ޱ�
		bfindButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBookmarkList.dispose();
				new _6_WindowFindHealth().getFrame().setVisible(true);
			}
		});
		bfindButton.setFont(new Font("���ʷҵ���", Font.BOLD, 8));
		bfindButton.setBounds(84, 10, 33, 39);
		bpanel.add(bfindButton);

		JButton bHomeButton = new JButton();
		bHomeButton.setIcon(new ImageIcon(new Main().getImgpath() +"Ȩ.PNG"));
		// �ϴ� Ȩ��ư�� �׼� �ޱ�
		bHomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBookmarkList.dispose();
				new _3_WindowMenu().getFrame().setVisible(true);
			}
		});
		bHomeButton.setFont(new Font("���ʷҵ���", Font.BOLD, 8));
		bHomeButton.setBounds(153, 11, 38, 37);
		bpanel.add(bHomeButton);

		JButton bBookmarkButton = new JButton();
		bBookmarkButton.setIcon(new ImageIcon(new Main().getImgpath() +"�ϸ�ũ.PNG"));
		// �ϴ� �ϸ�ũ ��ư�� �׼� �ޱ�
		bBookmarkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBookmarkList.dispose();
				new _5_WindowBookmarkList01().getFrame().setVisible(true);
			}
		});

		bBookmarkButton.setFont(new Font("���ʷҵ���", Font.BOLD, 8));
		bBookmarkButton.setBounds(224, 12, 38, 34);
		bpanel.add(bBookmarkButton);

		JButton bMypageButton = new JButton();
		bMypageButton.setIcon(new ImageIcon(new Main().getImgpath() +"����������.PNG"));
		// �ϴ� ���������� ��ư�� �׼� �ޱ�
		bMypageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBookmarkList.dispose();
				new _4_WindowMypage().getFrame().setVisible(true);
			}
		});
		bMypageButton.setFont(new Font("���ʷҵ���", Font.BOLD, 8));
		bMypageButton.setBounds(292, 13, 32, 32);
		bpanel.add(bMypageButton);
	}
}
