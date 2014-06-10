/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderAction;

import Connect.DBUtility;
import Entity.OrdersCus;
import com.Bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author C1010K2297
 */
public class OrderDAO {

    public boolean addNewOrder(User u) {
        boolean flag = false;
        List<OrdersCus> list = new ArrayList<OrdersCus>();
        Connection conn = DBUtility.getConnection();
        PreparedStatement stm = null;
        try {
            String sql = "INSERT INTO [OrdersCus]"
                    + "([CustomerId]"
                    + ",[OrderDate]"
                    + ",[OrderStatus]"
                    + ",[TotalPrize]"
                    + ",[ContactName]"
                    + ",[Emailrecipients]"
                    + ",[Phonerecipients])"
                    + "VALUES"
                    + "(?"
                    + ",null"
                    + ",1"
                    + ",0"
                    + ",null"
                    + ",null"
                    + ",null)";
            stm = conn.prepareStatement(sql);
            stm.setInt(1, u.getCustomerId());
            stm.executeUpdate();
            if (stm.executeUpdate() > 0) {
                flag = true;
            }
        } catch (Exception ex) {
            flag = false;
            ex.printStackTrace();
        } finally {
            try {
                stm.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return flag;
    }

    public OrderDAO() {
    }

    public List<OrdersCus> getListOrder() {
        List<OrdersCus> list = new ArrayList<OrdersCus>();
        Connection conn = DBUtility.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement("SELECT * FROM OrdersCus");
            rs = stm.executeQuery();
            while (rs.next()) {
                OrdersCus cu = new OrdersCus();
                cu.setOrdersId(rs.getInt("OrdersId"));
                cu.setCustomerId(rs.getInt("CustomerId"));
                cu.setOrderDate(rs.getString("OrderDate"));
                cu.setOrderStatus(rs.getBoolean("OrderStatus"));
                cu.setTotalPrice(rs.getFloat("TotalPrize"));
                cu.setContactName(rs.getString("ContactName"));
                cu.setEmailRecipients(rs.getString("Emailrecipients"));
                cu.setPhoneRecipients(rs.getString("Phonerecipients"));


                list.add(cu);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }

    public int getlastOrderId() {
        List<OrdersCus> listOrder = getListOrder();
        return listOrder.get(listOrder.size() - 1).getOrdersId();
    }
}
