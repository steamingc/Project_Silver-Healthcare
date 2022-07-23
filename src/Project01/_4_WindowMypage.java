package Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.UIManager;

import Calendar.MemoCalendar;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JTextArea;

public class _4_WindowMypage {

	private JFrame frmMyPage;

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
					_4_WindowMypage window = new _4_WindowMypage();
					window.frmMyPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public _4_WindowMypage() {
		initialize();
	}

	public JFrame getFrame() {
		return frmMyPage;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyPage = new JFrame();
		frmMyPage.getContentPane().setBackground(Color.WHITE);
		frmMyPage.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 344, 561);
		frmMyPage.getContentPane().add(panel);

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
				frmMyPage.dispose();
				new _3_WindowMenu().getFrame().setVisible(true);
			}
		});
		tpanel.add(logo);

		JLabel lmypage = new JLabel("\uB9C8\uC774 \uD398\uC774\uC9C0");
		lmypage.setForeground(new Color(30, 144, 255));
		lmypage.setFont(new Font("���ʷҵ���", Font.BOLD, 20));
		lmypage.setBounds(122, 87, 101, 27);
		panel.add(lmypage);
		
		JPanel info_panel = new JPanel();
		info_panel.setBounds(12, 125, 320, 282);
		panel.add(info_panel);
		info_panel.setLayout(null);
		
		JTextArea MyInfo = new JTextArea();
		MyInfo.setText(MemberDAO.dao.list2(MemberVo.vo));
		MyInfo.setBounds(0, 0, 320, 282);
		info_panel.add(MyInfo);
		
		JButton chkHealth = new JButton("\uB098\uC758 \uC6B4\uB3D9 \uAE30\uB85D \uBCF4\uB7EC \uAC00\uAE30");
		chkHealth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemoCalendar();
			}
		});
		chkHealth.setFont(chkHealth.getFont().deriveFont(chkHealth.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		chkHealth.setBounds(12, 433, 320, 42);
		chkHealth.setBorderPainted(false);	//��ư �ܰ��� ���ֱ�
		chkHealth.setFocusPainted(false);	//���õǾ��� �� �׵θ� ��� �� ��
		chkHealth.setContentAreaFilled(false);//��ư�� ���뿵�� ä��� �� ��
		panel.add(chkHealth);

		JPanel bpanel = new JPanel();
		bpanel.setLayout(null);
		bpanel.setBounds(0, 501, 344, 60);
		panel.add(bpanel);

		JButton bexercisetip = new JButton();
		bexercisetip.setIcon(new ImageIcon(new Main().getImgpath() +"���.PNG"));
		// �ϴ� ���� ��ư�� �׼� �ޱ�
		bexercisetip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMyPage.dispose();
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
				frmMyPage.dispose();
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
				frmMyPage.dispose();
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
				frmMyPage.dispose();
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
				frmMyPage.dispose();
				new _4_WindowMypage().getFrame().setVisible(true);
			}
		});
		bMypageButton.setFont(new Font("���ʷҵ���", Font.BOLD, 8));
		bMypageButton.setBounds(292, 13, 32, 32);
		bpanel.add(bMypageButton);
		
		frmMyPage.setTitle("My Page");
		frmMyPage.setBounds(100, 100, 360, 600);
		frmMyPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
