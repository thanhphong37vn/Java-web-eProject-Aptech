<%--
    Document   : product
    Created on : May 15, 2013, 11:28:16 PM
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
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>The Cake Website</title>
	<link rel="stylesheet" type="text/css" href="CSS/style1.css" />

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
                                                <a href="signup.jsp">Sign Up</a>
                                                <a href="signin.jsp" class="last">Sign in</a>
                                            <%  } else{
                                            %>
					    <a href="HomePage.jsp">View Cart</a>
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
                            <li class="current"><a href="showProduct1.jsp">The Pastry shop</a></li>
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
			<h1>The Pastry shop</h1>
                        <table>
                                <tr>
                                    <td>
                                        <img src="${requestScope.detailPro.pictureProduct}" alt="images" width="300" height="300" />
                                    </td>
                                    <td>
                                        <h2>${requestScope.detailPro.productName}</h2>
                                        <h3>Category Cake: ${requestScope.catePro.categoryName}</h3>
                                        <h4 class="price">Price: <fmt:formatNumber type="currency" value="  ${requestScope.detailPro.productPrice} "/></h4>
                                        <h4>Description: ${requestScope.detailPro.productContent}</h4>
                                        Quantity: <input type="text" name="txtQuantity" value="1" size="5" />
                                        <a class="addcart" href="#">
                                            <span>Add to cart</span>
                                        </a>

                                    </td>
                                </tr>
                              </table>
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
