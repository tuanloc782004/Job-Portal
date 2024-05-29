package com.jobportal.servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jobportal.DAO.CategoriesDAO;
import com.jobportal.DAO.LocationsDAO;
import com.jobportal.DAO.UsersDetailDAO;
import com.jobportal.model.Categories;
import com.jobportal.model.Locations;
import com.jobportal.model.UsersDetail;

@WebServlet(urlPatterns = { "/user-detail-edit" })
public class UsersDetailEditServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private UsersDetailDAO usersDetailDAO;
	private LocationsDAO lDAO;
	private CategoriesDAO cDAO;

	public void init() {
		usersDetailDAO = new UsersDetailDAO();
		lDAO = new LocationsDAO();
		cDAO = new CategoriesDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			UsersDetail existingUser = usersDetailDAO.selectUserDetail(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/user/userDetailForm.jsp");
			request.setAttribute("userDetail", existingUser);
			
			Locations l = lDAO.selectDataById(existingUser.getIdLocation());
			request.setAttribute("location", l);
			
			Categories c = cDAO.selectDataById(existingUser.getIdCategory());
			request.setAttribute("category", c);
			
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
