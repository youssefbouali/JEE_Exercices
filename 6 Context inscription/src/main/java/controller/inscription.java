package controller;

//import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class inscription
 */
public class inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//private String nom;
	//private String login;
	//private String password;
	
	//Utilisateur utilisateur = new Utilisateur(nom, login, password);
	
	//private ArrayList<String> usersList = new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inscription() {
		
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*request.setAttribute("users", usersList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("inscription.jsp");
		dispatcher.forward(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		/*String nom = request.getParameter("nom");
		if (nom != null && !nom.isEmpty()) {
			usersList.add(nom);
		}
		//response.sendRedirect("inscription.jsp"); 
		
		//String nom = request.getParameter("nom");
		response.getWriter().append("\r\nnom: ").append(nom);*/
		
		
		
		
		String nom=request.getParameter("nom");
		String login=request.getParameter("login"); 
		String motDePasse=request.getParameter("motDePasse");
		
		// Créer un nouvel utilisateur 
		Utilisateur nouvelUtilisateur = new Utilisateur(nom, login, motDePasse);
		
		// Stocker 1'utilisateur 
		List<Utilisateur> utilisateurs = new ArrayList<>(); 
		utilisateurs.add(nouvelUtilisateur);
		
		ServletContext context = getServletContext();
		context.setAttribute("listeUtilisateurs", utilisateurs);
		
		// Redirection vers une page de confirmation 
		response.sendRedirect("connexion.jsp");
		
		
	}

}
