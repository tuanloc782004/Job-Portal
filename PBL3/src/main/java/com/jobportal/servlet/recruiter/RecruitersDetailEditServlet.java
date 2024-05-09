package com.jobportal.servlet.recruiter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jobportal.DAO.RecruitersDetailDAO;
import com.jobportal.DAO.UsersDetailDAO;
import com.jobportal.model.RecruitersDetail;
import com.jobportal.model.UsersDetail;

@WebServlet(urlPatterns = { "/recruiter-detail-edit" })
public class RecruitersDetailEditServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RecruitersDetailDAO recruitersDetailDAO;

	public void init() {
		recruitersDetailDAO = new RecruitersDetailDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			RecruitersDetail existingUser = recruitersDetailDAO.selectRecruiterDetail(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/recruiter/recruiterDetailForm.jsp");
			request.setAttribute("recruiterDetail", existingUser);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
