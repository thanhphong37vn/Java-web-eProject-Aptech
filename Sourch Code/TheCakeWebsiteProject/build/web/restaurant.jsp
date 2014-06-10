<%-- 
    Document   : services
    Created on : May 15, 2013, 11:29:13 PM
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
            try {
                user = (User) request.getSession().getAttribute("loginOk");
            } catch (Exception e) {
            }
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
                            <html:link action="editCus" paramId="customerIdParam" paramName="User" paramProperty="customerId">
                                                Hello: <%=user.getCustomerName()%>
                             </html:link>
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
                    <li class="current"><a href="restaurant.jsp">Restaurant</a></li>
                    <li><a href="blog.jsp">Site Map</a></li>
                    <li><a href="contact.jsp">Contact Us</a></li>
                </ul>
                <div class="section">
                    <a href="HomePage.jsp"><img src="images/wedding-cupcakes-small.jpg" alt="Image"/></a>
                </div>
            </div>
        </div>
        <div id="content">

            
            <center>
                <a href="restaurant.jsp"><img src="images/restaurant.JPG"/></a>
<!--                            <div class="content-box-content">-->
                <c:if test="${empty requestScope.listRestaurant}">
                    No data
                    <c:redirect url="/ShowAllRestaurantUser"/>
                </c:if>
                <c:if test="${not empty requestScope.listRestaurant}">
<!--                    <div class="tab-content default-tab" id="tab1">                         This is the target div. id must match the href of this div's tab -->

                        <table border="0.5" align="center" >
                            <thead>
                                <tr>
                                    <th >RestaurantId</th>
                                    <th >RestaurantName</th>
                                    <th >RestaurantAdress</th>
                                    <th >RestaurantContent</th>
                                    <th >RestaurantPhone</th>
                                    <th >Chef</th>
                                </tr>

                            </thead>

                            <tfoot>
                                <tr>
                                    <td colspan="6">
                                        <div class="pagination">
                                            <a href="#" title="First Page">&laquo; First</a><a href="#" title="Previous Page">&laquo; Previous</a>
                                            <a href="#" class="number" title="1">1</a>
                                            <a href="#" class="number" title="2">2</a>
                                            <a href="#" class="number current" title="3">3</a>
                                            <a href="#" class="number" title="4">4</a>
                                            <a href="#" title="Next Page">Next &raquo;</a><a href="#" title="Last Page">Last &raquo;</a>
                                        </div> <!-- End .pagination -->
                                        <div class="clear"></div>
                                    </td>
                                </tr>
                            </tfoot>
                            <tbody>
                                <c:forEach items="${requestScope.listRestaurant}" var="ord">
                                    <tr>
                                        <td>${ord.restaurantId}</td>
                                        <td>${ord.restaurantName}</td>
                                        <td>${ord.restaurantAdress}</td>
                                        <td>${ord.restaurantContent}</td>
                                        <td>${ord.restaurantPhone}</td>
                                        <td>${ord.chef}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
<!--                    </div>  End #tab1 -->

<!--            </div>  End .content-box-content-->
                </c:if>
            </center>
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
