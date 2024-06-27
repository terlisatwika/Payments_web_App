package com.pack.servs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pack.dto.User;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogoutServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		User sessionUser = (User) session.getAttribute("user");
		session.invalidate();

		response.setContentType("text/html");
		response.getWriter().write("<p style='color:orange;'>Logged Out</p>");
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.include(request, response);

	}

}
