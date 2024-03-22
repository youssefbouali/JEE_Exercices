<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.HashMap" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Vote</title>

</head>

<body>

<h1>Votez pour votre option préférée :</h1> 
<form action="VoteServlet" method="post">

	<input type="radio" name="option" value="Option 1"> Option 1<br>
	<input type="radio" name="option" value="Option 2"> Option 2<br>
	<input type="radio" name="option" value="Option 3"> Option 3<br>
	
	<button type="submit">Voter</button>

</form>


<h2>Résultats du vote :</h2>

<ul>

<%
HashMap<String, Integer> votes = (HashMap<String, Integer>) request.getAttribute("votes");
if (votes != null) {

for (String option: votes.keySet()) { %>
	
	<li><%= option %> : <%= votes.get(option) %> vote(s)</li>

<% }
}

%>

</ul>

</body>

</html>