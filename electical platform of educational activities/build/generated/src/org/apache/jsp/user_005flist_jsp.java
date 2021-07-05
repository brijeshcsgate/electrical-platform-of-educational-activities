package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBConfig.JDBCFile;
import java.io.PrintWriter;
import java.sql.ResultSet;

public final class user_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/header_admin.jsp");
    _jspx_dependants.add("/logout.jsp");
    _jspx_dependants.add("/navbar_admin.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ResultSet rs=null;
    try{
    rs=JDBCFile.executeQuery("select * from user_info");
    }
    
    catch(Exception ex){
        ex.printStackTrace();
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User_list</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"epeaCSS.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("<div class=\"header\">");
      out.write("\n");
      out.write("  <a href=\"#default\" class=\"logo\">\n");
      out.write("      <img src=\"12.png\"  width=\"50px\" height=\"60px\" style=\"border-radius:50px; \"align=\"left\">\n");
      out.write("\n");
      out.write("      <h1> <b style=\"font-size:60px;  font-family: forte; color:red;\">E</b>\n");
      out.write(" <b style=\"font-size:60px;  font-family: forte; color:dodgerblue;\">P</b>\n");
      out.write(" <b style=\"font-size:60px;  font-family: forte; color:slateblue;\">E</b>\n");
      out.write(" <b style=\"font-size:60px;  font-family: forte; color:green;\">A</b></h1>\n");
      out.write("      \n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"header-right\">\n");
      out.write("    ");
      out.write("\n");
      out.write("<table ><td bgcolor=\"orange\">\n");
      out.write("<img src=\"img_avatar.png\"  class=\"avatar2\"> Administration</td>\n");
      out.write("<td bgcolor=\"orange\">\n");
      out.write("<a href=\"index.jsp\">\n");
      out.write("<button class=\"button\"  style=\"width:auto;\">Logout</button></a></td></table>\n");
      out.write("\n");
      out.write("  </div>");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<section >\n");
      out.write("   \n");
      out.write("   \n");
      out.write("\n");
      out.write("  <nav> ");
      out.write("<h3>Event</h3>\n");
      out.write("<ul style=\"list-style-type:circle;\">\n");
      out.write("    \n");
      out.write("          <li><a href=\"event_list.jsp\">events\n");
      out.write("</a></li><br/>\n");
      out.write("    \n");
      out.write("  <h3>Users</h3>       \n");
      out.write("      <li><a href=\"user_list.jsp\">Users\n");
      out.write("</a></li><br/>\n");
      out.write("      \n");
      out.write("    </ul>");
      out.write("\n");
      out.write("  </nav>\n");
      out.write(" \n");
      out.write("    <article style=\" background-color: lightblue;\"> <fieldset>\n");
      out.write("            <legend><h2>USER INFORMATION\n");
      out.write("                <a href=\"userEntry.jsp\">\n");
      out.write("                <button class=\"btn1 user\" >New user</button>\n");
      out.write("                </a>\n");
      out.write("              \n");
      out.write("                <a href=\"event_entry.jsp\">\n");
      out.write("                <button class=\"btn1 event\">New Event</button>\n");
      out.write("                </a>\n");
      out.write(" \n");
      out.write("                </h2>\n");
      out.write("            \n");
      out.write("            </legend><table border=\"0px\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th>User ID</th>\n");
      out.write("                <th>Event ID</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Contact Num.</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Query</th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");
while(rs.next()){
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>");
 out.print(rs.getString(1)); 
      out.write("</td>\n");
      out.write("                <td>");
 out.print(rs.getString(2)); 
      out.write("</td>\n");
      out.write("                <td>");
 out.print(rs.getString(3)); 
      out.write("</td>\n");
      out.write("                <td>");
 out.print(rs.getString(4)); 
      out.write("</td>\n");
      out.write("                  <td>");
 out.print(rs.getString(5)); 
      out.write("</td>\n");
      out.write("                    <td>");
 out.print(rs.getString(6)); 
      out.write("</td>\n");
      out.write("                <td>");
 out.print(rs.getString(7)); 
      out.write("</td>\n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("            ");
 }rs.close();JDBCFile.closeAll(); 
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </fieldset>\n");
      out.write("        </article>>\n");
      out.write("     </section>\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("<a href=\"AboutUs.jsp\">About Us |</a>\n");
      out.write("<a href=\"disclaimer.jsp\">Disclaimer |</a>\n");
      out.write("<a href=\"contact_US.jsp\">Contact _us</a>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("<b style=\"color:blue\">&copy; 2019- EPEA Electrical Platform of Educational Activities\n");
      out.write("    </b>");
      out.write("\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
