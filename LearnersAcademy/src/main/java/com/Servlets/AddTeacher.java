package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Entities.Teacher;
import com.Operations.TeacherService;

/**
 * Servlet implementation class AddClass
 */
@WebServlet("/AddTeacher")
public class AddTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter write = response.getWriter();
		
		String firstName = request.getParameter("txtFirstName");
		String lastName = request.getParameter("txtLastName");
		String office = request.getParameter("txtOffice");
		String officeNumber = request.getParameter("txtLastContactNumber");
		String email = request.getParameter("txtEmail");
		
		Teacher teach = new Teacher();
		teach.setFirstName(firstName);
		teach.setLastName(lastName);
		teach.setOffice(office);
		teach.setOfficeNumber(officeNumber);
		teach.setEmail(email);
		
		TeacherService teachServ = new TeacherService();
		teachServ.Add(teach);

		response.sendRedirect("Classes.jsp");
		//write.print("<div>Successfully added</div>");
	}

}
