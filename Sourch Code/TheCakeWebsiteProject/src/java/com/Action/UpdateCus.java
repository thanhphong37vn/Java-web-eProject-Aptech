/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Action;

import Connect.DBUtility;
import com.Bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Administrator
 */
public class UpdateCus extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String question = request.getParameter("txtQuestion1");
        User user = (User)form;
        Connection conn = DBUtility.getConnection();
        PreparedStatement pst = null;

        pst = conn.prepareStatement("update Customer set CustomerName=?, CustomerAdress=?, CustomerPhone=?, CustomerSex=?, QuestionSecretID=?, AnserSecret=? where CustomerId=?");
            pst.setString(1, user.getCustomerName());
            pst.setString(2, user.getCustomerAdress());
            pst.setString(3, user.getCustomerPhone());
            pst.setBoolean(4, user.isCustomerSex());
            pst.setString(5, question);
            pst.setString(6, user.getAnserSecret());
            pst.setInt(7, user.getCustomerId());
            if (pst.executeUpdate()>0) {
                try {
                    conn.close();
                    pst.close();
                } catch (Exception e) {
                }
                return mapping.findForward("updateOk");
            }else{
                return mapping.findForward("updateFalse");
           }
    }
}
