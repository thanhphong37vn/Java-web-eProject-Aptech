/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author ThanhTung
 */
public class Restaurant {
public int restaurantId;
    public String restaurantName;
    public String restaurantAdress;
    public String restaurantContent;
    public String restaurantPhone;
    public String chef;

    public Restaurant() {
    }

    public Restaurant(int restaurantId, String restaurantName, String restaurantAdress, String restaurantContent, String restaurantPhone, String chef) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantAdress = restaurantAdress;
        this.restaurantContent = restaurantContent;
        this.restaurantPhone = restaurantPhone;
        this.chef = chef;
    }

    


    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }


    public String getRestaurantAdress() {
        return restaurantAdress;
    }

    public void setRestaurantAdress(String restaurantAdress) {
        this.restaurantAdress = restaurantAdress;
    }

    public String getRestaurantContent() {
        return restaurantContent;
    }

    public void setRestaurantContent(String restaurantContent) {
        this.restaurantContent = restaurantContent;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantPhone() {
        return restaurantPhone;
    }

    public void setRestaurantPhone(String restaurantPhone) {
        this.restaurantPhone = restaurantPhone;
    }

}
