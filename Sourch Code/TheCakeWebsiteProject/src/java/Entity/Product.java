/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Administrator
 */
public class Product {
    private int categoryID;
    private String productName, pictureProduct, productContent, productID;
    private float productPrice;

    public Product() {
    }

    public Product(int categoryID, String productName, String pictureProduct, String productContent, String productID, float productPrice) {
        this.categoryID = categoryID;
        this.productName = productName;
        this.pictureProduct = pictureProduct;
        this.productContent = productContent;
        this.productID = productID;
        this.productPrice = productPrice;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getPictureProduct() {
        return pictureProduct;
    }

    public void setPictureProduct(String pictureProduct) {
        this.pictureProduct = pictureProduct;
    }

    public String getProductContent() {
        return productContent;
    }

    public void setProductContent(String productContent) {
        this.productContent = productContent;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    @Override
        public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productID == null) ? 0 : productID.hashCode());
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
        Product other = (Product) obj;
        if (productID == null) {
        if (other.productID != null)
        return false;
        } else if (!productID.equals(other.productID))
        return false;
        return true;
        }

        @Override
        public String toString() {
        return productName;
        }
}

