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
                var email = document.getElementsByName("customerEmail");
                var name = document.getElementsByName("customerName");
                var address = document.getElementsByName("customerAdress");
                var phone = document.getElementsByName("customerPhone");
                var anser = document.getElementsByName("anserSecret");
                var result = true;
                var errers = "";
                if(name[0].value.length == 0){
                    errers +="Full Name can't be blank\n";
                }

                if(address[0].value.length == 0){
                    errers +="Address can't be blank\n";
                }

                if(phone[0].value.length == 0){
                    errers +="Phone can't be blank\n";
                }

                if(anser[0].value.length == 0){
                    errers +="Your Answer can't be blank\n";
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
					<html:form action="UpdateCus">
						<span>UPDATE USER</span>
                                                <table>
                                                        <tr>
                                                            <html:hidden name="User" property="customerId"/>
                                                        </tr>
							<tr>
								<td><label for="email">E-mail</label></td>
                                                                <td><html:text name="User" property="customerEmail" styleId="name" disabled="true"/></td>
							</tr>
                                                        <tr>
								<td><label for="name">Full Name</label></td>
                                                                <td><html:text name="User" property="customerName" styleId="name"/></td>
							</tr>
                                                        <tr>
								<td><label for="address">Address</label></td>
								<td><html:text name="User" property="customerAdress" styleId="name"/></td>
							</tr>
                                                        <tr>
								<td><label for="phone">Phone</label></td>
								<td><html:text name="User" property="customerPhone" styleId="name"/></td>
							</tr>
                                                        <tr>
                                                                <td>Sex</td>
                                                                <td>
                                                                    Male <html:radio value="true" property="customerSex" styleId="radioSex"/>
                                                                    Female <html:radio value="false" property="customerSex" styleId="radioSex"/>
                                                                </td>
                                                        </tr>
                                                         <tr>
								<td><label>Secret<br/> Question</label></td>
                                                                <td> <select name="txtQuestion1">
                                                                        <c:forEach items="${requestScope.showQues}" var="show">
                                                                                 <option value="${show.questionSecretID}" ${requestScope.editCus.cusQuestionSecret == show.questionSecretID?'selected':''}>${show.questionSecretContent}</option>
                                                                         </c:forEach>
                                                                     </select>
                                                                </td>
							 </tr>
                                                         <tr>
								<td><label>Your<br/> Answer</label></td>
								<td><html:text name="User" property="anserSecret" styleId="name"/></td>
							 </tr>
                                                         
						</table>
                                                         <input type="submit" value="Update" onclick="return validateInputData();" class="submitbtn" />
                                                         <html:link action="editCusPass" paramId="customerIdParam" paramName="User" paramProperty="customerId">
                                                            Change Password!!!
                                                         </html:link>
						
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
