package Controller;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletContext;

@WebServlet("/CreerCommandeServlet")
public class CreerCommandeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String[] articlesSelectionnes = request.getParameterValues("articles");

        Commande nouvelleCommande = new Commande();

        List<Article> articles = new ArrayList<>();
        ServletContext context = getServletContext();
   		List<Article> articlesDisponibles = (List<Article>) context.getAttribute("articlesDisponibles");
   		
        
   	//if (articlesSelectionnes != null) {  
        for (String idArticle : articlesSelectionnes) {
        	
        	int targetArticleId = Integer.parseInt(idArticle);

        	for (Article article : articlesDisponibles) {
        	    if (article.getId() == targetArticleId) {
        	        articles.add(new Article(article.getId(), article.getNom(), article.getPrix()));
        	        break;
        	    }
        	}
            
          
        }
    //}
        
        nouvelleCommande.setArticles(articles);
        request.setAttribute("articles", articles);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/confirmationCommande.jsp");
        dispatcher.forward(request, response);
    }
}
