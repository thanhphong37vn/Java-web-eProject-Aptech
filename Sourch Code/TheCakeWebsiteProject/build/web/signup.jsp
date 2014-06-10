<%--
    Document   : signup
    Created on : May 15, 2013, 11:30:40 PM
    Author     : Administrator
--%>

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
         <script>
          function validateForm()
            {
                var a=document.forms["myForm"]["txtEmail"].value;
                var b=document.forms["myForm"]["txtName"].value;
                var c=document.forms["myForm"]["txtPass"].value;
                var d=document.forms["myForm"]["txtRepass"].value;
                var e=document.forms["myForm"]["txtAdd"].value;
                var f=document.forms["myForm"]["txtPhone"].value;
                var g=document.forms["myForm"]["txtYear"].value;
                var h=document.forms["myForm"]["txtYour"].value;
                var result = true;
                var errers = "";
                if (a==null || a=="")
                {
                    errers +="Email can't be blank\n";
                }
                if(b==null || b==""){
                    errers +="Full Name can't be blank\n";

                }
                if(c==null || c==""){
                    errers +="Pass can't be blank\n";
                }
                if(d==null || d==""){
                    errers +="Re-Pass can't be blank\n";
                }
                if(c!=d){
                    errers +="The entered passwords do not match\n";
                } 
                if(e==null || e==""){
                    errers +="Address can't be blank\n";
                }
                if(f==null || f==""){
                    errers +="Phone can't be blank\n";
                }else if(!f.match(/^\d+/)){
                    errers +="Please only enter numeric characters only for your Phone!\n";
                }
                if(g==null || g==""){
                    errers +="Year can't be blank\n";
                }else if(!g.match(/^\d+/))
                {
                    errers +="Please only enter numeric characters only for your Age! (Example:1991)\n";
                }
                if(h==null || h==""){
                    errers +="Answer can't be blank\n";
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
                                            <a href="#">Welcome Guest</a>
                                            <a href="showQuestion">Sign Up</a>
                                            <a href="signin.jsp" class="last">Sign in</a>
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
				<a href="index.jsp"><img src="images/wedding-cupcakes-small.jpg" alt="Image"/></a>
			</div>
		</div>
	</div>
    <div id="content">
		<div>
			<div id="account">
				<div>
					 <form action="Signup" id="myForm" method="post" onsubmit="return validateForm()">
						<span>SIGN-UP</span>
                                                <table>
							<tr>
								<td><label for="email">E-mail</label></td>
								<td><input type="text" id="email" name="txtEmail" /></td>
							</tr>
                                                        <tr>
								<td><label for="name">Full Name</label></td>
								<td><input type="text" id="name" name="txtName" /></td>
							</tr>
							<tr>
								<td><label for="password">Password</label></td>
                                                                <td><input type="password" id="password" name="txtPass" /></td>
							</tr>
							<tr>
								<td><label for="confirmpass">Confirm<br />Password</label></td>
								<td><input type="password" id="confirmpass" name="txtRepass" /></td>
							</tr>
                                                        <tr>
								<td><label for="address">Address</label></td>
								<td><input type="text" id="address" name="txtAdd" /></td>
							</tr>
                                                        <tr>
								<td><label for="phone">Phone</label></td>
								<td><input type="text" id="phone" name="txtPhone" /></td>
							</tr>
                                                        <tr>
								<td><label for="sex">Sex</label></td>
                                                                <td> <select name="cbCustomSex">
                                                                          <option value="True">Male</option>
                                                                          <option value="False">Female</option>
                                                                     </select>
                                                                </td>
							</tr>
                                                        <tr>
								<td><label for="brithday">Date of<br /> Birth</label></td>

                                                                     <td>Month
                                                                        <select name="cbMonth">
                                                                          <option value="1" >1</option>
                                                                          <option value="2" >2</option>
                                                                          <option value="3" >3</option>
                                                                          <option value="4" >4</option>
                                                                          <option value="5" >5</option>
                                                                          <option value="6" >6</option>
                                                                          <option value="7" >7</option>
                                                                          <option value="8" >8</option>
                                                                          <option value="9" >9</option>
                                                                          <option value="10" >10</option>
                                                                          <option value="11" >11</option>
                                                                          <option value="12" >12</option>
                                                                        </select>
                                                                     <label>Day
                                                                            <select name="cbDay">
                                                                              <option value="1" >1</option>
                                                                              <option value="2" >2</option>
                                                                              <option value="3" >3</option>
                                                                              <option value="4" >4</option>
                                                                              <option value="5" >5</option>
                                                                              <option value="6" >6</option>
                                                                              <option value="7" >7</option>
                                                                              <option value="8" >8</option>
                                                                              <option value="9" >9</option>
                                                                              <option value="10" >10</option>
                                                                              <option value="11" >11</option>
                                                                              <option value="12">12</option>
                                                                              <option value="13" >13</option>
                                                                              <option value="14" >14</option>
                                                                              <option value="15" >15</option>
                                                                              <option value="16" >16</option>
                                                                              <option value="17" >17</option>
                                                                              <option value="18">18</option>
                                                                              <option value="19" >19</option>
                                                                              <option value="20" >20</option>
                                                                              <option value="21" >21</option>
                                                                              <option value="22" >22</option>
                                                                              <option value="23" >23</option>
                                                                              <option value="24" >24</option>
                                                                              <option value="25" >25</option>
                                                                              <option value="26">26</option>
                                                                              <option value="27" >27</option>
                                                                              <option value="28" >28</option>
                                                                              <option value="29" >29</option>
                                                                              <option value="30" >30</option>
                                                                              <option value="31" >31</option>
                                                                              </select>
                                                                          </label>
                                                                         Year<input type="text" name="txtYear"  maxlength="4" size="4" id="year" />
                                                                     </td>
                                                         </tr>
                                                         <tr>
								<td><label>Secret<br/> Question</label></td>
                                                                <td> <select name="txtQuestion">
                                                                        <c:forEach items="${requestScope.showQues}" var="show">
                                                                                 <option value="${show.questionSecretID}">${show.questionSecretContent}</option>
                                                                          </c:forEach>
                                                                     </select>
                                                                </td>
							 </tr>
                                                         <tr>
								<td><label>Your<br/> Answer</label></td>
								<td><input type="text" id="email" name="txtYour" /></td>
							 </tr>
						</table>
						<input type="submit" value="Sign-up" class="submitbtn" />
					</form>
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
