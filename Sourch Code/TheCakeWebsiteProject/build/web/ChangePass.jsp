<%--
    Document   : signup
    Created on : May 15, 2013, 11:30:40 PM
    Author     : Administrator
--%>
<%@page import="com.Bean.User"%>
<%
    User user = null;
    try{
        user = (User) request.getSession().getAttribute("loginOk");
    }catch(Exception e){}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
   <head>
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>The Cake Website</title>
	        <link rel="stylesheet" type="text/css" href="CSS/style1.css" />
               <script type="text/javascript">
            function validateInputData(){
                var a = document.getElementsByName("customerPass1");
                var b = document.getElementsByName("customerPass");
                var result = true;
                var errers = "";
                if(a[0].value.length == 0){
                    errers +="New Password can't be blank\n";
                }
                if(b[0].value.length == 0){
                    errers +="Confirm New Password can't be blank\n";
                }
                if(errers.toString().length != 0){
                    alert(errers);
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
                                                if(user == null){
                                            %>
                                                <a href="#">Welcome Guest</a>
                                                <a href="showQuestion">Sign Up</a>
                                                <a href="signin.jsp" class="last">Sign in</a>
                                            <%  } else{
                                            %>
					    <a href="Controller?action=ViewCart">View Cart</a>
                                            <html:link action="editCus" paramId="customerIdParam" paramName="User" paramProperty="customerId">
                                                Hello: <%=user.getCustomerName()%>
                                            </html:link>
                                            <a href="logout.jsp" class="last">Log out</a>

                                            <% } %>
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
					<html:form action="ChangePass">
						<span>UPDATE USER</span>
                                                <table>
                                                        <tr>
                                                            <html:hidden name="User" property="customerId"/>
                                                        </tr>
							<tr>
								<td><label for="email">New Password</label></td>
                                                                <td><html:password name="User" property="customerPass1" styleId="name" value=""/></td>
							</tr>
                                                        <tr>
								<td><label for="email">Confirm New Password</label></td>
                                                                <td><html:password name="User" property="customerPass" styleId="name" value=""/></td>
							</tr>

						</table>
                                                         <input type="submit" value="Change" onclick="return validateInputData();" class="submitbtn" />
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
                                                        <a href="signup.jsp">Sign up for free</a>
							<p>and we&#39;ll deliver it on your doorstep</p>
						</div>
					</div>
				</div>
				<div class="connect">
					<span>Follow Us</span>
					<ul>
						<li><a href="#"  class="facebook">Facebook</a></li>
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
