<%-- 
    Document   : registrationTaglib
    Created on : 22 déc. 2015, 15:49:02
    Author     : star
--%>

<%@ page import ="java.sql.*" %>

<%
    String user = request.getParameter("speudo");
    String pwd = request.getParameter("pass");
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String email = request.getParameter("email");

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/clientDatabase",
            "admin", "admin");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into members(fname, lname, email, speudo, pass) values ('" + fname + "','" + lname + "','" + email + "','" + user + "','" + pwd + "')");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("connexionPage.jsp");
    }
%>
