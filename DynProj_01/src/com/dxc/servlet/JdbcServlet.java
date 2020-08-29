package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JdbcServlet
 */
public class JdbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String dri="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/kv";
		String un="root";
		String pw="root";
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			Class.forName(dri);
			Connection con=DriverManager.getConnection(url,un,pw);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery( "SELECT * FROM student");
			
			out.println("<table>");
			out.println("<tr");
			out.println("<th>ID</th>");
			out.println("<th>NAME</th>");
			out.println("<th>EMAIL</th>");
			out.println("th>MOBILE</th>");
			out.println("</th>");
			while(rs.next()) {
		    //out.println(rs.getInt(1 )+" "+ rs.getString(2)+ " "+ rs.getString(3)+ " "+rs.getString(4));
			out.print("<tr>");
			out.println("<td>"+rs.getInt( 1)+"</td>");
			out.println("<td>"+rs.getString(2)+"</td>");
			out.println("<td>"+rs.getString(3)+"</td>");
			out.println("<td>"+rs.getString(4)+"</td>");
			out.println("</th>");
			}
			out.println("</table>");
			rs.close();
			stmt.close();
			con.close();
			
			}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @param out 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, DriverManager out) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
	}

}
