package com.advancejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class BBBB {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	String sql="insert into student values(?,?,?)";
	PreparedStatement ptmt=con.prepareStatement(sql);
	for(int i=0;i<5;i++){
	ptmt.setInt(1, 38+i);
	ptmt.setString(2, "lucky"+i);
	ptmt.setString(3,"11111"+i);
	int rs=ptmt.executeUpdate();
	System.out.println(rs);
	}
	/*while(rs.next()){
		String srno=rs.getString(1);
		String sname=rs.getString(2);
		String pword=rs.getString(3);
		System.out.println(srno);
		System.out.println(sname);
		System.out.println(pword);
		System.out.println("-----------");
	}*/
	
	
}
}
