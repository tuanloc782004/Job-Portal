package com.jobportal.servlet.recruiter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobportal.DAO.RecruitersDetailDAO;
import com.jobportal.DAO.UsersDetailDAO;
import com.jobportal.model.Recruiters;
import com.jobportal.model.RecruitersDetail;
import com.jobportal.model.Users;
import com.jobportal.model.UsersDetail;

@WebServlet(urlPatterns = { "/recruiter-detail-insert" })
public class RecruitersDetailInsertServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RecruitersDetailDAO u;
	
	public RecruitersDetailInsertServlet() {
		this.u = new RecruitersDetailDAO();
	}

	public void init() {
		u = new RecruitersDetailDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String description = request.getParameter("description");
			String country = request.getParameter("country");
			String web = request.getParameter("web");
			String img = request.getParameter("img");
			
			HttpSession session = request.getSession();
			Recruiters recruiter = (Recruiters) session.getAttribute("recruiter");
			int id =recruiter.getId();
			
			RecruitersDetail newU = new RecruitersDetail(id, description, country, web,  img);
			u.insertRecruiter(newU);

			response.sendRedirect(request.getContextPath() + "/recruiter-resume");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
