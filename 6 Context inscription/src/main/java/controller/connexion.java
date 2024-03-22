package controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class connexion
 */
public class connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public connexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//String login = request.getParameter("login");
		//response.getWriter().append("\r\nlogin: ").append(login);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		//String nom=request.getParameter("nom"); 
		String login=request.getParameter("login");
		String motDePasse = request.getParameter("motDePasse");
		
		// Vérification des identifiants 
		ServletContext context = getServletContext();
		List<Utilisateur> utilisateurs = (List<Utilisateur>) context.getAttribute("listeUtilisateurs");
		
		// Code pour récupérer la liste des utilisateurs déjà enregistrés
		
		boolean utilisateurExiste=false;
		
		for (Utilisateur utilisateur : utilisateurs) {
		
			if (utilisateur.getLogin().equals(login) && utilisateur.getMotDePasse().equals(motDePasse)) {
				utilisateurExiste = true; 
				response.sendRedirect("accueil.jsp");
			} else {
				// Redirection vers la page de connexion avec un message d'erreur 
				response.sendRedirect("connexion.jsp?erreur=1");
			}
		}
		
	}

}
