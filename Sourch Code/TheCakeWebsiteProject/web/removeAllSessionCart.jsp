<%
            try {
                request.getSession(true).removeAttribute("SHOP");
                response.sendRedirect("product.jsp");
            } catch (Exception e) {
            }

%>