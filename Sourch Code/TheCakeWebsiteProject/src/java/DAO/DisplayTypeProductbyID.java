/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Connect.DBUtility;
import Entity.Catelogy;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThanhTung
 */
public class DisplayTypeProductbyID extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
           String id=request.getParameter("id");
        Connection conn = DBUtility.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement("SELECT * FROM Category where CategoryID=?");
            stm.setString(1, id);
            rs = stm.executeQuery();
            while (rs.next()) {

                Catelogy ca = new Catelogy();
                ca.setCategoryID(rs.getInt("CategoryID"));
                ca.setCategoryName(rs.getString("CategoryName"));

                request.setAttribute("displaytype", ca);
            }

              request.getRequestDispatcher("/DetailsProduct.jsp").forward(request, response);
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