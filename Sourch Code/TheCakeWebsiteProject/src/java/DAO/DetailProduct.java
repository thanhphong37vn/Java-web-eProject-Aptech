/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Connect.DBUtility;
import Entity.Catelogy;
import Entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class DetailProduct extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String id = request.getParameter("id");
        Connection conn = DBUtility.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement("select * from Product where ProductID=?");
            pst.setString(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                Product pro = new Product();
                pro.setProductID(rs.getString("ProductID"));
                pro.setCategoryID(rs.getInt("CategoryID"));
                pro.setProductName(rs.getString("ProductName"));
                pro.setProductPrice(rs.getFloat("ProductPrice"));
                pro.setPictureProduct(rs.getString("pictureProduct"));
                pro.setProductContent(rs.getString("ProductContent"));

                pst = conn.prepareStatement("select * from Category where CategoryID=?");
                pst.setInt(1, pro.getCategoryID());
                rs = pst.executeQuery();
                if (rs.next()) {
                    Catelogy cate = new Catelogy();
                    cate.setCategoryID(rs.getInt("CategoryID"));
                    cate.setCategoryName(rs.getString("CategoryName"));


                request.setAttribute("catePro", cate);
                }
                request.setAttribute("detailPro", pro);
            }
            request.getRequestDispatcher("/DetailProduct.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DetailProduct.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
                pst.close();
                rs.close();
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