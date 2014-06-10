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
public class ChangePass extends org.apache.struts.action.Action {
    
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

        pst = conn.prepareStatement("update Customer set CustomerPass=? where CustomerId=?");
            pst.setString(1, user.getCustomerPass());
            pst.setInt(2, user.getCustomerId());
            if (pst.executeUpdate()>0) {
                try {
                    conn.close();
                    pst.close();
                } catch (Exception e) {
                }
                return mapping.findForward("changeOk");
            }else{
                return mapping.findForward("changeFalse");
           }
    }
}
