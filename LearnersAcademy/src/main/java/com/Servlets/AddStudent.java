package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Entities.Classes;
import com.Entities.Student;
import com.Operations.ClassService;
import com.Operations.StudentService;

/**
 * Servlet implementation class AddClass
 */
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudent() {
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
		String email = request.getParameter("txtEmail");
		String contactNumber = request.getParameter("txtLastContactNumber");
				
		Student dent = new Student();
		dent.setFirstName(firstName);
		dent.setLastName(lastName);
		dent.setEmail(email);
		dent.setContactNumber(contactNumber);
		
		StudentService dentServ = new StudentService();
		dentServ.AddStudent(dent);

		response.sendRedirect("Students.jsp");
		//write.print("<div>Successfully Added</di>")
	}

}
