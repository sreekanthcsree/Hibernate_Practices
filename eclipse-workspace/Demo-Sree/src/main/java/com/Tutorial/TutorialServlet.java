package com.Tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TutorialServlet extends HttpServlet {
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			String f=req.getParameter("fname");
			String l=req.getParameter("lname");
			String m=req.getParameter("location");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vani","root","Root");
				Statement st=con.createStatement();
				
				String q="insert into Employee values('"+f+"' , '"+l+"' , '"+m+"')";
				int n=st.executeUpdate(q);
				PrintWriter ps=res.getWriter();
				if(n>0)
					ps.write("Hello data is save");
				else
					ps.write("Hello data is not save");
						
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}