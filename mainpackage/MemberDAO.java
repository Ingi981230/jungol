package mainpackage;

import java.sql.*;

public class MemberDAO {
   String driver = "oracle.jdbc.driver.OracleDriver";
   String url = "jdbc:oracle:thin:@localhost:1521:xe";
   String user = "c##green";
   String password = "green1234";
   
   private Connection con;
   private Statement stmt;
   private ResultSet rs;
   
   //로그인
   public boolean list(MemberVo p) {
      try {
         connDB();
         
         String query = "SELECT * FROM PJ_MEMBER WHERE id = '" + p.getId()
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
   
   
   //회원가입
   public boolean signup(MemberVo p) {
	      try {
	         connDB();
	         // a'b'c
	         
	         String query = "insert into PJ_MEMBER (id, pw, apw ,email, birth, gender) values('" 
	         + p.getId() 
	         +"', '"
	         + p.getPassword()
	         +"','"
	         + p.getapw()
	         +"',  '"
	         +p.getemail() 
	         +"', '"
	         +p.getbirth()
	         +"', '"
	         +p.getgender()
	         +"')";
	         System.out.println("SQL : " + query);
	         rs = stmt.executeQuery(query);
//	         rs.last();
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