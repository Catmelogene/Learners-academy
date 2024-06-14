package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Entities.Classes;
import com.Entities.Subject;
import com.Operations.SubjectService;

/**
 * Servlet implementation class AddClass
 */
@WebServlet("/AddSubject")
public class AddSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSubject() {
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
		
		String subjectName = request.getParameter("txtSubjectName");
		int credits = Integer.parseInt(request.getParameter("txtcredits"));
		
		//Classes clss=new Classes();
		
		Subject sub = new Subject();
		sub.setSubjectName(subjectName);
		sub.setCredits(credits);
		
				
		SubjectService subServ = new SubjectService();
		subServ.AddSubject(sub);

		response.sendRedirect("Subjects.jsp");
		//write.print("<div>Error Loading class</div>");
	}

}
