package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Wife;
import model.bo.CheckLoginBO;

@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet{
private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String destination = null;
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		CheckLoginBO checkLoginBO = new CheckLoginBO();
		ArrayList<Wife> wifeArray = null;
		
		if(checkLoginBO.isValidUser(userName, password)) {
			wifeArray = checkLoginBO.getWifeList(userName);
			request.setAttribute("wifeArray", wifeArray);
			destination = "/welcome.jsp";
			request.getServletContext().getRequestDispatcher(destination).forward(request,  response);
		}else {
			destination = "/login.jsp";
			request.getServletContext().getRequestDispatcher(destination).forward(request, response);
		}
		
	}
}
