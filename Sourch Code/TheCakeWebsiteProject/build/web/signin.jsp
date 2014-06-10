<%-- 
    Document   : signin
    Created on : May 15, 2013, 11:30:00 PM
    Author     : Administrator
--%>

<%@page import="org.apache.struts.action.ActionFormBean"%>
<%@page import="org.apache.struts.action.ActionForm"%>
<%@page import="com.Bean.User"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.Bean.User"%>
<%
            User user = null;
            try {
                user = (User) request.getSession().getAttribute("loginOk");
            } catch (Exception e) {
            }
%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Cake Website</title>
        <link rel="stylesheet" type="text/css" href="CSS/style.css" />
        <script type="text/javascript">
            function validateEmail(email) {
                var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
                return re.test(email);
            }

            function validateInputData(){
                var username = document.getElementsByName("customerEmail");
                var pass = document.getElementsByName("customerPass");
                var innerErrors = document.getElementById("errors");
                var innerMsg = document.getElementById("msg");
                innerMsg.innerHTML = "";
                
                var result = true;
                var errers = "";
                if(username[0].value.length == 0){
                    username[0].value = '';
                    username[0].focus();
                    errers +="- Username is requered.<br />";
                }else{
                    if(!validateEmail(username[0].value.trim())){
                        username[0].focus();
                        errers +="- Username not availble.<br />";
                    }
                }

                if(pass[0].value.trim().length == 0){
                    pass[0].value = '';
                    pass[0].focus();
                    errers +="- Password is requered.<br />";
                }else{
                    if(pass[0].value.trim().length > 30){
                        pass[0].focus();
                        errers +="- Length your password not > 30 character.<br />";
                    }
                }

                if(errers.toString().length != 0){
                    innerErrors.innerHTML =errers;
                    result = false;
                }
                return result;
            }
        </script>
    </head>
    <body>
        <div id="header">
            <div>
                <div>
                    <div id="logo">
                        <a href="HomePage.jsp"><img src="images/logo.gif" alt="Logo"/></a>
                    </div>
                    <div>
                        <div>  
                            <%
                                        if (user == null) {
                            %>
                            <a href="#">Welcome Guest</a>
                            <a href="showQuestion">Sign Up</a>
                            <a href="signin.jsp" class="last">Sign in</a>
                            <%  } else {
                            %>
                            <a href="Controller?action=ViewCart">View Cart</a>
                            <a href="#">Hello: <%=user.getCustomerEmail()%></a>
                            <a href="logout.jsp" class="last">Log out</a>
                            <% }%>
                        </div>
                                       <form action="SearchProduct">
                                                <input type="text" id="search" name="txtName" maxlength="30" />
						<input type="submit" value="" id="searchbtn" />
					</form>
                    </div>
                </div>
                <ul>
                    <li><a href="HomePage.jsp">Home</a></li>
                    <li><a href="showProduct1.jsp">The Pastry shop</a></li>
                    <li><a href="about.jsp">About us</a></li>
                    <li><a href="restaurant.jsp">Restaurant</a></li>
                    <li><a href="blog.jsp">Site Map</a></li>
                    <li><a href="contact.jsp">Contact Us</a></li>
                </ul>
                <div class="section">
                    <a href="HomePage.jsp"><img src="images/wedding-cupcakes-small.jpg" alt="Image"/></a>
                </div>
            </div>
        </div>

        <div id="content">
            <div>
                <div id="account">
                    <div>
                        <html:errors/><br/>
                        <span id="errors" style="color: red"></span>
                        <span id="msg" style="color: red">${requestScope.msg}</span>
                        <html:form action="UserAction" >
                            <span>SIGN-IN</span>
                            <table>
                                <tr>
                                    <td><label for="name">Email </label></td>
                                    <td> <html:text name="User" styleId="name" property="customerEmail"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td><label for="password">Password</label></td>
                                    <td><html:password name="User" styleId="name" property="customerPass"/></td>
                                </tr>
                            </table>
                            <input type="submit" value="Sign-In" onclick="return validateInputData();" class="submitbtn" />
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
