<%-- 
    Document   : logout
    Created on : 22 d�c. 2015, 16:42:30
    Author     : star
--%>

<%
session.setAttribute("userid", null);
session.invalidate();
response.sendRedirect("index.jsp");
%>
