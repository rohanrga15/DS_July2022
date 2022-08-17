package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/countryJDBC")
public class AllOpsServlet extends GenericServlet {

	Connection c;
	
    public AllOpsServlet() throws ClassNotFoundException, SQLException {
    	Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql:///mysql", "root", "Oneplus7t");

    }

	public void init(ServletConfig config) throws ServletException {

	}

	public void destroy() {

	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String value = request.getParameter("submit");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		
		
		if(value.equalsIgnoreCase("Add")) {
			PrintWriter p = response.getWriter();
			response.setContentType("text/html");
			
			p.println("<h3>Values inserted</h3>");
			
			String c1 = request.getParameter("country");
			String c2 = request.getParameter("capital");
			String c3 = request.getParameter("currency");
			
			p.println(c1);
			p.println(c2);
			p.println(c3);
			
			try {
				PreparedStatement ps = c.prepareStatement("insert into country values (?, ?, ?)");
				
				ps.setString(1, c1);
				ps.setString(2, c2);
				ps.setString(3, c3);
				
				ps.execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw.println("<h2>Add is requested..</h2>");
		}
		
		
		
		else if(value.equalsIgnoreCase("Edit")) {
			PrintWriter p = response.getWriter();
			response.setContentType("text/html");
			
			p.println("<h3>Values edited</h3>");
			
			String c1 = request.getParameter("countryE");
			String c2 = request.getParameter("capitalE");
			String c3 = request.getParameter("currencyE");
			
			p.println(c1);
			p.println(c2);
			p.println(c3);
			
			try {
				PreparedStatement ps = c.prepareStatement("update country set currency = ?, capital = ?, country = ? where capital = ?");
				
				ps.setString(1, c3);
				ps.setString(2, c2);
				ps.setString(3, c1);
				ps.setString(4, c2);
				
				ps.execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw.println("<h2>Edit is requested...</h2>");
		}
		
		
		
		else if(value.equalsIgnoreCase("Delete")) {
			PrintWriter p = response.getWriter();
			response.setContentType("text/html");
			
			p.println("<h3>Values deleted</h3>");
			
			String c1 = request.getParameter("countryE");
			String c2 = request.getParameter("capitalE");
			String c3 = request.getParameter("currencyE");
			
			p.println(c1);
			p.println(c2);
			p.println(c3);
			
			try {
				PreparedStatement ps = c.prepareStatement("delete from country where capital = ?");
				
				ps.setString(1, c2);
				
				ps.execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw.println("<h2>Delete is requested...</h2>");
		}
		pw.println("<a href='http://localhost:8080/MyServletProject/findCountryFromDB'>Go Back</a>");
		
	}

}