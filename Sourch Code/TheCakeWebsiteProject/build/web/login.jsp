<%-- 
    Document   : signin
    Created on : May 15, 2013, 11:30:00 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page import="com.Bean.User"%>
<%
    User user = null;
    try{
        user = (User) request.getSession().getAttribute("loginOk");
    }catch(Exception e){}
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Cake Website</title>
        <link rel="stylesheet" type="text/css" href="CSS/style.css" />
    </head>
    <body>
        <div id="header">
        </div>
        <div id="content">
            

            <div>
                <div id="account">
                    <div>
                        <html:errors/>
                        <html:form action="CheckAdmin" >
                            <span>SIGN-IN</span>
                            <table>
                                <tr>
                                    <td><label for="name">Email </label></td>
                                    <td> <html:text name="Admin" property="email" styleId="name" />
                                    </td>
                                </tr>
                                <tr>
                                    <td><label for="password">Password</label></td>
                                    <td><html:password name="Admin" property="pass" styleId="name" /></td>
                                </tr>
                            </table>
                            <input type="submit" value="Sign-In" onclick="" class="submitbtn" />
                        </html:form>
                    </div>  
                </div>
            </div>
        </div>
        <div id="footer">
            <div class="section">
                <div>
                    <div class="aside">
                        <div>
                            <div>
                                <b>Too <span>BUSY</span> to shop?</b>
                                <a href="signin.jsp">Sign up for free</a>
                                <p>and we&#39;ll deliver it on your doorstep</p>
                            </div>
                        </div>
                    </div>
                    <div class="connect">
                        <span>Follow Us</span>
                        <ul>
                            <li><a href="#" class="facebook">Facebook</a></li>
                            <li><a href="#"  class="twitter">Twitter</a></li>
                            <li><a href="#" class="subscribe">Subscribe</a></li>
                            <li><a href="#"  class="flicker">Flicker</a></li>
                        </ul>
                    </div>
                </div>
            </div>

            <div id="navigation">
                <div>
                    <p style="font-size: large">Copyright &copy; 2013-2015 cake delight  All rights reserved</p>
                </div>
            </div>
        </div>
    </body>
</html>
