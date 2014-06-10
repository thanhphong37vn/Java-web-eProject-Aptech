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
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                          <li class="current"><a href="HomePage.jsp">Home</a></li>
                            <li><a href="showProduct1.jsp">The Pastry shop</a></li>
                                <li><a href="about.jsp">About us</a></li>
                                <li><a href="restaurant.jsp">Restaurant</a></li>
                                <li><a href="blog.jsp">Site Map</a></li>
                                <li><a href="contact.jsp">Contact Us</a></li>
			</ul>
			<div id="section">
				<ul>
                                    <c:forEach items="${requestScope.showCate}" var="sow">
                                        <li><a href="SearchCate?rollno=${sow.categoryID}">${sow.categoryName}</a></li>
                                    </c:forEach>
				</ul>
                            <a href="HomePage.jsp"><img src="images/wedding-cupcakes-large.jpg" alt="Image"/></a>
			</div>
		</div>
	</div>
	<div id="content">
		<div class="home">
			<div class="aside">
				<h1>Welcome  to The Cake Shop!</h1>
				<p>
                                    Your first steps into The Cake Shop will leave you with the aroma of fresh baked chocolate chip cookies, and a visual buffet of enticing treats, decadent dessert cakes and tasty cupcakes. We can create your visions from elegant designs to whimsical cakes, Disney or movie character birthday cakes to adult themed cakes. We also offer a variety of cream and fruit pies.
                                </p><br/><br/>
				<p>
                                    We offer gift certificates, which are useful for birthdays and special occasions. We are 10 minutes for WPAFB in Dayton, Ohio. Everyone has a birthday, special occasion or celebration and a gift certificate is always an appreciated gift. How about presenting a gift certificate to pay on that future bride's cake or a friend's 50th anniversary cake? If you can't make it into the store to pick up your order we can deliver it to your front door. Just ask for more details when placing your order.
                                </p>
			</div>
			<div class="section">
				<div>
					<h2>Making your memories sweet!</h2>
					<p>
                                          The Place Where a Cake Becomes More Than JUST a Cake, it Becomes a Memory.

We're confident that you'll be delighted with your Cake Shop purchase.  Our goal at The Cake Shop is to always provide professional, high quality baked goods in a timely manner with a friendly attitude and smile.
 We look forward to seeing you in The Cake Shop today! </p>
				</div>
				<ul>
					<li class="first">
                                            <a href="HomePage.jsp"><img src="images/cake.jpg" alt="Image" /></a>
					</li>
					<li>
						<a href="HomePage.jsp"><img src="images/burgercake.jpg" alt="Image" /></a>
					</li>
					<li>
						<a href="HomePage.jsp"><img src="images/cupcake.jpg" alt="Image" /></a>
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
