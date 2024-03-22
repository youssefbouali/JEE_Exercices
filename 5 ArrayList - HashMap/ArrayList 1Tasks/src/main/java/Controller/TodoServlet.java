package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/TodoServlet")
public class TodoServlet extends HttpServlet {

	private ArrayList<String> todoList = new ArrayList<>();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
	String task = request.getParameter("task");

		if (task != null && !task.isEmpty()) {
	
			todoList.add(task); 
		}
	
		response.sendRedirect("TodoServlet"); 
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
	request.setAttribute("tasks", todoList);

	RequestDispatcher dispatcher = request.getRequestDispatcher("todo.jsp");

	dispatcher.forward(request, response);

	}
	
}