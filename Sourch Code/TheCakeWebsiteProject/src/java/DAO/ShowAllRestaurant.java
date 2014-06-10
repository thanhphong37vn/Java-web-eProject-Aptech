/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Connect.DBUtility;
import Entity.Restaurant;
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
public class ShowAllRestaurant extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         List<Restaurant> list = new ArrayList<Restaurant>();
        Connection conn = DBUtility.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement("SELECT * FROM Restaurant");
            rs = stm.executeQuery();
            while (rs.next()) {
                Restaurant res = new Restaurant();
                res.setRestaurantId(rs.getInt("RestaurantId"));
                res.setRestaurantName(rs.getString("RestaurantName"));
                res.setRestaurantAdress(rs.getString("RestaurantAdress"));
                res.setRestaurantContent(rs.getString("RestaurantContent"));
                res.setRestaurantPhone(rs.getString("RestaurantPhone"));
                res.setChef(rs.getString("Chef"));

                list.add(res);
            }
            System.out.println(list.size());
              request.setAttribute("listRestaurant", list);
              request.getRequestDispatcher("/ShowRestaurant.jsp").forward(request, response);
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