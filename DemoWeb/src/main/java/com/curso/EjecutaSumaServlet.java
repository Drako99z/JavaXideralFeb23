package com.curso;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EjecutaSumaServlet
 */
@WebServlet("/EjecutaSumaServlet")
public class EjecutaSumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjecutaSumaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String sX = request.getParameter("ValorX");
		String sY = request.getParameter("ValorY");
		
		int x = Integer.valueOf(sX);
		int y = Integer.valueOf(sY);
		
		System.out.println(x);
		System.out.println(y);

		
		response.getWriter().append("Resultado: ").print(x + y);
	}

	

}
