package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/login.jsp");
    _jspx_dependants.add("/navbar.jsp");
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
      out.write("<head>\r\n");
      out.write("<title>home page</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"epeaCSS.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("\r\n");
      out.write(" <div class=\"header\">");
      out.write("\n");
      out.write("  <a href=\"#default\" class=\"logo\">\n");
      out.write("      <img src=\"12.png\"  width=\"50px\" height=\"60px\" style=\"border-radius:50px; \"align=\"left\">\n");
      out.write("\n");
      out.write("      <h1> <b style=\"font-size:60px;  font-family: forte; color:red;\">E</b>\n");
      out.write(" <b style=\"font-size:60px;  font-family: forte; color:dodgerblue;\">P</b>\n");
      out.write(" <b style=\"font-size:60px;  font-family: forte; color:slateblue;\">E</b>\n");
      out.write(" <b style=\"font-size:60px;  font-family: forte; color:green;\">A</b></h1>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("  <div class=\"header-right\">\n");
      out.write("    ");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("<button class=\"button\" onclick=\"document.getElementById('id01').style.display='block'\" style=\"width:auto;\">Login</button>\r\n");
      out.write("\r\n");
      out.write("<div id=\"id01\" class=\"modal\">\r\n");
      out.write("  \r\n");
      out.write("  <form class=\"modal-content animate\" action=\"login\">\r\n");
      out.write("    <div class=\"imgcontainer\">\r\n");
      out.write("      <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\r\n");
      out.write("      <img src=\"img_avatar2.png\" alt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <label for=\"uname\"><b>Username</b></label>\r\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Username\" name=\"login\" required><br/>\r\n");
      out.write("\r\n");
      out.write("      <label for=\"psw\"><b>Password</b></label>\r\n");
      out.write("      <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\r\n");
      out.write("        \r\n");
      out.write("      <button type=\"submit\">Login</button>\r\n");
      out.write("      <label>\r\n");
      out.write("        <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\r\n");
      out.write("      </label>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\" style=\"background-color:#f1f1f1\">\r\n");
      out.write("      <button type=\"button\" onclick=\"document.getElementById('id01').style.display='none'\" class=\"cancelbtn\">Cancel</button>\r\n");
      out.write("      <span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("// Get the modal\r\n");
      out.write("var modal = document.getElementById('id01');\r\n");
      out.write("\r\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\r\n");
      out.write("window.onclick = function(event) {\r\n");
      out.write("    if (event.target == modal) {\r\n");
      out.write("        modal.style.display = \"none\";\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("\n");
      out.write("  </div>");
      out.write("<marquee width=\"700px\" direction=\"left\"  behavior=\"sliding\" >\r\n");
      out.write("         <h3 style=\"color:red;\"> List of Scholarships      &nbsp;&nbsp;&nbsp;\r\n");
      out.write("          INDIAN Idol junior Auditions   &nbsp;&nbsp;&nbsp;    \r\n");
      out.write("          DID super Moms &nbsp;&nbsp;&nbsp;\r\n");
      out.write("          CBSE Neet(AIPMT) 2019\r\n");
      out.write("         </h3> \r\n");
      out.write("        </marquee>   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<section >\r\n");
      out.write("   \r\n");
      out.write("  <nav> ");
      out.write("<ul>\n");
      out.write("    \n");
      out.write("          <li><a href=\"index.jsp\"><button class=\"button\" style=\"background-color:orangered\">Home</button>\n");
      out.write("</a></li><br/>\n");
      out.write("    \n");
      out.write("          <li><a href=\"Scholarship.jsp\"><button class=\"button\" style=\"background-color: red\">Scholarship</button>\n");
      out.write("</a></li><br/>\n");
      out.write("      <li><a href=\"auditions.jsp\"><button class=\"button\" style=\"background-color: dodgerblue\">Auditions</button>\n");
      out.write("</a></li><br/>\n");
      out.write("      <li> \n");
      out.write("          \n");
      out.write("        \n");
      out.write("<div class=\"dropup\">\n");
      out.write("  <b class=\"dropbtn\">Entrance Exam <b> &nabla;</b></b>\n");
      out.write("  <div class=\"dropup-content\">\n");
      out.write("    <a href=\"Engineering_entrance.jsp\" >Engineering</a>\n");
      out.write("    <a href=\"medical.jsp\"style=\"background-color: yellow\">Medical</a>\n");
      out.write("    <a href=\"Defence.jsp\"style=\"background-color: greenyellow\">Defence</a>\n");
      out.write("    <a href=\"jamc.jsp\"style=\"background-color: yellow ;font-size:16px\">Journalism and Mass communication </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("  </li><br/>\n");
      out.write(" <li><a href=\"news.jsp\"><button class=\"button\"style=\"background-color: green\">News</button><br/>\n");
      out.write("</a></li>\n");
      out.write("    </ul>");
      out.write("\r\n");
      out.write("  </nav>\r\n");
      out.write("  \r\n");
      out.write("    <article class=\"bg-img2\"> <img src=\"5.png\" style=\"width:300px height:100px\" >\r\n");
      out.write("        <div class=\"slideshow-container\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <div class=\"numbertext\">1 / 3</div>\r\n");
      out.write(" <a href=\"Scholarship.jsp\">\r\n");
      out.write("   <img src=\"scholarship_image.png\" style=\"width:500px\" height=\"250px\">\r\n");
      out.write(" </a>\r\n");
      out.write("  <div class=\"text\">Caption Text</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <div class=\"numbertext\">2 / 3</div>\r\n");
      out.write("  <a href=\"auditions.jsp\">\r\n");
      out.write("  <img src=\"audition_image.png\" style=\"width:500px\"height=\"250px\"></a>\r\n");
      out.write("  <div class=\"text\">Caption Two</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <div class=\"numbertext\">3 / 3</div>\r\n");
      out.write("  <a href=\"news.jsp\">\r\n");
      out.write("      <img src=\"news_image.png\" style=\"width:500px\" height=\"250px\"></a>\r\n");
      out.write("  <div class=\"text\">Caption Three</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"text-align:center\">\r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var slideIndex = 0;\r\n");
      out.write("showSlides();\r\n");
      out.write("\r\n");
      out.write("function showSlides() {\r\n");
      out.write("  var i;\r\n");
      out.write("  var slides = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("  var dots = document.getElementsByClassName(\"dot\");\r\n");
      out.write("  for (i = 0; i < slides.length; i++) {\r\n");
      out.write("    slides[i].style.display = \"none\";  \r\n");
      out.write("  }\r\n");
      out.write("  slideIndex++;\r\n");
      out.write("  if (slideIndex > slides.length) {slideIndex = 1;}    \r\n");
      out.write("  for (i = 0; i < dots.length; i++) {\r\n");
      out.write("    dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("  }\r\n");
      out.write("  slides[slideIndex-1].style.display = \"block\";  \r\n");
      out.write("  dots[slideIndex-1].className += \" active\";\r\n");
      out.write("  setTimeout(showSlides, 2000); // Change image every 2 seconds\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("    </article>\r\n");
      out.write("     </section>\r\n");
      out.write("  \r\n");
      out.write("<div class=\"footer\">\r\n");
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
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
