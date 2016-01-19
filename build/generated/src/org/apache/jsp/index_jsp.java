package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>IDGAF Application</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/landing-page.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form method=\"post\" action=\"connectionPage.jsp\">\r\n");
      out.write("    <!-- Header -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"intro-header\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"intro-message\">\r\n");
      out.write("                        <h1>WELCOME TO IDGAF APPLICATION</h1>\r\n");
      out.write("                        <h3>Master intership's world...</h3>\r\n");
      out.write("                        <hr class=\"intro-divider\">\r\n");
      out.write("                        <ul class=\"list-inline intro-social-buttons\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"connectionPage.jsp\" class=\"btn btn-default btn-lg\"><i class=\"\"></i> <span class=\"network-name\">Connect</span></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"registrationPage.jsp\" class=\"btn btn-default btn-lg\"><i class=\"\"></i> <span class=\"network-name\">Register</span></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.intro-header -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Page Content -->\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
