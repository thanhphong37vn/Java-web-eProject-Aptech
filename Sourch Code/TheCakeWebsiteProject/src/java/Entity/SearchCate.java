/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import Connect.DBUtility;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
public class SearchCate extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String id = request.getParameter("rollno");
        Connection conn = DBUtility.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Product> list = new ArrayList<Product>();
        try {
            pst = conn.prepareStatement("select * from Product where CategoryID=?");
            pst.setString(1, id);
            rs = pst.executeQuery();
        while (rs.next()) {
            Product pro = new Product();
            pro.setProductID(rs.getString("ProductID"));
            pro.setCategoryID(rs.getInt("CategoryID"));
            pro.setProductName(rs.getString("ProductName"));
            pro.setProductPrice(rs.getFloat("ProductPrice"));
            pro.setPictureProduct(rs.getString("pictureProduct"));
            pro.setProductContent(rs.getString("ProductContent"));

            list.add(pro);
        }
        request.setAttribute("detailPro", list);
        request.getRequestDispatcher("/EqualCate.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SearchCate.class.getName()).log(Level.SEVERE, null, ex);
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
