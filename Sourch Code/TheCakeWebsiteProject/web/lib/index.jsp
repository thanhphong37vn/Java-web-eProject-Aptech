<%-- 
    Document   : index
    Created on : May 15, 2013, 10:50:15 PM
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
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>The Cake Website</title>
        <link rel="stylesheet" type="text/css" href="CSS/style.css" />
    </head>
    <body>
        ${requestScope.msg}
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
                          <li class="current"><a href="index.jsp">Home</a></li>
                            <li><a href="product.jsp">The Pastry shop</a></li>
                                <li><a href="about.jsp">About us</a></li>
                                <li><a href="restaurant.jsp">Restaurant</a></li>
                                <li><a href="blog.jsp">Blog</a></li>
                                <li><a href="contact.jsp">Contact Us</a></li>
			</ul>
			<div id="section">
				<ul>
					 <li><a href="cheese_cake.jsp">cheese cakes</a></li>
                                    <li><a href="sponge_cake.jsp">sponge cakes</a></li>
                                    <li><a href="Butter_cake.jsp">butter cakes</a></li>
                                    <li><a href="Layer_cake.jsp">layer cakes</a></li>
                                    <li><a href="Sheet_cake.jsp">sheet cakes</a></li>
                                    <li><a href="Cupcake.jsp">cupcakes</a></li>
                                    <li><a href="fondant_cake.jsp">fondant cakes</a></li>
                                    <li><a href="swiss_roll.jsp">swiss roll</a></li>
                                    <li><a href="other_desserts.jsp">other desserts</a></li>
				</ul>
                            <a href="index.jsp"><img src="images/wedding-cupcakes-large.jpg" alt="Image"/></a>
			</div>
		</div>
	</div>
	<div id="content">
		<div class="home">
			<div class="aside">
				<h1>Welcome to our site</h1>
				<p>Pastry is the name given to various kinds of baked goods made from ingredients such as flour, butter, shortening, baking powder or eggs. Small cakes, tarts and other sweet baked goods are called &#34;pastries&#34;.</p>
				<p>Pastry may also refer to the dough from which such baked goods are made. Pastry dough is rolled out thinly and used as a base for baked goods. Common pastry dishes include pies, tarts and quiches.
				<p>Pastry is distinguished from bread by having a higher fat content, which contributes to a flaky or crumbly texture. A good pastry is light and airy and fatty, but firm enough to support the weight of the filling. When making a shortcrust pastry, care must be taken to blend the fat and flour thoroughly before adding. <a href="index.html" class="readmore">read more</a></p>
			</div>
			<div class="section">
				<div>
					<h2>The food story</h2>
					<p>Lorem ipsum dolor sit amet, consectetuer adispiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exercitation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat.</p>
				</div>
				<ul>
					<li class="first">
						<a href="index.html"><img src="images/cake.jpg" alt="Image" /></a>
					</li>
					<li>
						<a href="index.html"><img src="images/burgercake.jpg" alt="Image" /></a>
					</li>
					<li>
						<a href="index.html"><img src="images/cupcake.jpg" alt="Image" /></a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div id="footer">
		<div class="home">
			<div>
				<div class="aside">
					<div class="signup">
						<div>
							<b>Too <span>BUSY</span> to shop?</b>
							<a href="signin.jsp">Sign up for free</a>
							<p>and we&#39;ll deliver it on your doorstep</p>
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
				<div class="section">
					<div>
						<div>
							<h3>Daily Cake Surprise</h3>
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exertation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in.</p>
						</div>
					</div>
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
