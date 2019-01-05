<%@page import="java.util.ArrayList"%>
<font color="blue">
Welcome to Home page
<!-- <iframe width="560" height="315" src="https://www.youtube.com/embed/gQLQ0t9B5yk" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe> -->
</font>

<form action="logout" method="post">
<%response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
  response.setHeader("Pragma","no-cache");
  response.setHeader("Expire","0");
 if(session.getAttribute("username")==null)
 response.sendRedirect("abc.jsp"); 
 %>
<%-- <%  ArrayList<String> all=(ArrayList<String>)request.getAttribute("msg");
    for(String a:all){
	out.println(a+"----");
	}
	%> --%>
 welcome ${username}
<input type="submit" value="Logout">
</form>
