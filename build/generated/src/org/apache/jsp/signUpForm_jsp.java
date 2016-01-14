package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUpForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("    <link href=\"bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- MetisMenu CSS -->\r\n");
      out.write("    <link href=\"metisMenu/dist/metisMenu.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("            <div class=\"login-panel panel panel-default\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <h3 class=\"panel-title\">Please enter your details</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <form role=\"form\">\r\n");
      out.write("                        <fieldset>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>First Name</label>\r\n");
      out.write("                                <input class=\"form-control\" name=\"first_name\" type=\"text\" autofocus>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Last Name</label>\r\n");
      out.write("                                <input class=\"form-control\" name=\"last_name\" type=\"text\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Email</label>\r\n");
      out.write("                                <input class=\"form-control\" name=\"email\" type=\"email\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Password</label>\r\n");
      out.write("                                <input class=\"form-control\" name=\"password\" type=\"password\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Retype Password</label>\r\n");
      out.write("                                <input class=\"form-control\" name=\"re_password\" type=\"password\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Status</label>\r\n");
      out.write("                                <div class=\"radio\">\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <input type=\"radio\" name=\"user_status\" id=\"st_student\" class=\"status_check\" value=\"student\" checked=\"\">Student\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"radio\">\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <input type=\"radio\" name=\"user_status\" id=\"st_admin\" class=\"status_check\" value=\"administration\">Administration\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"radio\">\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <input type=\"radio\" name=\"user_status\" id=\"st_company\" class=\"status_check\" value=\"company\">Company\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"radio\">\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <input type=\"radio\" name=\"user_status\" id=\"st_supervisor\" class=\"status_check\" value=\"school supervisor\">School supervisor\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group stud_field\">\r\n");
      out.write("                                <label>Department</label>\r\n");
      out.write("                                <select class=\"form-control\" id=\"\">\r\n");
      out.write("                                    <option value=\"STPI\">STPI</option>\r\n");
      out.write("                                    <option value=\"GB\">GB</option>\r\n");
      out.write("                                    <option value=\"GC\">GC</option>\r\n");
      out.write("                                    <option value=\"GEI\">GEI</option>\r\n");
      out.write("                                    <option value=\"GMM\">GMM</option>\r\n");
      out.write("                                    <option value=\"GM\">GM</option>\r\n");
      out.write("                                    <option value=\"GP\">GP</option>\r\n");
      out.write("                                    <option value=\"GPE\">GPE</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group stud_field\">\r\n");
      out.write("                                <label>School year</label>\r\n");
      out.write("                                <input class=\"form-control\" name=\"school_year\" type=\"text\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group superv_field\">\r\n");
      out.write("                                <label>Department</label>\r\n");
      out.write("                                <select class=\"form-control\" id=\"\">\r\n");
      out.write("                                    <option value=\"STPI\">STPI</option>\r\n");
      out.write("                                    <option value=\"GB\">GB</option>\r\n");
      out.write("                                    <option value=\"GC\">GC</option>\r\n");
      out.write("                                    <option value=\"GEI\">GEI</option>\r\n");
      out.write("                                    <option value=\"GMM\">GMM</option>\r\n");
      out.write("                                    <option value=\"GM\">GM</option>\r\n");
      out.write("                                    <option value=\"GP\">GP</option>\r\n");
      out.write("                                    <option value=\"GPE\">GPE</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group company_field\">\r\n");
      out.write("                                <label>Company name</label>\r\n");
      out.write("                                <input class=\"form-control\" name=\"company_name\" type=\"text\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Change this to a button or input when using this as a form -->\r\n");
      out.write("                            <a href=\"index.html\" class=\"btn btn-lg btn-success btn-block\">Save</a>\r\n");
      out.write("                        </fieldset>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-4 col-md-offset-2\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("<script src=\"bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Metis Menu Plugin JavaScript -->\r\n");
      out.write("<script src=\"metisMenu/dist/metisMenu.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Custom Theme JavaScript -->\r\n");
      out.write("<script src=\"js/sb-admin-2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        whatIsChecked();\r\n");
      out.write("        $(\".status_check\").on(\"change\",function(){\r\n");
      out.write("            whatIsChecked();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("    function whatIsChecked(){\r\n");
      out.write("        $(\".stud_field\").hide();\r\n");
      out.write("        $(\".company_field\").hide();\r\n");
      out.write("        $(\".superv_field\").hide();\r\n");
      out.write("        \r\n");
      out.write("        if($(\"#st_student\").is(\":checked\")){\r\n");
      out.write("            $(\".stud_field\").show();\r\n");
      out.write("        }else if($(\"#st_company\").is(\":checked\")){\r\n");
      out.write("            $(\".company_field\").show();\r\n");
      out.write("        }else if($(\"#st_supervisor\").is(\":checked\")){\r\n");
      out.write("            $(\".superv_field\").show();\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
