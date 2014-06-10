<%-- 
    Document   : product
    Created on : May 15, 2013, 11:28:16 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>The Cake Website</title>
	<link rel="stylesheet" type="text/css" href="CSS/style.css" />

</head>
<body>
	<div id="header">
		<div>
			<div>
				<div id="logo">
					<a href="index.jsp"><img src="images/logo.gif" alt="Logo"/></a>
				</div>
				<div>
					 <div>
					    <a href="index.jsp">View Cart</a>
                                            <%
                                                if(user == null){
                                            %>
                                                <a href="signup.jsp">Sign Up</a>
                                                <a href="signin.jsp" class="last">Sign in</a>
                                            <%  } else{
                                            %>
                                            <a href="#">Hello: <%=user.getCustomerEmail() %></a>
                                                <a href="logout.jsp" class="last">Log out</a>
                                            <% } %>
					</div>
					<form action="#">
						<input type="text" id="search" maxlength="30" />
						<input type="submit" value="" id="searchbtn" />
					</form>
				</div>
			</div>
			<ul>
                            <li><a href="index.jsp">Home</a></li>
                            <li class="current"><a href="product.jsp">The Pastry shop</a></li>
                                <li><a href="about.jsp">About us</a></li>
                                <li><a href="restaurant.jsp">Restaurant</a></li>
                                <li><a href="blog.jsp">Blog</a></li>
                                <li><a href="contact.jsp">Contact Us</a></li>
			</ul>
			<div class="section">
				<a href="index.jsp"><img src="images/wedding-cupcakes-small.jpg" alt="Image"/></a>
			</div>
		</div>
	</div>
	<div id="content">
		<div>
			<h1>The Pastry shop</h1>
			<ul>
				<li>
					<div>
						<div>
							<h2><a href="index.html">Special Treats</a></h2>
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>
							<a href="index.html" class="view">view all</a>
						</div>
						<a href="index.html"><img src="images/special-treats.jpg" alt="Image" /></a>
					</div>
				</li>
				<li>
					<div>
						<div>
							<h2><a href="index.html">Tarts</a></h2>
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>
							<a href="index.html" class="view">view all</a>
						</div>
						<a href="index.html"><img src="images/tarts.jpg" alt="Image" /></a>
					</div>
				</li>
				<li>
					<div>
						<div>
							<h2><a href="index.html">Cakes</a></h2>
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>
							<a href="index.html" class="view">view all</a>
						</div>
						<a href="index.html"><img src="images/cakes.jpg" alt="Image" /></a>
					</div>
				</li>
				<li>
					<div>
						<div>
							<h2><a href="index.html">Desserts</a></h2>
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>
							<a href="index.html" class="view">view all</a>
						</div>
						<a href="index.html"><img src="images/dessert.jpg" alt="Image" /></a>
					</div>
				</li>
				<li>
					<div>
						<div>
							<h2><a href="index.html">Pastries</a></h2>
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>
							<a href="index.html" class="view">view all</a>
						</div>
						<a href="index.html"><img src="images/pastries.jpg" alt="Image" /></a>
					</div>
				</li>
				<li>
					<div>
						<div>
							<h2><a href="index.html">Healthy Food</a></h2>
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh</p>
							<a href="index.html" class="view">view all</a>
						</div>
						<a href="index.html"><img src="images/healthy-food.jpg" alt="Image" /></a>
					</div>
				</li>
			</ul>
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
