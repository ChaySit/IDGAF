package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pageAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Administrateur Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body BACKGROUND=\"AdmBackground.jpg\" BGCOLOR=\"#000088\" TEXT=\"#000088\">\n");
      out.write("        <h1 align=\"center\">Liste des étudiants sans convention de stage!</h1>\n");
      out.write("        <hr>\n");
      out.write("         <div class=\"table-responsive\">\n");
      out.write("        <table  align=\"center\" class=\"table\">\n");
      out.write("          <tr>\n");
      out.write("            <th>IdEtudiant   </th>\n");
      out.write("            <th>IdOffre      </th>\n");
      out.write("            <th>InfoConvention   </th>\n");
      out.write("            <th>Statut         </th>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>cz123456</td>\n");
      out.write("            <td>OFF1</td>\n");
      out.write("            <td ><a href=\"La convention de stage\" </a> Cliquez ici pour télécharger la convention</td>\n");
      out.write("            <td>Validée!! à signer</td>\n");
      out.write("          </tr> \n");
      out.write("        </table>\n");
      out.write("         </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
