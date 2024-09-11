import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int n1 = Integer.parseInt( req.getParameter("num1") ); 
		int n2 = Integer.parseInt( req.getParameter("num2") );
		int sum = n1 + n2;
		
//		PrintWriter out = res.getWriter();
//		out.println("Sum of Number 1 and Number 2 is : " + sum);
//		System.out.println("Sum of Number 1 and Number 2 is : " + sum);

		req.setAttribute("sum", sum);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
	}
}
