/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Administrator
 */
public class DetailOrders {
    private int  ordersId, productID, quantity;
     private String id;

    public DetailOrders() {
    }

    public DetailOrders(String id, int ordersId, int productID, int quantity) {
        this.id = id;
        this.ordersId = ordersId;
        this.productID = productID;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
        public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
        }
    @Override
        public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (obj == null)
        return false;
        if (getClass() != obj.getClass())
        return false;
        DetailOrders other = (DetailOrders) obj;
        if (id == null) {
        if (other.id != null)
        return false;
        } else if (!id.equals(other.id))
        return false;
        return true;
        }
    @Override
        public String toString() {
        return id;
        }
}
