package com.advancejava;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginServlet extends HttpServlet{
	public LoginServlet(){
		System.out.println("I am in constructor");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("I am in Init");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("I am in next init");
	}
	public void destroy() {
		System.out.println("I am in Destroy");

	}
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	System.out.println("I am in service");
	System.out.println(req.getHeader("user-agent"));
	String uname1=req.getParameter("uname");
	String pword1=req.getParameter("pword");
	RequestDispatcher rd;
	if((uname1.equals("vivek"))&&(pword1.equals("1234"))){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement stmt=con.createStatement();
			String sql="select * from student";
			ResultSet rs=stmt.executeQuery(sql);
			ArrayList<String> al=new ArrayList<>();
			while(rs.next()){
			    al.add(rs.getString(1));
			    al.add(rs.getString(2));
			    al.add(rs.getString(3));
			    HttpSession session=req.getSession();
			    session.setAttribute("username", "vivek");
			    req.setAttribute("msg",al);
			    rd=req.getRequestDispatcher("home.jsp");
			    rd.forward(req, res);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	else{
	    rd=req.getRequestDispatcher("abc.jsp");
		req.setAttribute("msg", "wrong username");
		rd.forward(req, res);
		}
	    	
}
}
