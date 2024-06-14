package com.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Entities.Subject_Classes;
import com.Operations.SubjectClassesService;
import com.Operations.SubjectService;

/**
 * Servlet implementation class Subject_Class
 */
//@WebServlet("/Allocations")
public class Allocations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Allocations() {
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
		int subjectId=Integer.parseInt(request.getParameter("txtSubjectId"));
		int classId=Integer.parseInt(request.getParameter("txtClassId"));
		
		Subject_Classes sC=new Subject_Classes(subjectId, classId);
		
		SubjectClassesService sCServ=new SubjectClassesService();
		sCServ.PairClassSubject(sC);
		
		response.sendRedirect("PairSubjectClass.jsp");
		
	}

}
