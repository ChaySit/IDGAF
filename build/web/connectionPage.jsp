<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connection Page</title>
    </head>
    <body style="background:url('img/banner-bg.jpg') no-repeat;">
        <form method="post" action="success.jsp">
            <center>
                <table border="1" width="30%" cellpadding="3" align="center">
                    <thead>
                        <tr>
                            <th colspan="2">IDGAF Authentication</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><strong>Username</strong></td>
                            <td><input type="text" name="speudo" value=""/></td>
                        </tr>
                        <tr>
                            <td><strong>Password</strong></td>
                            <td><input type="password" name="pass" value=""/></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Login" /></td>
                            <td><input type="reset" value="Reset" /></td>
                        </tr>
                        <tr>
                            <td colspan="2" bgcolor="white">Yet Not Registered? <a href="registrationPage.jsp">Register Here</a></td>
                        </tr>
                    </tbody>
                </table>
            </center>
        </form>
    </body>
</html>