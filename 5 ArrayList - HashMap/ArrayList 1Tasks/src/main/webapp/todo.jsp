<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>


<!DOCTYPE html>

<html>
<head>

<meta charset="UTF-8">
<title>ToDo List</title>
</head>

<body>
<h1>Ma liste de tâches</h1>

<form action="TodoServlet" method="post">

	<input type="text" name="task" required> 
	<button type="submit">Ajouter</button>

</form>

<ul>

<%
ArrayList<String> tasks = (ArrayList<String>) request.getAttribute("tasks");
if (tasks != null){
	for (String task : tasks){ %>
		<li><%= task %></li>
	<% }

}

%>

</ul>

</body>

</html>