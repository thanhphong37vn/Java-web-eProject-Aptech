<%
    try{
        request.getSession(true).removeAttribute("loginOk");
        response.sendRedirect("signin.jsp");
    }catch(Exception e){}
    try{
        request.getSession(true).removeAttribute("U");
        response.sendRedirect("signin.jsp");
    }catch(Exception e){}

%>