<%-- 
    Document   : blog
    Created on : May 15, 2013, 11:22:00 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page import="com.Bean.User"%><%
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
		<div>
			<div>
				<div id="logo">
					<a href="HomePage.html"><img src="images/logo.gif" alt="Logo"/></a>
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
                                <li class="current"><a href="blog.jsp">Site Map</a></li>
                                <li><a href="contact.jsp">Contact Us</a></li>
			</ul>
			<div class="section">
				<a href="HomePage.jsp"><img src="images/wedding-cupcakes-small.jpg" alt="Image"/></a>
			</div>
		</div>
	</div>
	<div id="content">
		<div id="blog">
			<div id="articles">
				<ul>
					<li>
						<div>
							<div>
								<span class="date">Dec 3</span>
								<span class="connect">
									<a href="http://twitter.com/fwtemplates" target="_blank" class="twitter">Twitter</a>
									<a href="#" target="_blank" class="heart">Heart</a>
									<a href="http://facebook.com/freewebsitetemplates" target="_blank" class="facebook">Facebook</a>
								</span>
								<h1><a href="index.html">New Recipes: Fancy Desserts</a></h1>
								<h2>Let&#39;s bake!</h2>
								<p>Nullam ut mollis odio. Duis tempor interdum tellus, sit amet aliquet dui dictum a. Quisque in lacus vel dui tempus porttitor mollis vitae dolor. Phasellus lacinia est at massa mattis consequat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Duis condimentum ultricies scelerisque. Quisque vulputate laoreet erat at consequat. Sed sit amet sem sed lectus consectetur ultrices. Ut tincidunt, augue id sollicitudin placerat, magna nisl tempor arcu, vitae blandit risus ligula nec erat. Nunc convallis, erat in ornare tempus, ligula ipsum lacinia metus, nec bibendum tortor neque eget diam. Donec imperdiet faucibus enim, vel sodales tortor blandit a. Suspendisse potenti. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nam eleifend tincidunt iaculis.</p>
								<span id="tag">Tag: <a href="index.html">Cookies</a> <a href="index.html">Recipes</a></span>
							</div>
						</div>
					</li>
					<li>
						<div>
							<div>
								<span class="date">Nov 29</span>
								<span class="connect">
									<a href="http://twitter.com/fwtemplates" target="_blank" class="twitter">Twitter</a>
									<a href="#" target="_blank" class="heart">Heart</a>
									<a href="http://facebook.com/freewebsitetemplates" target="_blank" class="facebook">Facebook</a>
								</span>
								<h1><a href="index.html">3 Day Christmas Sale on the Shop</a></h1>
								<h2>December 3-5&#44; 2011 Crazy Discounts</h2>
								<p>Pellentesque placerat sollicitudin metus eget euismod. Suspendisse potenti. Sed nibh augue, rutrum quis posuere quis, elementum et enim. Morbi varius varius odio ac facilisis. Pellentesque ut erat vulputate ligula elementum ultrices. Morbi tempor magna sed tellus pellentesque ac ultricies justo euismod. Proin vitae enim non eros eleifend aliquam. Morbi posuere nibh vitae sapien ultrices molestie. Vivamus elit nulla, dignissim non fringilla vel, facillisis et arcu.</p>
								<span id="tag">Tag: <a href="index.html">Sale</a> <a href="index.html">Promos</a> <a href="index.html">Food</a></span>
							</div>
						</div>
					</li>
				</ul>
				<div class="section">
					<a href="index.html" class="newpost">New Post</a>
					<a href="index.html" class="oldpost">Old Post</a>
				</div>
			</div>
			<div id="sidebar">
				<h2>Archives</h2>
				<h3 class="first"><a href="index.html">2011 <span>(60)</span></a></h3>
				<div>
					<p><a href="index.html">November <span>(11)</span></a></p>
					<p><a href="index.html">October <span>(3)</span></a></p>
					<p><a href="index.html">September <span>(8)</span></a></p>
					<p><a href="index.html">August <span>(3)</span></a></p>
					<p><a href="index.html">July <span>(2)</span></a></p>
					<p><a href="index.html">June</a></p>
					<p><a href="index.html">May <span>(8)</span></a></p>
					<p><a href="index.html">April <span>(7)</span></a></p>
					<p><a href="index.html">March <span>(7)</span></a></p>
					<p><a href="index.html">April <span>(7)</span></a></p>
					<p><a href="index.html">February <span>(10)</span></a></p>
					<p><a href="index.html">January <span>(1)</span></a></p>
				</div>
				<h3><a href="index.html">2010</a></h3>
				<h3><a href="index.html">2009</a></h3>
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
