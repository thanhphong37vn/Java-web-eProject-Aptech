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

                if (x==null || x=="")
                {
                    alert("Alert : Name Catelogy not null!");
                    return false;

                }
                alert("Update Success!");
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

                        <h3>Update Catelogy</h3>

                        <ul class="content-box-tabs">
                            <li><a href="#tab1" class="default-tab">Update Catelogy</a></li> <!-- href must be unique and match the id of target div -->

                        </ul>

                        <div class="clear"></div>

                    </div> <!-- End .content-box-header -->

                    <div class="content-box-content">

                        <div class="tab-content default-tab" id="tab1"> <!-- This is the target div. id must match the href of this div's tab -->


                            <form id="myForm" action="UpdateCategory" method="post" onsubmit="return validateForm()">

                                <fieldset> <!-- Set class to "column-left" or "column-right" on fieldsets to divide the form into columns -->

                                    <p>
                                        <label>Catelogy ID</label>
                                        <input class="text-input small-input" type="text" id="small-input" name="txtid" value="${requestScope.editcatelogy.categoryID}" disabled="disabled"/>
                                        <input type="hidden" name="txtid" value="${requestScope.editcatelogy.categoryID}"/>

                                    </p>

                                    <p>
                                        <label>Catelogy Name</label>
                                        <input class="text-input small-input" type="text" id="small-input" name="txtName" value="${requestScope.editcatelogy.categoryName}" />

                                    </p>

                                    <p>
                                        <input class="submit" type="submit" value="Update" />
                                    </p>

                                </fieldset>
                            </form>
                        </div>
                        <div class="clear"></div><!-- End .clear -->




                        <div class="clear"></div>



                        <div id="footer">
                            <small>
                                &#169; Copyright 2013 The Cake Site  <a href="#">Top</a>
                            </small>
                        </div><!-- End #footer -->
                    </div>
                </div> <!-- End #main-content -->

            </div>
        </div>

    </body>

</html>
