<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.List" %>
<%@ page import="Controller.Article" %>

<html>
<head>
    <title>Articles disponibles</title>
</head>
<body>


    <form action="CreerCommandeServlet" method="post">
        <c:forEach var="article" items="${articlesDisponibles}">
            <input type="checkbox" name="articles" value="${article.id}"/>
            ${article.nom} - ${article.prix} <br/>
        </c:forEach>
        <input type="submit" value="Passer la commande"/>
    </form>


<!--form action="CreerCommandeServlet" method="post">
    <% List<Article> articlesDisponibles = (List<Article>) request.getAttribute("articlesDisponibles");
    if (articlesDisponibles != null) {   
    for (Article article : articlesDisponibles) { %>
        <input type="checkbox" name="articles" value="<%= article.getId() %>" />
        <%= article.getNom() %> - <%= article.getPrix() %> €<br/>
    <% }
    } %>

    <input type="submit" value="Passer la commande" />
</form-->

</body>
</html>
