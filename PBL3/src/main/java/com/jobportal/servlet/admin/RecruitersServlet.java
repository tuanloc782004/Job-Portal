package com.jobportal.servlet.admin;

import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jobportal.DAO.RecruitersDAO;
import com.jobportal.model.Recruiters;

@WebServlet(urlPatterns = { "/admin-recruiter" })
public class RecruitersServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RecruitersDAO recruitersDAO;

	public RecruitersServlet() {
		this.recruitersDAO = new RecruitersDAO();
	}

	public void init() {
		recruitersDAO = new RecruitersDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			List<Recruiters> listRecruiter = recruitersDAO.selectAllRecruiters();
			request.setAttribute("listRecruiter", listRecruiter);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/admin/recruiter.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
