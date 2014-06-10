/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Connect.DBUtility;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThanhTung
 */
public class UpdateProduct extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       Connection conn = null;
        PreparedStatement stm = null;
        conn= DBUtility.getConnection();
        try {
            String ProductID = request.getParameter("txtid");
            String CategoryID = request.getParameter("txtCategoryID");
            String ProductName = request.getParameter("txtProductName");
            String ProductPrice = request.getParameter("txtProductPrice");
            String pictureProduct = request.getParameter("txtpictureProduct");
            String ProductContent = request.getParameter("txtProductContent");



            stm = conn.prepareStatement("update Product set CategoryID=?,ProductName=?,ProductPrice=?,pictureProduct=?,ProductContent=? where ProductID=?");
            stm.setString(1, CategoryID);
            stm.setString(2, ProductName);
            stm.setString(3, ProductPrice);
            stm.setString(4, pictureProduct);
            stm.setString(5, ProductContent);
            stm.setString(6, ProductID);

            stm.executeUpdate();

            request.getRequestDispatcher("/ShowAllProduct").forward(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(UpdateProduct.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
                stm.close();
            } catch (Exception e) {
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
