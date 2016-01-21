/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src.com.soaProject.servlets;



//import src.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.sql.*;
/**
 *
 * @author OUTA
 */
public class AccueilCompServlet extends HttpServlet {



    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        List<String> stg=new ArrayList<String>();


        
/*

                    String url="jdbc:mysql://localhost/internship";
		    String login="root";
	            String pwd="";
	            Connection cn=null ;
                    PreparedStatement ps=null;
                    ResultSet rs=null;


			//chargement du driver :
			 Class.forName( "com.mysql.jdbc.Driver");
			//récupération de la connexion
			 cn = DriverManager.getConnection(url, login, pwd);
                        //création d'un statement
			//String requette="SELECT * FROM internships";
                        //List<> internshipsList=new ArrayList<>();
			ps=cn.prepareStatement("SELECT shortDescription FROM internships ");
			rs=ps.executeQuery();
			while (rs.next()) {
                         stg.add(rs.getString(1));
                        }

        }
    catch(SQLException es ){ es.printStackTrace();}
		catch(ClassNotFoundException e ){ e.printStackTrace();
		}

/*

*/

                   // ArrayList<Internship> internshipsList=(ArrayList<Internship>) this.internshipDao.retrieveAllInterships();
                    ArrayList<String> list = new ArrayList<String>();
                    list.add("Simo");
                    list.add("Mallouk");
                    list.add("Zazie");
                
                    HttpSession maSession=request.getSession();
                    maSession.setAttribute("stages", list);
                   // maSession.setAttribute("stages", list);
                   // maSession.setAttribute("stages", "momo");
                    RequestDispatcher dispatcher=request.getRequestDispatcher("/accueilComp.jsp");
                    dispatcher.forward(request, response);


    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

