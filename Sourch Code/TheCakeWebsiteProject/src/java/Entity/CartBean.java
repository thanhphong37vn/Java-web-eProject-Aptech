/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Mui
 */
public class CartBean implements Serializable {

    private String proId;
    private String proName;
    private float price;
    private float totalPrice;
    private int noOfProduct;

    public int getNoOfProduct() {
        return noOfProduct;
    }

    /**
     * Khi tao moi 1 CartBean, noOfProduct tu dong la 1 nen khong can set nua
     */
    public CartBean() {
        noOfProduct = 1;
    }

    public void setNoOfProduct(int noOfProduct) {
        totalPrice = noOfProduct * price;
        this.noOfProduct = noOfProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        totalPrice = price;
        this.price = price;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
