/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Connect.DBUtility;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class Signup extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String email = request.getParameter("txtEmail");
        String name = request.getParameter("txtName");
        String pass = request.getParameter("txtRepass");
        String addRess = request.getParameter("txtAdd");
        String phone = request.getParameter("txtPhone");
        String sex = request.getParameter("cbCustomSex");
        boolean sex1 = Boolean.parseBoolean(sex);
        String question = request.getParameter("txtQuestion");
        int ques = Integer.parseInt(question);
        String your = request.getParameter("txtYour");
        String month = request.getParameter("cbMonth");
        String day = request.getParameter("cbDay");
        String year = request.getParameter("txtYear");
        String dob = month+"/"+day+"/"+year;

        Connection conn = DBUtility.getConnection();
        PreparedStatement pst = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        try {
            pst = conn.prepareStatement("insert into Customer values (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, email);
            pst.setString(2, name);
            pst.setString(3, pass);
            pst.setString(4, addRess);
            pst.setString(5, phone);
            pst.setBoolean(6, sex1);
            pst.setDate(7, new java.sql.Date(dateFormat.parse(dob).getTime()));
            pst.setInt(8, ques);
            pst.setString(9, your);

            if (pst.executeUpdate()>0) {
                request.getRequestDispatcher("/processSignup.jsp").forward(request, response);
            }
        } catch (ParseException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
                pst.close();
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
