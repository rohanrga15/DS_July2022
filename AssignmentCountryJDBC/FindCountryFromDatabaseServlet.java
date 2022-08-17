package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/findCountryFromDB")
public class FindCountryFromDatabaseServlet extends GenericServlet {

	Connection conn;

    public FindCountryFromDatabaseServlet() {
        super();
        System.out.println("FindCountryFromDatabaseServlet()");   	
        try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Database Driver loaded....");
			conn = DriverManager.getConnection("jdbc:mysql:///mysql", "root", "Oneplus7t");
		    System.out.println("Connected to the DB : "+conn);	
			  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
      
    }

	
	public void init(ServletConfig config) throws ServletException {
	     System.out.println("init");
	}


	public void destroy() {
	     System.out.println("destroy");
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	    System.out.println("\t\tservice()");
	    response.setContentType("text/html");
	    String country =  request.getParameter("countryName"); //read this HTML tag's value
	    PrintWriter pw = response.getWriter();
	    try {
			Statement st = conn.createStatement();
			System.out.println("statement created.."+st);
			ResultSet rs = st.executeQuery("select * from country");
			System.out.println("Query fired...got the result...");
			
			pw.println("<form action='countryJDBCA'>");
			pw.println("<TABLE border=5 cellspacing=10 cellpadding=10>");
			
			pw.println("<TH>Country</TH>");
			pw.println("<TH>Capital</TH>");
			pw.println("<TH>Currency</TH>");
			
			pw.println("<TR>");
			pw.println("<TD><input type=text name='country'></TD>");
			pw.println("<TD><input type=text name='capital'></TD>");
			pw.println("<TD><input type=text name='currency'></TD>");
			pw.println("<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:blue' value='Add'></TD>");
			pw.println("</TR>");
			
			pw.println("</form>");

			int i = 0;
			
			while(rs.next()) {
				
				i = i+1;
				
				pw.println("<form action='countryJDBC'>");
				
				String foundCountryName = rs.getString(1);
				String foundCapitalName = rs.getString(2);
				String foundCurrency = rs.getString(3);
				
				pw.println("<TR>");
				pw.println("<TD><input type=text name='countryE' value='"+foundCountryName+"'></TD>");
				pw.println("<TD><input type=text name='capitalE' value='"+foundCapitalName+"'></TD>");
				pw.println("<TD><input type=text name='currencyE' value='"+foundCurrency+"'></TD>");
				pw.println("<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:green' value='Edit'"+foundCountryName+">   "
						+ "<input type='hidden' name='modifiedCountry' value="+foundCountryName+">"
						+ "</TD>");
				pw.println("<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:red' value='Delete'> </TD>");
				pw.println("</TR>");
				//pw.println("<TD>"+foundCountryName+"</TD>");
				//pw.println("<TD>"+foundCapitalName+"</TD>");
				//pw.println("<TD>"+foundCurrency+"</TD>");
				//
				pw.println("</form>");

			}
			pw.println("</TABLE>");
			

			
			
			rs.close();
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}