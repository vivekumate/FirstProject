package com.advancejava;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet {
	public Logout(){
		System.out.println("I am in 2nd constructor");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("I am in 2nd Init");
	}
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd=req.getRequestDispatcher("abc.jsp");
		rd.forward(req, res);
	}
}
