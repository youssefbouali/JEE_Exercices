package Controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AfficherArticlesServlet")
public class AfficherArticlesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	List<Article> articlesDisponibles = new ArrayList<>();
        articlesDisponibles.add(new Article(1, "Article1", 19.99));
        articlesDisponibles.add(new Article(2, "Article2", 29.99));
        articlesDisponibles.add(new Article(3, "Article3", 39.99));
        

		
		ServletContext context = getServletContext();
		context.setAttribute("articlesDisponibles", articlesDisponibles);

        
        request.setAttribute("articlesDisponibles", articlesDisponibles);

        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/articles.jsp");
        dispatcher.forward(request, response);
    }
}
