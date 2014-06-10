package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.action.ActionFormBean;
import org.apache.struts.action.ActionForm;
import com.Bean.User;
import com.Bean.User;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_value_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_value_property_name_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_errors_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_value_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_value_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_errors_nobody.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_text_value_property_name_nobody.release();
    _jspx_tagPool_html_password_value_property_name_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>The Cake Website</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/style.css\" />\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validateEmail(email) {\n");
      out.write("                var re = /^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/;\n");
      out.write("                return re.test(email);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function validateInputData(){\n");
      out.write("                var username = document.getElementsByName(\"customerEmail\");\n");
      out.write("                var pass = document.getElementsByName(\"customerPass\");\n");
      out.write("                var innerErrors = document.getElementById(\"errors\");\n");
      out.write("                var innerMsg = document.getElementById(\"msg\");\n");
      out.write("                innerMsg.innerHTML = \"\";\n");
      out.write("                \n");
      out.write("                var result = true;\n");
      out.write("                var errers = \"\";\n");
      out.write("                if(username[0].value.length == 0){\n");
      out.write("                    username[0].value = '';\n");
      out.write("                    username[0].focus();\n");
      out.write("                    errers +=\"- Username is requered.<br />\";\n");
      out.write("                }else{\n");
      out.write("                    if(!validateEmail(username[0].value.trim())){\n");
      out.write("                        username[0].focus();\n");
      out.write("                        errers +=\"- Username not availble.<br />\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if(pass[0].value.trim().length == 0){\n");
      out.write("                    pass[0].value = '';\n");
      out.write("                    pass[0].focus();\n");
      out.write("                    errers +=\"- Password is requered.<br />\";\n");
      out.write("                }else{\n");
      out.write("                    if(pass[0].value.trim().length > 30){\n");
      out.write("                        pass[0].focus();\n");
      out.write("                        errers +=\"- Length your password not > 30 character.<br />\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if(errers.toString().length != 0){\n");
      out.write("                    innerErrors.innerHTML =errers;\n");
      out.write("                    result = false;\n");
      out.write("                }\n");
      out.write("                return result;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <div id=\"logo\">\n");
      out.write("                        <a href=\"index.jsp\"><img src=\"images/logo.gif\" alt=\"Logo\"/></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <div>  <a href=\"Controller?action=ViewCart\">View Cart</a>\n");
      out.write("                            ");

                                        if (user == null) {
                            
      out.write("\n");
      out.write("                            <a href=\"signup.jsp\">Sign Up</a>\n");
      out.write("                            <a href=\"signin.jsp\" class=\"last\">Sign in</a>\n");
      out.write("                            ");
  } else {
                            
      out.write("\n");
      out.write("                            <a href=\"#\">Hello: ");
      out.print(user.getCustomerEmail());
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
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"product.jsp\">The Pastry shop</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">About us</a></li>\n");
      out.write("                    <li><a href=\"restaurant.jsp\">Restaurant</a></li>\n");
      out.write("                    <li><a href=\"blog.jsp\">Blog</a></li>\n");
      out.write("                    <li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"section\">\n");
      out.write("                    <a href=\"index.jsp\"><img src=\"images/wedding-cupcakes-small.jpg\" alt=\"Image\"/></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div>\n");
      out.write("                <div id=\"account\">\n");
      out.write("                    <div>\n");
      out.write("                        ");
      if (_jspx_meth_html_errors_0(_jspx_page_context))
        return;
      out.write("<br/>\n");
      out.write("                        <span id=\"errors\" style=\"color: red\"></span>\n");
      out.write("                        <span id=\"msg\" style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        ");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <a href='");
      out.print(request.getContextPath() + "/Forgot_Password.jsp");
      out.write("'>You can forgot password ?</a>\n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
      out.write("                            <li><a href=\"#\" class=\"facebook\">Facebook</a></li>\n");
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

  private boolean _jspx_meth_html_errors_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent(null);
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_nobody.reuse(_jspx_th_html_errors_0);
      return true;
    }
    _jspx_tagPool_html_errors_nobody.reuse(_jspx_th_html_errors_0);
    return false;
  }

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("UserAction");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <span>SIGN-IN</span>\n");
        out.write("                            <table>\n");
        out.write("                                <tr>\n");
        out.write("                                    <td><label for=\"name\">Email </label></td>\n");
        out.write("                                    <td> ");
        if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    </td>\n");
        out.write("                                </tr>\n");
        out.write("                                <tr>\n");
        out.write("                                    <td><label for=\"password\">Password</label></td>\n");
        out.write("                                    <td>");
        if (_jspx_meth_html_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                </tr>\n");
        out.write("                                <tr>\n");
        out.write("                                    <td></td>\n");
        out.write("                                    <td class=\"rememberme\"><label for=\"rememberme\"><input type=\"checkbox\" id=\"rememberme\" name=\"rememberme\" value=\"true\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie['chk'].value == \"true\" ? \"checked\" : \"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("  /> Remember me on this computer</label></td>\n");
        out.write("                                </tr>\n");
        out.write("                            </table>\n");
        out.write("                            <input type=\"submit\" value=\"Sign-In\" onclick=\"return validateInputData();\" class=\"submitbtn\" />\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_value_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setName("User");
    _jspx_th_html_text_0.setProperty("customerEmail");
    _jspx_th_html_text_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie['u'].value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_value_property_name_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_value_property_name_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_value_property_name_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(_jspx_page_context);
    _jspx_th_html_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_password_0.setName("User");
    _jspx_th_html_password_0.setProperty("customerPass");
    _jspx_th_html_password_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie['p'].value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_value_property_name_nobody.reuse(_jspx_th_html_password_0);
      return true;
    }
    _jspx_tagPool_html_password_value_property_name_nobody.reuse(_jspx_th_html_password_0);
    return false;
  }
}
