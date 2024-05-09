package com.jobportal.servlet.recruiter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jobportal.DAO.RecruitersDetailDAO;
import com.jobportal.DAO.UsersDAO;
import com.jobportal.DAO.UsersDetailDAO;
import com.jobportal.model.RecruitersDetail;
import com.jobportal.model.UsersDetail;

@WebServlet(urlPatterns = { "/recruiter-detail-update" })
public class RecruitersDetailUpdateServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RecruitersDetailDAO u;
	
	public RecruitersDetailUpdateServlet() {
		this.u = new RecruitersDetailDAO();
	}

	public void init() {
		u = new RecruitersDetailDAO();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int idRecruiter = Integer.parseInt(request.getParameter("id"));
			String description = request.getParameter("description");
			String country = request.getParameter("country");
			String web = request.getParameter("web");
			String img = request.getParameter("img");
			RecruitersDetail newU = new RecruitersDetail(idRecruiter, description, country, web, img);
			u.updateRecruiter(newU);

			response.sendRedirect("/PBL3/recruiter-resume");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
