/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Action;

import DAO.UserDAO;
import Ultitility.Validation;
import com.Bean.User;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author C1010K2297
 */
public class UserAction extends org.apache.struts.action.Action {

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
        User u = (User) form;

        boolean tick = false;

        try {
            tick = Boolean.parseBoolean(request.getParameter("rememberme"));
        } catch (Exception e) {
        }

        if (tick) {
            Cookie cU = new Cookie("u", u.getCustomerEmail());
            Cookie cP = new Cookie("p", u.getCustomerPass());
            Cookie chk = new Cookie("chk", "true");
            cU.setMaxAge(24 * 3600);
            cP.setMaxAge(24 * 3600);
            chk.setMaxAge(24 * 3600);

            response.addCookie(cP);
            response.addCookie(cU);
            response.addCookie(chk);
        }

        if (Validation.isValidEmail(u.getCustomerEmail())
                && !Validation.isEmpty(u.getCustomerEmail())
                && !Validation.isEmpty(u.getCustomerPass())) {
            User user = UserDAO.isUser(u);
            boolean kq = false;
            if (user != null) {
                kq = true;
            }
            if (kq) {
//                User user = UserDAO.getUser(u);
//                request.getSession(true).setAttribute("cusId", user.getCustomerId());
                request.getSession(true).setAttribute("loginOk", u);
                page = "ok";
            } else {
                request.setAttribute("msg", "You have entered an invalid email or password!!!");
            }
        }
        return mapping.findForward(page);
    }
}
