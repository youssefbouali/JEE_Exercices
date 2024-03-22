package VoteServlet;

import java.io.IOException;
import java.util.HashMap;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VoteServlet
 */
@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {

	private HashMap<String, Integer> voteCounts = new HashMap<>();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		String selectedoption = request.getParameter("option");
		
		if (selectedoption != null && !selectedoption.isEmpty()) {
			if (voteCounts.containsKey(selectedoption)) {
				int count = voteCounts.get(selectedoption);
				voteCounts.put(selectedoption, count + 1);
			} else {
				voteCounts.put(selectedoption, 1);
			}
		
		}
		response.sendRedirect("VoteServlet");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
	request.setAttribute("votes", voteCounts); 
	RequestDispatcher dispatcher = request.getRequestDispatcher("vote.jsp");
	dispatcher.forward(request, response);
	
	}
	
}