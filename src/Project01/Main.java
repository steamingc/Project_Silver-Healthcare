package Project01;

import javax.swing.UIManager;

public class Main {
	//이미지 경로 한번에 관리
	String imgpath = "이 곳에 경로를 붙여 넣으시오.";

	
	public String getImgpath() {
		return imgpath;
	}

	public static void main(String[] args) {
		
		//전체에 테마 적용
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Unable to set LookAndFeel");
		}
		
		//로그인 창부터 시작
		new _1_WindowLogin().getFrame().setVisible(true);
	}
}
