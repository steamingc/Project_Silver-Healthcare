package Project01;

import javax.swing.UIManager;

public class Main {
	//�̹��� ��� �ѹ��� ����
	String imgpath = "�� ���� ��θ� �ٿ� �����ÿ�.";

	
	public String getImgpath() {
		return imgpath;
	}

	public static void main(String[] args) {
		
		//��ü�� �׸� ����
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Unable to set LookAndFeel");
		}
		
		//�α��� â���� ����
		new _1_WindowLogin().getFrame().setVisible(true);
	}
}
