package mainpackage;

import java.sql.*;
import java.util.*;

public class ApiDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String query;
	private Statement stmt;
	
	static ApiDAO dao = new ApiDAO();
	
	public int insertData(API_VO p) {
		int result = 0;

		try {
			connDB();

			query = "insert into bus (arrPlaceNm, arrPlandTime, charge, depPlaceNm, depPlandTime, gradeNm, routeId)";
			query += "values (?, ?, ?, ?, ?, ?, ?)";

			pstmt = con.prepareStatement(query);

			pstmt.setString(1, p.getArrPlaceNm());
			pstmt.setString(2, p.getArrPlandTime());
			pstmt.setString(3, p.getCharge());
			pstmt.setString(4, p.getDepPlaceNm());
			pstmt.setString(5, p.getDepPlandTime());
			pstmt.setString(6, p.getGradeNm());
			pstmt.setString(7, p.getRouteId());

			result = pstmt.executeUpdate();

			System.out.println("Insert success.");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

//	public String getArrPlaceNm(API_VO p) {
//		
//		String ArrPlaceNm = "";
//		try {
//			connDB();
//
//			String query = "SELECT arrPlaceNm FROM BUS where arrPlaceNm = '"+apivo.getArrPlaceNm() +"'";
//			System.out.println("SQL : " + query);
//			
//			rs = stmt.executeQuery(query);
//			rs.last();
//			
//			ArrPlaceNm = "도착지 : "+rs.getString("arrPlaceNm");
//			System.out.println("여기까지 됐음.");
//
////			while (rs.next()) {
////				values.add(rs.getString(1));
////               values.add(rs.getString(2));
////               values.add(rs.getString(3));
////               values.add(rs.getString(4));
////               values.add(rs.getString(5));
////               values.add(rs.getString(6));
////               values.add(rs.getString(7));
////				System.out.println(rs.getString(1));
////			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return ArrPlaceNm;
//	}
	
	public ArrayList<String> BusList(String bus) {
        ArrayList<String> values = new ArrayList<String>();
        try {
            connDB();

            String query = "SELECT * FROM BUS";
            System.out.println("SQL : " + query);
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                values.add(rs.getString(1));
//                values.add(rs.getString(2));
//                values.add(rs.getString(3));
//                values.add(rs.getString(4));
//                values.add(rs.getString(5));
//                values.add(rs.getString(6));
//                values.add(rs.getString(7));
//                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
                
                
//                System.out.println(rs.getString(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return values;
    }

	
	public String[] load(API_VO p) {
		
		int c = count(p);
		String[] arr = new String[c];
		
		try {
			connDB();
			String query = "SELECT arrPlaceNm, arrPlandTime, charge, depPlaceNm, depPlandTime, gradeNm, routeId FROM bus WHERE arrPlaceNm = '"+API_VO.apivo.getArrPlaceNm()+"' AND depPlaceNm = '"+API_VO.apivo.getDepPlaceNm()+"'";
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				for(int i=0; i<c; i++) {
//					String s = "출발지 : " + rs.getString("arrPlaceNm")
//					+ "\t출발 시간 : " + rs.getString("arrPlandTime")
//					+ "\t도착지 : " +rs.getString("depPlaceNm")
//					+ "\t도착 시간 : " +rs.getString("depPlandTime")
//					+ "\t버스 등급 : " +rs.getString("gradeNm")
//					+ "\t\t금액 : " + rs.getString("charge")
//					+ "\n ";
					String s = rs.getString("arrPlaceNm")
					+ "\t" + rs.getString("arrPlandTime")
					+ "\t  " +rs.getString("depPlaceNm")
					+ "\t" +rs.getString("depPlandTime")
					+ "\t  " +rs.getString("gradeNm")
					+ "\t" + rs.getString("charge")+"원"
					+ "\n ";
					rs.next();
					
					if(arr[i]==null) { arr[i] = s; }
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
		
	}
	
public String[] load2(API_VO p) {
		
		int c = count2(p);
		String[] arr = new String[c];
		
		try {
			connDB();
			String query = "SELECT arrPlaceNm, arrPlandTime, charge, depPlaceNm, depPlandTime, gradeNm, routeId FROM bus WHERE depPlaceNm = '"+API_VO2.apivo2.getDepPlaceNm()+"'";
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				for(int i=0; i<c; i++) {
//					+ "\n ";
					String s = rs.getString("arrPlaceNm")
					+ "\t" + rs.getString("arrPlandTime")
					+ "\t" +rs.getString("depPlandTime")
					+ "\t  " +rs.getString("gradeNm")
					+ "\n ";
					rs.next();
					
					if(arr[i]==null) { arr[i] = s; }
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
		
	}

public String[] load3(API_VO p) {
	
	int c = count(p);
	String[] arr = new String[c];
	
	try {
		connDB();
		String query = "SELECT arrPlaceNm, arrPlandTime, charge, depPlaceNm, depPlandTime, gradeNm, routeId FROM bus WHERE arrPlaceNm = '"+API_VO.apivo.getArrPlaceNm()+"' AND depPlaceNm = '"+API_VO.apivo.getDepPlaceNm()+"'";
		rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			for(int i=0; i<c; i++) {
				String s = rs.getString("arrPlandTime")
				+ "\t  " +rs.getString("gradeNm")
				+ "\t" + rs.getString("charge")+"원"
				+ "\n ";
				rs.next();
				
				if(arr[i]==null) { arr[i] = s; }
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return arr;
	
}
	
	public int count2(API_VO p) {
		int count = 0;
		
		try {
			connDB();
			String query = "SELECT COUNT(*) FROM bus WHERE depPlaceNm = '"+ API_VO2.apivo2.getDepPlaceNm()+ "'";
			rs = stmt.executeQuery(query);
			rs.last();
			count = rs.getInt("COUNT(*)");
			System.out.println(count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public int count(API_VO p) {
		int count = 0;
		
		try {
			connDB();
			String query = "SELECT COUNT(*) FROM bus WHERE arrPlaceNm = '"+API_VO.apivo.getArrPlaceNm()+"' AND depPlaceNm = '"+ API_VO.apivo.getDepPlaceNm()+ "'";
			rs = stmt.executeQuery(query);
			rs.last();
			count = rs.getInt("COUNT(*)");
			System.out.println(count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
	        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}