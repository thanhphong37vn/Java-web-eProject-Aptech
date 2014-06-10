<%-- 
    Document   : about
    Created on : May 15, 2013, 11:21:30 PM
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
	<meta charset="UTF-8" />
	<title>The Cake Website</title>
	<link rel="stylesheet" type="text/css" href="CSS/style.css" />

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
                                <li class="current"><a href="about.jsp">About us</a></li>
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
		<div id="about">
			<div class="aside">
				<h1>About The Cake Shop</h1>

				<p>
                                   Soak in the space of ancient Hanoi, you not only enjoy the poetic feeling of the old town, but also enjoy the French flavor in the heart of the Capital.
                                </p>

				<p>
                                    Located on a busy street and ancient Shop The Cake Shop has long been a destination for lovers of French pastries. With a passion for quality French, The Cake Shop has flavors of "pure" to Vietnam with the diners.

                                </p>

				<p>
                                 Located on the "quality" of Hanoi Old Quarter quality, quality of the search for cultural roots, visitors will encounter shop The Cake Shop our No.8 Lane Station, Hanoi. Just learn about the culture of Hanoi Old Quarter, visitors can enjoy the French flavor here, with a very ancient space Ha Thanh.
                                <p>
                                    Further, visitors can go cyclo enjoy elegance of Hanoi, tourists can encounter shop The Cake Shop at 38 Phung Hung, unlike ancient definition of Ha Thanh, targeted at younger to help the young people can enjoy and explore the ancient taste of Paris.

                                </p>
			</div>
			<div class="section">
				<div id="visitshop">
					<div>
						<p><span>Sweets from the heart</span> Treat your loveones</p>
						 <a href="" class="visit">visit the shop</a>
					</div>
				</div>
				<div>

					<p>
                                            The Cake Shop Cake Shop are manufactured on modern lines, with ingredients imported directly from countries with a long tradition of baking the world. Diners here can enjoy a wide variety of cakes: Birthday Cakes, Wedding Cakes, Valentine Cake, Christmas Cake ... Barkery, French Bread, Pizza, Hotdog, Patechaux, Cookies, and mooncakes ....

All these factors have created a brand for our shop.
                                        </p>
                                            </div>
				<div>
					<h3>Address</h3>
					<p>No. 8 Lane Station, Hanoi. <br />  38 Phung Hung,Hanoi <br /></p>
				</div>
				<div>
                                    <a href="HomePage.jsp" class="callus">CALL US <span>(+84) 4 3782 6666</span></a>
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
