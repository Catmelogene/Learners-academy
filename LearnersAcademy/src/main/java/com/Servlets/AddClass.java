package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Entities.Classes;
import com.Operations.ClassService;

/**
 * Servlet implementation class AddClass
 */
@WebServlet("/AddClass")
public class AddClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClass() {
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
		
		String designation = request.getParameter("txtDesignation");
		int grade = Integer.parseInt(request.getParameter("txtGrade"));
		String roomNo = request.getParameter("txtRoomNO");
		
		
		Classes clss = new Classes();
		clss.setClassDesignation(designation);
		clss.setGrade(grade);
		clss.setRoomNo(roomNo);
		
		ClassService clssServ = new ClassService();
		clssServ.Add(clss);

		response.sendRedirect("Classes.jsp");
		//write.print("<div>Successfully Added</div>");
	}

}
