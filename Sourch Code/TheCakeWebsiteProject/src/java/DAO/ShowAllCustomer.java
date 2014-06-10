/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.DBUtility;
import Entity.Customer;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThanhTung
 */
public class ShowAllCustomer extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Customer> list = new ArrayList<Customer>();
        Connection conn = DBUtility.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement("SELECT * FROM Customer");
            rs = stm.executeQuery();
            while (rs.next()) {
                Customer cus = new Customer();
                cus.setCustomerId(rs.getInt("CustomerId"));
                cus.setCustomerEmail(rs.getString("CustomerEmail"));
                cus.setCustomerName(rs.getString("CustomerName"));
                cus.setCustomerPass(rs.getString("CustomerPass"));
                cus.setCustomerAdress(rs.getString("CustomerAdress"));
                cus.setCustomerPhone(rs.getString("CustomerPhone"));
                cus.setCustomerSex(rs.getString("CustomerSex"));
                cus.setDob(rs.getString("DOB"));
                cus.setCusQuestionSecret(rs.getInt("QuestionSecretID"));
                cus.setAnserSecret(rs.getString("AnserSecret"));


                list.add(cus);
            }

           
            request.setAttribute("listCus", list);
            request.getRequestDispatcher("/ShowCustomer.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
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
