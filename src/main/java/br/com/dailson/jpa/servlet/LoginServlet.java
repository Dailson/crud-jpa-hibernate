package br.com.dailson.jpa.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dailson.jpa.bean.PersonBean;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PersonBean personBean = new PersonBean();
		personBean.setLogin(request.getParameter("login"));
		personBean.setPassword(request.getParameter("password"));
		
		RequestDispatcher dispatcher;
		if(personBean.validPassword(personBean.getLogin(), personBean.getPassword())) {
			dispatcher = request.getRequestDispatcher("released.jsp");
			dispatcher.forward(request, response);
		} else {
			dispatcher = request.getRequestDispatcher("denied.jsp");
			dispatcher.forward(request, response);
		}
			
		
//		
//		System.out.println(personBean);

		doGet(request, response);

	}

}
