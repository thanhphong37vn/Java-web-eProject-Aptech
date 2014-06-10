/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Administrator
 */
public class Customer {
    private int customerId;
    private String customerEmail, customerName, customerPass, customerAdress, customerPhone, dob;
    private String anserSecret;
    private int cusQuestionSecret;
    private String customerSex;

    public Customer() {
    }

    public Customer(int customerId, String customerEmail, String customerName, String customerPass, String customerAdress, String customerPhone, String dob, int cusQuestionSecret, String anserSecret, String customerSex) {
        this.customerId = customerId;
        
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerPass = customerPass;
        this.customerAdress = customerAdress;
        this.customerPhone = customerPhone;
        this.dob = dob;
        this.cusQuestionSecret = cusQuestionSecret;
        this.anserSecret = anserSecret;
        this.customerSex = customerSex;
    }

    public String getAnserSecret() {
        return anserSecret;
    }

    public void setAnserSecret(String anserSecret) {
        this.anserSecret = anserSecret;
    }

    public int getCusQuestionSecret() {
        return cusQuestionSecret;
    }

    public void setCusQuestionSecret(int cusQuestionSecret) {
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

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

  

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
}
