package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class portailUniv_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>IDGAF University Application</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/landing-page.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Header -->\n");
      out.write("\n");
      out.write("    <div class=\"intro-header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                                <div class=\"intro-message\">\n");
      out.write("                                     <form method=\"post\" action=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\n");
      out.write("                                         <fieldset>\n");
      out.write("                                                <legend>Fill required values</legend>\n");
      out.write("\n");
      out.write("                                                <label for=\"userName\">Username <span>*</span></label>\n");
      out.write("                                                <input type=\"text\" id=\"v\" name=\"userName\" size=\"30\" maxlength=\"30\"/>\n");
      out.write("                                                ");
      out.write("\n");
      out.write("                                                <br />\n");
      out.write("\n");
      out.write("                                                <label for=\"password\">Password <span>*</span></label>\n");
      out.write("                                                <input type=\"password\" id=\"v\" name=\"password\" size=\"30\" maxlength=\"30\"/>\n");
      out.write("                                                ");
      out.write("\n");
      out.write("                                                <br />\n");
      out.write("                                                <input align=\"right\" type=\"submit\" value=\"Login\"  />\n");
      out.write("                                                <input align=\"left\" type=\"reset\" value=\"Reset\" />\n");
      out.write("\n");
      out.write("                                          </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("                                    <h2>WELCOME TO IDGAF UNIVERSITY APPLICATION</h2>\n");
      out.write("                                    <h3>Master intership's world...</h3>\n");
      out.write("                                    <hr class=\"intro-divider\">\n");
      out.write("                                </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.intro-header -->\n");
      out.write("\n");
      out.write("    <!-- Page Content -->\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/ConnexionServlet");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
