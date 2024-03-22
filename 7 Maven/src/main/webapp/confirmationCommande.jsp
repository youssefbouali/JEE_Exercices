<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="java.util.List" %>
<%@ page import="Controller.Article" %>

<html>
<head>
    <title>Confirmation de commande</title>
</head>
<body>

    <% List<Article> articles = (List<Article>) request.getAttribute("articles");
    if (articles != null) {  
       for (Article article : articles) { %>
        <%= article.getId() %> - <%= article.getNom() %> - <%= article.getPrix() %> €<br/>
    <% } %>
    
<h2>Commande passée avec succès!</h2>
<p>Merci pour votre commande.</p>
    <%  } %>


</body>
</html>
