package com.tektaurus.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tektaurus.bean.Employee;
import com.tektaurus.dao.EmployeeDAO;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/Student")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   EmployeeDAO dao;
	   Employee s;
	   PrintWriter out;
    public EmployeeServlet() {

       dao=new EmployeeDAO();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			out=response.getWriter();
			int sid=Integer.parseInt(request.getParameter("sid"));
			ResultSet res=dao.retrieve(sid);
			out.println("<table border=3><tr><th>Employee Id</th><th>Employee Name</th><th>Mobile No</th><th>Address</th><th>Stream</th></tr>");
			while(res.next())
			{
				out.println("<tr>");
				out.println("<td>"+res.getInt("eid")+"</td>");
				out.println("<td>"+res.getString("ename")+"</td>");
				out.println("<td>"+res.getString("emobile")+"</td>");
				out.println("<td>"+res.getString("eaddress")+"</td>");
				out.println("<td>"+res.getString("estream")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("eid"));
		String ename=request.getParameter("ename");
		String emobile=request.getParameter("emobile");
		String eaddress=request.getParameter("eaddress");
		String estream=request.getParameter("estream");
		
	    e=new Employee(eid,ename,emobile,eaddress,estream);
		int ra=dao.insert(e);
		if(ra>0)
			out.println("<font color=green>Employee Details Inserted Succcessfully.</font>");
		else
			out.println("<font color=red>Employee Details are not inserted.</font>");
		out.println("To Go Back To The Form <a href='http://localhost:9090/EmployeeManagementSystem/home.html'>Click Here</a>");
			
	}
}
