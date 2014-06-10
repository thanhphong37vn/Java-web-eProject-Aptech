<%-- 
    Document   : contact
    Created on : May 15, 2013, 11:24:43 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
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


            <script >

function validateForm()
{
var x=document.forms["myForm"]["txtName"].value;
var y=document.forms["myForm"]["txtEmail"].value;
var z=document.forms["myForm"]["txtSubject"].value;
var w=document.forms["myForm"]["txtmessage"].value;
if (x==null || x=="")
  {
  alert("Alert : First name must be filled out");
  return false;
  }else if(y==null || y==""){
   alert("Alert : Email must be filled out");
  return false;

  }else if(z==null || z==""){
   alert("Alert : Subject must be filled out");
  return false;

   }else if(w==null || w==""){
   alert("Alert : Content must be filled out");
  return false;

  }
  alert("Thanks you ! Send Feedback Success!");
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
                                <li class="current"><a href="contact.jsp">Contact Us</a></li>
			</ul>
			<div class="section">
				<a href="HomePage.jsp"><img src="images/wedding-cupcakes-small.jpg" alt="Image"/></a>
			</div>
		</div>
	</div>
	<div id="content">
		<div>
			<h1>Contact us</h1>
			<div id="visitshop">
				<div>
					<p><span>Sweets from the heart</span> Treat your loveones</p>
					 <a href="" class="visit">visit the shop</a>
				</div>
			</div>
                        <form name="myForm" action="AddFeedBack" onsubmit="return validateForm()">
				<p>If you need assistance feel free to e-mail us. <span>Mauris dictum congque porta. Duis dapibus tellus id dolor fringilla et viverra nibh semper. Praesent sit amet lacus tortor.</span></p>
				Name :<input type="text" name="txtName"  maxlength="30" value="" class="textcontact" />
				E-mail Address :<input type="text" name="txtEmail" maxlength="30" value="" class="textcontact" />
				Subject :<input type="text" name="txtSubject" maxlength="30" value="" class="textcontact" />
				Content :<textarea name="txtmessage" id="message" cols="30" rows="10"></textarea>
				<input type="submit" value="" class="submit" />
			</form>
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
