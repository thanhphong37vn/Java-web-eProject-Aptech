/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Action;

import Ultitility.Validation;
import com.Bean.Admin;
import com.Bean.AdminDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author c1001g1510
 */
public class AdminAction extends org.apache.struts.action.Action {

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
        String page = "notok";
        Admin admin = (Admin) form;

        if (Validation.isValidEmail(admin.getEmail())
                && !Validation.isEmpty(admin.getPass())
                && !Validation.isEmpty(admin.getEmail())) {
//            boolean check = new UserDAO().isUser(u);
            boolean kq = new AdminDAO().isAdmin(admin);
            if (kq) {
                request.getSession(true).setAttribute("loginOk", admin);
                page = "ok";
            }
        }
        return mapping.findForward(page);
    }
}
