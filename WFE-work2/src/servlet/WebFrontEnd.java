package servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import ejbs.MyEJBRemote;

@WebServlet("/WebFrontEnd")
public class WebFrontEnd extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private MyEJBRemote myEJB;
	
	public WebFrontEnd() {
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		List<String> myListBooks = myEJB.getTitles();
		List<String> myListAuthors = myEJB.getAuthors();

		
		request.setAttribute("myListBooks", myListBooks);
		request.setAttribute("myListAuthors", myListAuthors);
		
		request.getRequestDispatcher("/Display.jsp").forward(request, response);
		
	}
}
