package com.jobportal.servlet.recruiter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobportal.DAO.RecruitersDetailDAO;
import com.jobportal.model.Recruiters;
import com.jobportal.model.RecruitersDetail;

@WebServlet(urlPatterns = { "/recruiter-resume" })
public class RecruitersDetailServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RecruitersDetailDAO uDAO;

	public RecruitersDetailServlet() {
		this.uDAO = new RecruitersDetailDAO();
	}

	public void init() {
		uDAO = new RecruitersDetailDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			HttpSession session = request.getSession();
			Recruiters user = (Recruiters) session.getAttribute("recruiter");
			int id = user.getId();

			RecruitersDetail u = uDAO.selectRecruiterDetail(id);

			request.setAttribute("recruiterDetail", u);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/recruiter/resume.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}