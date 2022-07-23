package Project01;

import java.sql.*;
import java.util.*;

public class JoinDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	private Connection con;
	private PreparedStatement pstmt;
	private String query;

	static MemberDAO dao = new MemberDAO();

	// 로그인 전용
	public int insertData(MemberVo p) {
		int result = 0;

		try {
			connDB();
			
			query = "insert into PJ_LOGIN (name, id, pw, gender, age, pnumber, height, weight, bmi)";
			query += "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

			pstmt = con.prepareStatement(query);

			pstmt.setString(1, p.getName());
			pstmt.setString(2, p.getId());
			pstmt.setString(3, p.getPassword());
			pstmt.setString(4, p.getGender());
			pstmt.setString(5, p.getAge());
			pstmt.setString(6, p.getPnumber());
			pstmt.setString(7, p.getHeight());
			pstmt.setString(8, p.getWeight());
			pstmt.setString(9, p.getBmi());

			result = pstmt.executeUpdate();
			
			System.out.println("Insert success.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			System.out.println("statement create success.\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}