package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Bean.User;

public final class Layer_005fcake_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    User user = null;
    try{
        user = (User) request.getSession().getAttribute("loginOk");
    }catch(Exception e){}

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      <title>The Cake Website</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<div id=\"logo\">\n");
      out.write("                                    <a href=\"index.jsp\"><img src=\"images/logo.gif\" alt=\"Logo\"/></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t <div>\n");
      out.write("\t\t\t\t\t   <a href=\"Controller?action=ViewCart\">View Cart</a>     ");

                                                if(user == null){
                                            
      out.write("\n");
      out.write("                                                <a href=\"signup.jsp\">Sign Up</a>\n");
      out.write("                                                <a href=\"signin.jsp\" class=\"last\">Sign in</a>\n");
      out.write("                                            ");
  } else{
                                            
      out.write("\n");
      out.write("                                            <a href=\"#\">Hello: ");
      out.print(user.getCustomerEmail() );
      out.write("</a>\n");
      out.write("                                                <a href=\"logout.jsp\" class=\"last\">Log out</a>\n");
      out.write("                                            ");
 } 
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<form action=\"#\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"search\" maxlength=\"30\" />\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"\" id=\"searchbtn\" />\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul>\n");
      out.write("                          <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"product.jsp\">The Pastry shop</a></li>\n");
      out.write("                                <li><a href=\"about.jsp\">About us</a></li>\n");
      out.write("                                <li><a href=\"restaurant.jsp\">Restaurant</a></li>\n");
      out.write("                                <li><a href=\"blog.jsp\">Blog</a></li>\n");
      out.write("                                <li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div id=\"section\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t <li><a href=\"cheese_cake.jsp\">cheese cakes</a></li>\n");
      out.write("                                    <li><a href=\"sponge_cake.jsp\">sponge cakes</a></li>\n");
      out.write("                                    <li><a href=\"Butter_cake.jsp\">butter cakes</a></li>\n");
      out.write("                                    <li class=\"selected\"><a href=\"Layer_cake.jsp\">layer cakes</a></li>\n");
      out.write("                                    <li><a href=\"Sheet_cake.jsp\">sheet cakes</a></li>\n");
      out.write("                                    <li><a href=\"Cupcake.jsp\">cupcakes</a></li>\n");
      out.write("                                    <li><a href=\"fondant_cake.jsp\">fondant cakes</a></li>\n");
      out.write("                                    <li><a href=\"swiss_roll.jsp\">swiss roll</a></li>\n");
      out.write("                                    <li><a href=\"other_desserts.jsp\">other desserts</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("                            <a href=\"index.jsp\"><img src=\"images/wedding-cupcakes-large.jpg\" alt=\"Image\"/></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"content\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<h1>Swiss Roll</h1>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"#\">Special Treats</a></h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.html\" class=\"view\">view all</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\"><img src=\"images/special-treats.jpg\" alt=\"Image\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"#\">Tarts</a></h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"view\">view all</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"images/tarts.jpg\" alt=\"Image\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"#\">Cakes</a></h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"view\">view all</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"images/cakes.jpg\" alt=\"Image\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"#\">Desserts</a></h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"view\">view all</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"images/dessert.jpg\" alt=\"Image\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"#\">Pastries</a></h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"view\">view all</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"images/pastries.jpg\" alt=\"Image\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"#\">Healthy Food</a></h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"view\">view all</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"images/healthy-food.jpg\" alt=\"Image\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div class=\"home\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<div class=\"aside\">\n");
      out.write("\t\t\t\t\t<div class=\"signup\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<b>Too <span>BUSY</span> to shop?</b>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"signin.jsp\">Sign up for free</a>\n");
      out.write("\t\t\t\t\t\t\t<p>and we&#39;ll deliver it on your doorstep</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"connect\">\n");
      out.write("\t\t\t\t\t\t<span>Follow Us</span>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"  class=\"facebook\">Facebook</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"  class=\"twitter\">Twitter</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"subscribe\">Subscribe</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"  class=\"flicker\">Flicker</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"section\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h3>Daily Cake Surprise</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exertation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"navigation\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<p style=\"font-size: large\">Copyright &copy; 2013-2015 cake delight  All rights reserved</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
