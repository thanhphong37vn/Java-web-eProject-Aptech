/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Action;

import Connect.DBUtility;
import Entity.QuestionSecret;
import com.Bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Administrator
 */
public class editCus extends org.apache.struts.action.Action {
    
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
        User user = (User)form;
        Connection conn = DBUtility.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        List<QuestionSecret> list = new ArrayList<QuestionSecret>();

        pst = conn.prepareStatement("select * from Customer where CustomerId=?");
        pst.setInt(1, user.getCustomerId());
        rs = pst.executeQuery();
        if (rs.next()) {
                user.setCustomerId(rs.getInt("CustomerId"));
                user.setCustomerEmail(rs.getString("CustomerEmail"));
                user.setCustomerName(rs.getString("CustomerName"));
                user.setCustomerPass(rs.getString("CustomerPass"));
                user.setCustomerAdress(rs.getString("CustomerAdress"));
                user.setCustomerPhone(rs.getString("CustomerPhone"));
                user.setCustomerSex(rs.getBoolean("CustomerSex"));
                java.util.Date dob = new java.util.Date(rs.getDate("DOB").getTime());
                user.setDob(dateFormat.format(dob));
                user.setCusQuestionSecret(rs.getString("QuestionSecretID"));
                user.setAnserSecret(rs.getString("AnserSecret"));
            }

            pst = conn.prepareStatement("select * from QuestionSecret");
            rs = pst.executeQuery();
            while (rs.next()) {
                QuestionSecret que = new QuestionSecret();
                que.setQuestionSecretID(rs.getInt("QuestionSecretID"));
                que.setQuestionSecretContent(rs.getString("CusQuestionSecret"));

                list.add(que);
            }
            request.setAttribute("showQues", list);
        try {
            conn.close();
            pst.close();
            rs.close();
        } catch (Exception e) {
        }
        return mapping.findForward("showOk");
    }
}
