/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.CartBean;
import Entity.OrdersCus;
import OrderAction.OrderDAO;
import OrderAction.OrderDetailsDao;
import com.Bean.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author C1010K2297
 */
public class UpdateOrderfromUser extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        List<CartBean> cartList = new ArrayList<CartBean>();
        try {
            int count = 0;
//        float totalPriceInCart = 0;
            HttpSession session = request.getSession(true);
            Map<String, CartBean> cart = (Map<String, CartBean>) session.getAttribute("SHOP");
            User user = (User) session.getAttribute("loginOk");
            System.out.println("Cus :" + user.getCustomerId());
//                request.getSession(true).setAttribute("cusId", user.getCustomerId());
            if (cart != null) {
                Set<String> keySet = cart.keySet();
                OrdersCus cus = new OrdersCus();
                OrderDAO orderDAO = new OrderDAO();
                if (orderDAO.addNewOrder(user)) {
                    int lastOrderId = orderDAO.getlastOrderId();
                    if (lastOrderId >= 0) {
                        for (String key : keySet) {
                            CartBean bean = cart.get(key);
                            if (OrderDetailsDao.addNewOrderDeatail(lastOrderId, bean)) {
                                System.out.println("Add Order successfully");
                            }
                            request.getRequestDispatcher("success.jsp").forward(request, response);
                        }
                    }
                }
            } else {
                request.getRequestDispatcher("product.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.getRequestDispatcher("/Error.jsp").forward(request, response);
        }
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
}
