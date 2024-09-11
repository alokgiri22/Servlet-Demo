import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int val = (int) req.getAttribute("sum");
		int square = (int) val*val;
		
		PrintWriter out= res.getWriter();
		out.println("Sum of 2 numbers : " + val);
		out.println("Square of numbers : " + square);
		out.println("Thanks for using the Program on this Browser");
	}
}
