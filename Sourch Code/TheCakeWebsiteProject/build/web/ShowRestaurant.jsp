<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
            if (session.getAttribute("loginOk") == null) {
                response.sendRedirect(request.getContextPath() + "/login.jsp");
            }
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

        <title>System Admin The Cake Website</title>

        <!--                       CSS                       -->

        <!-- Reset Stylesheet -->
        <link rel="stylesheet" href="resources/css/reset.css" type="text/css" media="screen" />

        <!-- Main Stylesheet -->
        <link rel="stylesheet" href="resources/css/style.css" type="text/css" media="screen" />

        <!-- Invalid Stylesheet. This makes stuff look pretty. Remove it if you want the CSS completely valid -->
        <link rel="stylesheet" href="resources/css/invalid.css" type="text/css" media="screen" />

        <!-- Colour Schemes

		Default colour scheme is green. Uncomment prefered stylesheet to use it.

		<link rel="stylesheet" href="resources/css/blue.css" type="text/css" media="screen" />

		<link rel="stylesheet" href="resources/css/red.css" type="text/css" media="screen" />  

		-->

        <!-- Internet Explorer Fixes Stylesheet -->

        <!--[if lte IE 7]>
			<link rel="stylesheet" href="resources/css/ie.css" type="text/css" media="screen" />
		<![endif]-->

        <!--                       Javascripts                       -->

        <!-- jQuery -->
        <script type="text/javascript" src="resources/scripts/jquery-1.3.2.min.js"></script>

        <!-- jQuery Configuration -->
        <script type="text/javascript" src="resources/scripts/simpla.jquery.configuration.js"></script>

        <!-- Facebox jQuery Plugin -->
        <!--<script type="text/javascript" src="resources/scripts/facebox.js"></script>

		<!-- jQuery WYSIWYG Plugin -->
        <!--<script type="text/javascript" src="resources/scripts/jquery.wysiwyg.js"></script>

		<!-- Internet Explorer .png-fix -->

        <!--[if IE 6]>
			<script type="text/javascript" src="resources/scripts/DD_belatedPNG_0.0.7a.js"></script>
			<script type="text/javascript">
				DD_belatedPNG.fix('.png_bg, img, li');
			</script>
		<![endif]-->


        <script >

            function validateForm()
            {
                var x=document.forms["myForm"]["txtName"].value;
                var y=document.forms["myForm"]["txtRestaurantAdress"].value;
                var z=document.forms["myForm"]["txtRestaurantContent"].value;
                var w=document.forms["myForm"]["txtRestaurantPhone"].value;
                var t=document.forms["myForm"]["txtChef"].value;
                if (x==null || x=="")
                {
                    alert("Alert : Restaurant name must be filled out");
                    return false;
                }else if(y==null || y==""){
                    alert("Alert : Address must be filled out");
                    return false;

                }else if(z==null || z==""){
                    alert("Alert : Content must be filled out");
                    return false;
             

                }else if(w==null || w==""){
                    alert("Alert : Phone must be filled out");
                    return false;
                }else if(t==null || t==""){
                    alert("Alert : Chef must be filled out");
                    return false;

                }
                alert("Add New Restautrant Success!");
            }
        </script>
    </head>

    <body><div id="body-wrapper"> <!-- Wrapper for the radial gradient background -->

            <div id="sidebar"><div id="sidebar-wrapper"> <!-- Sidebar with logo and menu -->

                    <h1 id="sidebar-title"><a href="#">s Admin</a></h1>

                    <!-- Logo (221px wide) -->
                    <a href="#"><img id="logo" src="resources/images/logo.png" alt="Simpla Admin logo" /></a>

                    <!-- Sidebar Profile links -->
                    <div id="profile-links">
				Hello, <a href="#" title="Edit your profile">Admin</a><br />
                        <br />
                        <a href="HomePage.jsp" title="View the Site">View the Site</a> | <a href="logout.jsp" title="Sign Out">Sign Out</a>
                    </div>

                    <ul id="main-nav">  <!-- Accordion Menu -->






                        <li>
                            <a href="#" class="nav-top-item">
						Admin Menu
                            </a>

                            <ul>
                                <li><a href="ShowAllAdmin">System Admin</a></li>
                                <li><a href="ShowAllCustomer">System Customer</a></li>
                                <li><a href="ShowAllProduct">System Product</a></li>
                                <li><a href="ShowAllCatelogy">System CateLogy</a></li>
                                <li><a href="ShowAllOrder">System Order</a></li>
                                <li><a href="ShowAllFeedback">System FeedBack</a></li>
                                <li><a href="ShowAllRestaurant">System Restaurant</a></li>
                            </ul>

                        </li>



                    </ul> <!-- End #main-nav -->



                </div></div> <!-- End #sidebar -->

            <div id="main-content"> <!-- Main Content Section with everything -->

                <noscript> <!-- Show a notification if the user has disabled javascript -->
                    <div class="notification error png_bg">
                        <div>
						Javascript is disabled or is not supported by your browser. Please <a href="http://browsehappy.com/" title="Upgrade to a better browser">upgrade</a> your browser or <a href="http://www.google.com/support/bin/answer.py?answer=23852" title="Enable Javascript in your browser">enable</a> Javascript to navigate the interface properly.
                        </div>
                    </div>
                </noscript>

                <!-- Page Head -->
                <h2>Welcome Administrator</h2>


                <div class="clear"></div> <!-- End .clear -->

                <div class="content-box"><!-- Start Content Box -->

                    <div class="content-box-header">

                        <h3> Restaurant</h3>

                        <ul class="content-box-tabs">
                            <li><a href="#tab1" class="default-tab">List Restaurant</a></li> <!-- href must be unique and match the id of target div -->
                            <li><a href="#tab2">Add New Restaurant  </a></li>
                        </ul>

                        <div class="clear"></div>

                    </div> <!-- End .content-box-header -->

                    <div class="content-box-content">

                        <div class="tab-content default-tab" id="tab1"> <!-- This is the target div. id must match the href of this div's tab -->



                            <table>

                                <thead>
                                    <tr>
                                        <th></th>
                                        <th>ID</th>
                                        <th>Name</th>
                                        <th>Address</th>

                                        <th>Content</th>
                                        <th>Phone</th>
                                        <th>Date</th>


                                        <th>Action</th>
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
                                    <c:forEach items="${requestScope.listRestaurant}" var="admin">
                                        <tr>
                                            <td></td>
                                            <td>${admin.restaurantId}</td>
                                            <td>${admin.restaurantName}</td>
                                            <td>${admin.restaurantAdress}</td>
                                            <td>${admin.restaurantContent}</td>
                                            <td>${admin.restaurantPhone}</td>
                                            <td>${admin.chef}</td>

                                            <td>
                                                <!-- Icons -->
                                                <a href="GetOne_Restaurant?id=${admin.restaurantId}" title="Edit"><img src="resources/images/icons/pencil.png" alt="Edit" /></a>
                                                <a href="Delete_Restaurant?id=${admin.restaurantId}" title="Delete"><img src="resources/images/icons/cross.png" alt="Delete" /></a>
                                               
                                            </td>
                                        </tr>
                                    </c:forEach>


                                </tbody>

                            </table>

                        </div> <!-- End #tab1 -->

                        <div class="tab-content" id="tab2">

                            <form id="myForm" action="Add_NewRestaurant" method="post" onsubmit="return validateForm()">

                                <fieldset> <!-- Set class to "column-left" or "column-right" on fieldsets to divide the form into columns -->

                                    <p>
                                        <label>Name</label>
                                        <input class="text-input small-input" type="text" id="small-input" name="txtName" /> 

                                    </p>

                                    <p>
                                        <label>Address</label>
                                        <input class="text-input small-input" type="text" id="small-input" name="txtRestaurantAdress" />

                                    </p>
                                    <p>
                                        <label>Content</label>
                                        <input class="text-input small-input" type="text" id="small-input" name="txtRestaurantContent" />

                                    </p>

                                    <p>
                                        <label>Phone</label>
                                        <input class="text-input small-input" type="text" id="small-input" name="txtRestaurantPhone" />  

                                    </p>
                                    <p>
                                        <label>Chef of Restaurant</label>
                                        <input class="text-input small-input" type="text" id="small-input" name="txtChef" />  

                                    </p>


                                    <p>
                                        <input class="submit" type="submit" value="Submit" />
                                    </p>

                                </fieldset>

                                <div class="clear"></div><!-- End .clear -->

                            </form>

                        </div> <!-- End #tab2 -->

                    </div> <!-- End .content-box-content -->

                </div> <!-- End .content-box -->


                <div class="clear"></div>


                <!-- Start Notifications -->

                <div class="notification attention png_bg">
                    <a href="#" class="close"><img src="resources/images/icons/cross_grey_small.png" title="Close this notification" alt="close" /></a>
                    <div>
					Attention notification. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vulputate, sapien quis fermentum luctus, libero. 
                    </div>
                </div>

                <div class="notification information png_bg">
                    <a href="#" class="close"><img src="resources/images/icons/cross_grey_small.png" title="Close this notification" alt="close" /></a>
                    <div>
					Information notification. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vulputate, sapien quis fermentum luctus, libero.
                    </div>
                </div>

                <div class="notification success png_bg">
                    <a href="#" class="close"><img src="resources/images/icons/cross_grey_small.png" title="Close this notification" alt="close" /></a>
                    <div>
					Success notification. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vulputate, sapien quis fermentum luctus, libero.
                    </div>
                </div>

                <div class="notification error png_bg">
                    <a href="#" class="close"><img src="resources/images/icons/cross_grey_small.png" title="Close this notification" alt="close" /></a>
                    <div>
					Error notification. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vulputate, sapien quis fermentum luctus, libero.
                    </div>
                </div>

                <!-- End Notifications -->

                <div id="footer">
                    <small>
                        &#169; Copyright 2013 The Cake Site  <a href="#">Top</a>
                    </small>
                </div><!-- End #footer -->

            </div> <!-- End #main-content -->

        </div></body>

</html>
