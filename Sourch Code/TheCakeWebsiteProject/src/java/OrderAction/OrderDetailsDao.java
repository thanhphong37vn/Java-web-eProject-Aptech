/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderAction;

import Connect.DBUtility;
import Entity.CartBean;
import Entity.OrdersCus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author C1010K2297
 */
public class OrderDetailsDao {

    public static boolean addNewOrderDeatail(int Orderid, CartBean cartBean) {
        boolean flag = false;
        List<OrdersCus> list = new ArrayList<OrdersCus>();
        Connection conn = DBUtility.getConnection();
        PreparedStatement stm = null;
        try {
            String sql = "INSERT INTO [DetailOrders]"
                    + "([OrdersId]"
                    + ",[ProductID]"
                    + ",[Quantity])"
                    + "VALUES"
                    + "(?"
                    + ",?"
                    + ",?)";
            stm = conn.prepareStatement(sql);
            stm.setInt(1, Orderid);
            stm.setString(2, cartBean.getProId());
            stm.setInt(3, cartBean.getNoOfProduct());
            stm.executeUpdate();
            if (stm.executeUpdate() > 0) {
                flag = true;
            }
        } catch (Exception ex) {
            flag = false;
            ex.printStackTrace();
        } finally {
            try {
//                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return flag;
    }
}
