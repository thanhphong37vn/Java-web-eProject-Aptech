/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bean;

/**
 *
 * @author c1001g1510
 */
public class Admin extends org.apache.struts.action.ActionForm {

    private String userName, pass, email;

    public Admin() {
    }

    public Admin(String userName, String pass, String email) {
        this.userName = userName;
        this.pass = pass;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
