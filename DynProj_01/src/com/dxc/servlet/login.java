package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType( "text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>login</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method=\"post\">");
		out.println("user name:<input type=\"text\"name=\"user name\"><br>");
		out.println("password:<input type=\"password\"name=\"password\"><br>");
		out.println("<input type=\"submit\"value=\"login\">");
		out.println("<input type=\"reset\"value=\"cancel\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		RequestDispatcher rd=request.getRequestDispatcher("successpage");
	out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType( " text/html");
	PrintWriter out=response.getWriter();
	String un=request.getParameter("username");
	String pw=request.getParameter( "password");
	if(un.contentEquals("dhana")&&pw.equals("dhana")) {
		out.println("login successfully");
	}
	else {
		out.println("login failed");
	}
	}

}
