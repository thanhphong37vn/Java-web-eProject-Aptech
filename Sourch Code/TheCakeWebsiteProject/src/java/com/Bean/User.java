/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bean;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author C1010K2297
 */
public class User extends org.apache.struts.action.ActionForm {

    private int customerId, daySpecial;
    private String customerEmail, customerName, customerPass, customerAdress, customerPhone, dob;
    private String cusQuestionSecret, anserSecret;
    private boolean customerSex;
    private int  customerIdParam;

    public User() {
    }

    public int getCustomerIdParam() {
        return customerIdParam;
    }

    public void setCustomerIdParam(int customerIdParam) {
        this.customerIdParam = customerIdParam;
    }
    

    public String getAnserSecret() {
        return anserSecret;
    }

    public void setAnserSecret(String anserSecret) {
        this.anserSecret = anserSecret;
    }

    public String getCusQuestionSecret() {
        return cusQuestionSecret;
    }

    public void setCusQuestionSecret(String cusQuestionSecret) {
        this.cusQuestionSecret = cusQuestionSecret;
    }

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPass() {
        return customerPass;
    }

    public void setCustomerPass(String customerPass) {
        this.customerPass = customerPass;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public boolean isCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(boolean customerSex) {
        this.customerSex = customerSex;
    }

    public int getDaySpecial() {
        return daySpecial;
    }

    public void setDaySpecial(int daySpecial) {
        this.daySpecial = daySpecial;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
//        System.out.println("da vao day");
//        if (getCustomerEmail().trim().equals("") || getCustomerEmail().length() < 1) {
//            errors.add("erroEmail", new ActionMessage("erroEmail"));
//            System.out.println("Add them erro");
//        }
//        if (getCustomerPass().trim().equals("") || getCustomerPass().length() < 1) {
//            errors.add("erroEmail", new ActionMessage("erroEmail"));
//            System.out.println("them loi");
//            System.out.println("Add them erro");
//        }
//        System.out.println(errors.get("customerEmail"));
        return errors;
    }
}
