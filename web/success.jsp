<%-- 
    Document   : success
    Created on : 22 déc. 2015, 16:40:38
    Author     : star
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Page</title>
    </head>

    <body style="background:url('img/banner-bg.jpg') no-repeat;">

            <% if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) { %>
                <center><h1><font color="white"><strong>You are not logged in IDGAF Environment!!!</strong></font></h1></center><br/>
                <a href="connectionPage.jsp"><font color="green"><strong>Please Login</strong></font></a>

            <%} else { %>
                <center><h1><font color="white"><strong> Welcome to your IDGAF Environment!!!</strong></font></h1></center> <%=session.getAttribute("userid")%>
                <a href='logout.jsp'><font color="green"><strong>Log out</strong></font></a>
            <%
                }
            %>

    </body>
</html>



