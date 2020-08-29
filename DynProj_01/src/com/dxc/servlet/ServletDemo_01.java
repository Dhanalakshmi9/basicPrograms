package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo_01
 */
public class ServletDemo_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo_01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter();
		 out.println("<html>");
		 out.println("<head>");
		 out.println ("<title>home</title");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<h2> welcome!</h2>");
		 for(int c=0; c<10; c++) {
			 if(c%2==0) {
				 out.println("<font color=\"orange\">"+c+"</font><br>");
			 }
			 else {
				 out.println("<font color=\"violet\">"+c+"</font><br>");
			 }
		 }
		 out.println("</body>");
		 out.println("</html");
		 out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
