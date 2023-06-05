package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ServicemanDao;
import model.ServiceMan;

/**
 * Servlet implementation class ServicemenController
 */
@WebServlet("/ServicemenController")
public class ServicemenController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServicemenController() {
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
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register")) {
			ServiceMan s = new ServiceMan();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			ServicemanDao.insertServiceman(s);
			request.setAttribute("msg", "data inserted successfully");
			request.getRequestDispatcher("serviceman-login.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("login")) {
			ServiceMan s = new ServiceMan();
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = ServicemanDao.checkEmail(email);
			if(flag == true) {
				ServiceMan s1= ServicemanDao.servicemanLogin(s);
				if(s1 == null) {
					request.setAttribute("msg2", "password is incorrect");
					request.getRequestDispatcher("serviceman-login.jsp").forward(request, response);
				}
				else {
					HttpSession session = request.getSession();
					session.setAttribute("data", s1);
					request.getRequestDispatcher("serviceman-home.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg1", "account not registered");
				request.getRequestDispatcher("serviceman-login.jsp").forward(request, response);
			}
		}
	}

}
