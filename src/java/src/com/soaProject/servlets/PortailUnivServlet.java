package src.com.soaProject.servlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;


public class PortailUnivServlet extends HttpServlet {

        public static final String VUE_FORM = "/WEB-INF/portailUniv.jsp";

    @Override
        public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher( VUE_FORM ).forward( request, response );
	}

    @Override
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher( VUE_FORM ).forward( request, response );

	}

}
