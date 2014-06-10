/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Administrator
 */
public class OrdersCus {
    private int ordersId, customerId;
    private String orderDate, contactName, emailRecipients, phoneRecipients;
    private float totalPrice;
    private boolean orderStatus;

    public OrdersCus() {
    }

    public OrdersCus(int ordersId, int customerId, String orderDate, String contactName, String emailRecipients, String phoneRecipients, float totalPrice, boolean orderStatus) {
        this.ordersId = ordersId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.contactName = contactName;
        this.emailRecipients = emailRecipients;
        this.phoneRecipients = phoneRecipients;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getEmailRecipients() {
        return emailRecipients;
    }

    public void setEmailRecipients(String emailRecipients) {
        this.emailRecipients = emailRecipients;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public String getPhoneRecipients() {
        return phoneRecipients;
    }

    public void setPhoneRecipients(String phoneRecipients) {
        this.phoneRecipients = phoneRecipients;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
