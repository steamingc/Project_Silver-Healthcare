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
		logo.setFocusPainted(false);	//��ư ��Ŀ���� �׵θ� ���� ����
		logo.setBounds(141, 10, 75, 62);
		// �ΰ� ��ư�� �׼� �ޱ�
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _3_WindowMenu().getFrame().setVisible(true);
			}
		});
		tpanel.add(logo);

		JButton mypageButton = new JButton("\uB9C8\uC774 \uD398\uC774\uC9C0");
		// ������������ư�� �׼� �ޱ�
		mypageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _4_WindowMypage().getFrame().setVisible(true);
			}
		});
		mypageButton.setFont(new Font("���ʷҵ���", Font.BOLD, 12));
		mypageButton.setBounds(35, 112, 279, 60);
		panel.add(mypageButton);

		JButton findButton = new JButton("\uB0B4 \uC8FC\uBCC0 \uC6B4\uB3D9\uC2DC\uC124");
		// �ֺ� � �ü� ã�⿡ �׼� �ޱ�
		findButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _6_WindowFindHealth().getFrame().setVisible(true);
			}
		});
		findButton.setFont(new Font("���ʷҵ���", Font.BOLD, 12));
		findButton.setBounds(35, 212, 279, 60);
		panel.add(findButton);

		JButton exercisetipButton = new JButton("\uC0DD\uD65C \uC6B4\uB3D9 \uAFC0\uD301");
		// ��Ȱ� ������ �׼� �ޱ�
		exercisetipButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _7_WindowExerciseTip().getFrame().setVisible(true);
			}
		});
		exercisetipButton.setFont(new Font("���ʷҵ���", Font.BOLD, 12));
		exercisetipButton.setBounds(35, 312, 279, 60);
		panel.add(exercisetipButton);

		JButton braintipButton = new JButton("\uCE58\uB9E4 \uC608\uBC29\uC744 \uC704\uD55C \uB1CC \uC6B4\uB3D9");
		// ġ�ſ��� ������ �׼� �ޱ�
		braintipButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
				new _8_WindowBrainTip().getFrame().setVisible(true);
			}
		});
		braintipButton.setFont(new Font("���ʷҵ���", Font.BOLD, 12));
		braintipButton.setBounds(35, 412, 279, 60);
		panel.add(braintipButton);

		JPanel bpanel = new JPanel();
		bpanel.setBounds(0, 501, 344, 60);
		panel.add(bpanel);
		bpanel.setLayout(null);

		JButton bexercisetip = new JButton();
		bexercisetip.setIcon(new ImageIcon(new Main().getImgpath() +"���.PNG"));
		// �ϴ� ���� ��ư�� �׼� �ޱ�
		bexercisetip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainMenu.dispose();
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
				frmMainMenu.dispose();
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
				frmMainMenu.dispose();
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
				frmMainMenu.dispose();
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
				frmMainMenu.dispose();
				new _4_WindowMypage().getFrame().setVisible(true);
			}
		});
		bMypageButton.setFont(new Font("���ʷҵ���", Font.BOLD, 8));
		bMypageButton.setBounds(292, 13, 32, 32);
		bpanel.add(bMypageButton);
	}
}
