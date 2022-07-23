package Project01;

//import java.sql.*;
//import java.util.*;
//
//public class MemberDAO {
//	String driver = "oracle.jdbc.driver.OracleDriver";
//	String url = "jdbc:oracle:thin:@localhost:1521/xe";
//	String user = "c##green";
//	String password = "green1234";
//
//	private Connection con;
//	private Statement stmt;
//	private ResultSet rs;
//
//	public ArrayList<MemberVo> list(String name) {
//		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
//
//		try {
//			connDB();
//
//			String query = "SELECT * FROM PJ_LOGIN";
//			if(name != null) {
//				query += " where name ='"+name.toUpperCase()+"'";
//			}
//			System.out.println("SQL : "+query);
//			rs = stmt.executeQuery(query);
//			rs.last();
//			System.out.println("rs.getRow() : "+rs.getRow());
//			
//			if(rs.getRow()==0) {
//				System.out.println("0 row selected......");
//			} else {
//				System.out.println(rs.getRow()+" rows selected.....");
//				rs.previous();
//				while (rs.next()) {
//					String id = rs.getString("ID");
//					String pw = rs.getString("PW");
//					
//					MemberVo data = new MemberVo(id, pw);
//					list.add(data);
//				}
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
//	}
//
//	public void connDB() {
//		try {
//			Class.forName(driver);
//			System.out.println("jdbc driver loading success.");
//			con = DriverManager.getConnection(url, user, password);
//			System.out.println("oracle connection success");
////			stmt = con.createStatement();
//			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			System.out.println("statement create success");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}


import java.sql.*;

public class MemberDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	static MemberDAO dao = new MemberDAO();
	
	//로그인 전용
	public boolean list(MemberVo p) {
		try {
			connDB();
			
			String query = "SELECT * FROM PJ_LOGIN WHERE id = '" + p.getId()
			+ "' AND pw = '" + p.getPassword() + "'";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());
			
			if(rs.getRow() == 0) {
				System.out.println("0 row selected...");
			}else {
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	//내 정보 가져오기용
	public String list2 (MemberVo p) {
		String s = " ";
		try {
			connDB();
			
			String query = "SELECT NAME, ID, PW, PNUMBER, GENDER, AGE, HEIGHT, WEIGHT, BMI FROM PJ_LOGIN WHERE id = '" + MemberVo.vo.getId()
			+ "' AND pw = '" + MemberVo.vo.getPassword() + "'";
			rs = stmt.executeQuery(query);
			rs.last();
			
			s = "\r\n\r\n이름 : " 	+ rs.getString("NAME")
				+ "\r\n성별 : " 		+ rs.getString("GENDER")
				+ "\r\n나이 : " 	    + rs.getString("AGE")
				+ "\r\n연락처 : "   	+ rs.getString("PNUMBER")
				+ "\r\n키 : "    	+ rs.getString("HEIGHT")
				+ "\r\n몸무게 : "   	+ rs.getString("WEIGHT")
				+ "\r\nBMI지수 : " 	+ rs.getString("BMI");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.\n");
		}catch(Exception e) {	
			e.printStackTrace();
		}
	}
}
