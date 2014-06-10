package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Bean.User;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

            User user = null;
            try {
                user = (User) request.getSession().getAttribute("loginOk");
            } catch (Exception e) {
            }

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>The Cake Website</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/style.css\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <div id=\"logo\">\n");
      out.write("                        <a href=\"index.jsp\"><img src=\"images/logo.gif\" alt=\"Logo\"/></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <div>\n");
      out.write("                            \n");
      out.write("                            ");

                                        if (user == null) {
                            
      out.write("\n");
      out.write("                            <a href=\"signup.jsp\">Sign Up</a>\n");
      out.write("                            <a href=\"signin.jsp\" class=\"last\">Sign in</a>\n");
      out.write("                            ");
  } else {
                            
      out.write("\n");
      out.write("                            <a href=\"Controller?action=ViewCart\">View Cart</a>\n");
      out.write("                            <a href=\"#\">Hello: ");
      out.print(user.getCustomerName());
      out.write("</a>\n");
      out.write("                            <a href=\"logout.jsp\" class=\"last\">Log out</a>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"#\">\n");
      out.write("                            <input type=\"text\" id=\"search\" maxlength=\"30\" />\n");
      out.write("                            <input type=\"submit\" value=\"\" id=\"searchbtn\" />\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"HomePage.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"product.jsp\">The Pastry shop</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">About us</a></li>\n");
      out.write("                    <li class=\"current\"><a href=\"restaurant.jsp\">Restaurant</a></li>\n");
      out.write("                    <li><a href=\"blog.jsp\">Blog</a></li>\n");
      out.write("                    <li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"section\">\n");
      out.write("                    <a href=\"HomePage.jsp\"><img src=\"images/wedding-cupcakes-small.jpg\" alt=\"Image\"/></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <center >\n");
      out.write("                <h1>Create Success!</h1>\n");
      out.write("                <a href=\"removeAllSessionCart.jsp\"><h1>Click Back Product to create new Order!\n");
      out.write("                    </h1></a>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"aside\">\n");
      out.write("                        <div>\n");
      out.write("                            <div>\n");
      out.write("                                <b>Too <span>BUSY</span> to shop?</b>\n");
      out.write("                                <a href=\"signin.jsp\">Sign up for free</a>\n");
      out.write("                                <p>and we&#39;ll deliver it on your doorstep</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"connect\">\n");
      out.write("                        <span>Follow Us</span>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\"  class=\"facebook\">Facebook</a></li>\n");
      out.write("                            <li><a href=\"#\"  class=\"twitter\">Twitter</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"subscribe\">Subscribe</a></li>\n");
      out.write("                            <li><a href=\"#\"  class=\"flicker\">Flicker</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"navigation\">\n");
      out.write("                <div>\n");
      out.write("                    <p style=\"font-size: large\">Copyright &copy; 2013-2015 cake delight  All rights reserved</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
}
