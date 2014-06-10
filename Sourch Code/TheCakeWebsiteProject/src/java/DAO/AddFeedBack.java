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
import java.sql.Date;
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
public class AddFeedBack extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       Connection conn;
       PreparedStatement stm = null;
       conn = DBUtility.getConnection();

       String feedName = request.getParameter("txtName");
       String feedEmail = request.getParameter("txtEmail");
       String feedSubject = request.getParameter("txtSubject");
       String feedContent = request.getParameter("txtmessage");
        Date today=new Date(System.currentTimeMillis());
        try {
            stm = conn.prepareStatement("insert into FeedBack values(?,?,?,?,?)");
            stm.setString(1, feedName);
            stm.setString(2, feedEmail);
            stm.setString(3, feedSubject);
            stm.setString(4, feedContent);
            stm.setDate(5,  today);

            if (stm.executeUpdate()>0) {
                 request.getRequestDispatcher("/HomePage.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddFeedBack.class.getName()).log(Level.SEVERE, null, ex);
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
