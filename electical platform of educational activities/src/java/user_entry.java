import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class user_entry extends HttpServlet {

    String uname,eid,email,uaddress,uquery;
    String uphone;
    Connection con;
    PreparedStatement ps;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        uname = request.getParameter("uname");
        eid = request.getParameter("eid");
       email= request.getParameter("email");
      uphone = request.getParameter("uphone");
        uaddress = request.getParameter("uaddress");
      uquery = request.getParameter("uquery");
      

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/epea_database", "root", "");
            //  ps=con.prepareStatement("insert into person values('"+ username+"','"+password+"','"+phone+"','"+email+"')");
            ps = con.prepareStatement("insert into user_info(e_id,uname,uphone,uemail,uaddress,uquery) values(?,?,?,?,?,?)");
            ps.setString(1,eid );
            ps.setString(2, uname);
            ps.setString(3, uphone);
            ps.setString(4, email);
             ps.setString(5, uaddress);
            ps.setString(6, uquery);
           
            ps.executeUpdate();
            out.println("Category Addded successfully");

        } catch (Exception e) {
 out.println("Error while inserting data->" + e.getMessage());

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
