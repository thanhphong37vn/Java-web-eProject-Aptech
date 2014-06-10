/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.DBUtility;
import Entity.CartBean;
import Entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mui
 */
public class Controller extends HttpServlet {

    private final String productPage = "/product.jsp";
    private final String showPage = "/shoppingcart.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String action = request.getParameter("action");
            if (action.equals("Add2Cart")) {

                add2CartProcess(request);
                request.getRequestDispatcher(productPage).forward(request, response);
            } else {
                if (action.equals("ViewCart")) {
                    loadCart(request);
                } else if (action.equals("Remove")) {
                    removeFromCartProcess(request);
                }
                RequestDispatcher rd = request.getRequestDispatcher(showPage);
                rd.forward(request, response);
            }
        } finally {
            out.close();
        }
    }

    private void add2CartProcess(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        Map<String, CartBean> cart = (Map<String, CartBean>) session.getAttribute("SHOP");
        if (cart == null) {
            cart = new HashMap<String, CartBean>();
        }
        String productId = request.getParameter("proId");
        CartBean bean = null;
        if (cart.containsKey(productId)) {
//            cart.remove(productId);l
            bean = cart.get(productId);
            bean.setNoOfProduct(bean.getNoOfProduct() + 1);
        } else {
            Product pro = loadDetails(productId);
            bean = new CartBean();
            bean.setPrice(pro.getProductPrice());
            bean.setProId(productId);
            bean.setProName(pro.getProductName());

            cart.put(productId, bean);
        }
        session.setAttribute("SHOP", cart);
    }

    private void removeFromCartProcess(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        Map<String, CartBean> cart = (Map<String, CartBean>) session.getAttribute("SHOP");
        if (cart != null) {
            String productId = request.getParameter("proId");
            if (cart.containsKey(productId)) {
                cart.remove(productId);
            }
        }

        loadCart(request);
        session.setAttribute("SHOP", cart);
    }

    private Product loadDetails(String priId) {
        Product pro = null;
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        conn = DBUtility.getConnection();
        try {
            pst = conn.prepareStatement(" select * from Product where ProductID=? ");
            pst.setString(1, priId);
            rs = pst.executeQuery();
            if (rs.next()) {
                pro = new Product();
                pro.setProductID(rs.getString("ProductID"));
                pro.setProductName(rs.getString("ProductName"));
                pro.setProductPrice(rs.getFloat("ProductPrice"));
                pro.setPictureProduct(rs.getString("PictureProduct"));
                pro.setProductContent(rs.getString("ProductContent"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShowProduct.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
                pst.close();
                rs.close();
            } catch (Exception e) {
            }
        }

        return pro;
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void loadCart(HttpServletRequest request) {
        List<CartBean> cartList = new ArrayList<CartBean>();
        int count = 0;
        float totalPriceInCart = 0;
        HttpSession session = request.getSession(true);
        Map<String, CartBean> cart = (Map<String, CartBean>) session.getAttribute("SHOP");
        if (cart != null) {
            Set<String> keySet = cart.keySet();
            for (String key : keySet) {
                CartBean bean = cart.get(key);
                count += bean.getNoOfProduct();
                cartList.add(bean);

                totalPriceInCart += bean.getTotalPrice();
            }
        }
        request.setAttribute("totalPriceInCart", totalPriceInCart);
        request.setAttribute("cartList", cartList);
        request.setAttribute("count", count);
    }
}
