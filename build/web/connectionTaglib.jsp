<%-- 
    Document   : connectionTaglib
    Created on : 22 déc. 2015, 16:19:02
    Author     : star
--%>

<%@ page import ="java.sql.*" %>
<%
    String userid = request.getParameter("speudo");
    String pwd = request.getParameter("pass");
    
    //Class.forName("com.mysql.jdbc.Driver");
    Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/clientDatabase",
            "admin", "admin");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from members where speudo='" + userid + "' and pass='" + pwd + "'");
    if (rs.next()) {
        session.setAttribute("userid", userid);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("success.jsp");
    } else {
        out.println("Invalid password <a href='connectionPage.jsp'>try again</a>");
    }
%>
