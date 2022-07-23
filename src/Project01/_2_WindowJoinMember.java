package Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class _2_WindowJoinMember {

	private JFrame frmJoinMember;
	private JTextField tf_name;
	private JTextField tf_id;
	private JTextField tf_pw;
	private JTextField tf_pw2;
	private JTextField tf_num;
	private JTextField tf_cm;
	private JTextField tf_kg;
	private JButton logo;
	private JTextField tf_gender;
	private JTextField tf_age;

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
					_2_WindowJoinMember window = new _2_WindowJoinMember();
					window.frmJoinMember.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public _2_WindowJoinMember() {
		initialize();
	}

	public JFrame getFrame() {
		return frmJoinMember;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJoinMember = new JFrame();
		frmJoinMember.setTitle("Join Member");
		frmJoinMember.setBounds(100, 100, 360, 600);
		frmJoinMember.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJoinMember.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 344, 561);
		frmJoinMember.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel tpanel = new JPanel();
		tpanel.setBounds(0, 0, 344, 82);
		panel.add(tpanel);
		tpanel.setLayout(null);

		logo = new JButton("");
		logo.setBounds(141, 10, 75, 62);
		tpanel.add(logo);
		logo.setIcon(new ImageIcon(new Main().getImgpath() + "logo_small_bg.png"));
		logo.setFocusPainted(false);
		// 로고 버튼에 액션 달기
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmJoinMember.dispose();
				new _1_WindowLogin().getFrame().setVisible(true);
			}
		});

		JLabel LJoinMember = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		LJoinMember.setBounds(31, 89, 101, 40);
		LJoinMember.setForeground(new Color(30, 144, 255));
		LJoinMember.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		panel.add(LJoinMember);

		tf_name = new JTextField();
		tf_name.setBounds(31, 140, 282, 28);
		tf_name.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		tf_name.setForeground(Color.LIGHT_GRAY);
		tf_name.setText("\uC774\uB984");
		panel.add(tf_name);
		tf_name.setColumns(10);

		tf_id = new JTextField();
		tf_id.setBounds(31, 180, 282, 28);
		tf_id.setText("ID");
		tf_id.setForeground(Color.LIGHT_GRAY);
		tf_id.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		tf_id.setColumns(10);
		panel.add(tf_id);

		tf_pw = new JTextField();
		tf_pw.setBounds(31, 220, 282, 28);
		tf_pw.setText("\uBE44\uBC00\uBC88\uD638");
		tf_pw.setForeground(Color.LIGHT_GRAY);
		tf_pw.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		tf_pw.setColumns(10);
		tf_pw.setToolTipText("영어 대문자, 소문자, 숫자, 특수문자 중 3종류를 조합한 8자리 이상");
		panel.add(tf_pw);

		tf_pw2 = new JTextField();
		tf_pw2.setBounds(31, 260, 282, 28);
		tf_pw2.setText("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		tf_pw2.setForeground(Color.LIGHT_GRAY);
		tf_pw2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		tf_pw2.setColumns(10);
		tf_pw2.setToolTipText("영어 대문자, 소문자, 숫자, 특수문자 중 3종류를 조합한 8자리 이상");
		panel.add(tf_pw2);

		tf_gender = new JTextField();
		tf_gender.setText("\uC131\uBCC4");
		tf_gender.setForeground(Color.LIGHT_GRAY);
		tf_gender.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		tf_gender.setColumns(10);
		tf_gender.setBounds(31, 300, 282, 28);
		panel.add(tf_gender);

		tf_age = new JTextField();
		tf_age.setText("\uB098\uC774");
		tf_age.setForeground(Color.LIGHT_GRAY);
		tf_age.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		tf_age.setColumns(10);
		tf_age.setBounds(31, 340, 282, 28);
		panel.add(tf_age);

		tf_num = new JTextField();
		tf_num.setBounds(31, 380, 282, 28);
		tf_num.setText("\uD734\uB300\uD3F0 \uBC88\uD638");
		tf_num.setForeground(Color.LIGHT_GRAY);
		tf_num.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		tf_num.setColumns(10);
		panel.add(tf_num);

		tf_cm = new JTextField();
		tf_cm.setBounds(31, 420, 282, 28);
		tf_cm.setText("\uD0A4 (cm)");
		tf_cm.setForeground(Color.LIGHT_GRAY);
		tf_cm.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		tf_cm.setColumns(10);
		panel.add(tf_cm);

		tf_kg = new JTextField();
		tf_kg.setBounds(31, 460, 282, 28);
		tf_kg.setText("\uBAB8\uBB34\uAC8C (kg)");
		tf_kg.setForeground(Color.LIGHT_GRAY);
		tf_kg.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		tf_kg.setColumns(10);
		panel.add(tf_kg);

		JButton JoinFin = new JButton("");
		JoinFin.setIcon(new ImageIcon(new Main().getImgpath() + "가입완료.PNG"));
		JoinFin.setBounds(31, 498, 282, 34);
		
		// 회원가입 버튼에 액션 달기
		JoinFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (tf_name.getText().equals("") || tf_name.getText().equals("이름")) {
					JOptionPane.showMessageDialog(null, "이름을 입력하셔야 합니다");
				} else if (tf_id.getText().equals("") || tf_id.getText().equals("ID")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하셔야 합니다");
				} else if (tf_pw.getText().equals("") || tf_pw.getText().equals("비밀번호")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하셔야 합니다");
				} else if (!tf_pw.getText().equals(tf_pw2.getText())) {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다");
				} else if (tf_pw.getText().length() < 4 || tf_pw.getText().length() > 20) {
					JOptionPane.showMessageDialog(null, "비밀번호는 4자리 이상, 20자리 이하만 가능합니다");
				} else if (tf_gender.getText().equals("") || tf_gender.getText().equals("성별")) {
					JOptionPane.showMessageDialog(null, "성별을 입력하셔야 합니다");
				} else if (tf_age.getText().equals("") || tf_age.getText().equals("나이")) {
					JOptionPane.showMessageDialog(null, "나이를 입력하셔야 합니다");
				} else if (tf_num.getText().equals("") || tf_num.getText().equals("휴대폰 번호")) {
					JOptionPane.showMessageDialog(null, "휴대폰 번호를 입력하셔야 합니다");
				} else if (tf_cm.getText().equals("") || tf_cm.getText().equals("키 (cm)")) {
					JOptionPane.showMessageDialog(null, "키를 입력하셔야 합니다");
				} else if (tf_kg.getText().equals("") || tf_kg.getText().equals("몸무게 (kg)")) {
					JOptionPane.showMessageDialog(null, "몸무게를 입력하셔야 합니다");
				} else {
					JoinDAO dao = new JoinDAO();
					MemberVo vo = new MemberVo();

					vo.setId(tf_id.getText());
					vo.setPassword(tf_pw.getText());
					vo.setName(tf_name.getText());
					vo.setPnumber(tf_num.getText());
					vo.setHeight(tf_cm.getText());
					vo.setWeight(tf_kg.getText());
					vo.setAge(tf_age.getText());
					vo.setGender(tf_gender.getText());

					if (vo.getBmi() == null) {
						double a = vo.setBmi();
						vo.setBmi(Double.toString(a));
					}

					int result = dao.insertData(vo);
					if (result != 0) {
						JOptionPane.showMessageDialog(null, "*****성공적으로 가입이 되었습니다!*****", "가입완료",
								JOptionPane.INFORMATION_MESSAGE);
						frmJoinMember.dispose();
						new _1_WindowLogin().getFrame().setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "회원가입에 실패했습니다.", "가입 실패", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		JoinFin.setBackground(new Color(30, 144, 255));
		JoinFin.setForeground(Color.WHITE);
		JoinFin.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		panel.add(JoinFin);

		JLabel Lcon = new JLabel(
				"\uAC00\uC785\uD558\uBA74 \uC774\uC6A9\uC57D\uAD00\uACFC \uAC1C\uC778\uC815\uBCF4\uCDE8\uAE09\uBC29\uCE68\uC5D0 \uB3D9\uC758\uD55C \uAC83\uC73C\uB85C \uBD05\uB2C8\uB2E4.");
		Lcon.setBounds(43, 536, 263, 15);
		Lcon.setFont(new Font("맑은 고딕", Font.PLAIN, 9));
		panel.add(Lcon);
	}
}
