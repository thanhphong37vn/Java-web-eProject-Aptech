/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.DBUtility;
import com.Bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

/**
 *
 * @author c1001g1510
 */
public class UserDAO {

    public static User isUser(User user) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        con = DBUtility.getConnection();
        try {
            ps = con.prepareStatement("SELECT * FROM [Customer] where [CustomerEmail] = ? and [CustomerPass] =?");
            ps.setString(1, user.getCustomerEmail());
            ps.setString(2, user.getCustomerPass());
            rs = ps.executeQuery();
            if (rs.next()) {
                user.setCustomerId(rs.getInt("CustomerId"));
                user.setCustomerName(rs.getString("CustomerName"));
                user.setCustomerEmail(rs.getString("CustomerEmail"));
                user.setCustomerPass(rs.getString("CustomerPass"));
                user.setCustomerAdress(rs.getString("CustomerAdress"));
                user.setCustomerPhone(rs.getString("CustomerPhone"));
                user.setCustomerSex(rs.getBoolean("CustomerSex"));
                java.util.Date dob = new java.util.Date(rs.getDate("DOB").getTime());
                user.setDob(dateFormat.format(dob));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                ps.close();
                rs.close();
            } catch (Exception e) {
            }
        }
        return user;
    }

    public static User getUser(User user) {
        User user1 = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DBUtility.getConnection();
            ps = con.prepareStatement("SELECT * FROM [Customer] where [CustomerEmail] = ? and [CustomerPass] =?");
            ps.setString(1, user1.getCustomerEmail());
            ps.setString(2, user1.getCustomerPass());
            rs = ps.executeQuery();
            if (rs.next()) {
                user1 = new User();
                user1.setCustomerId(rs.getInt("CustomerId"));
                user1.setCustomerEmail(rs.getString("CustomerEmail"));
                user1.setCustomerName(rs.getString("CustomerName"));
                user1.setCustomerPass(rs.getString("CustomerPass"));
                user1.setCustomerAdress(rs.getString("CustomerAdress"));
                user1.setCustomerPhone(rs.getString("CustomerPhone"));
//                flag.setCustomerSex(rs.getString("CustomerSex"));
                user1.setDob(rs.getString("DOB"));
//                flag.setCusQuestionSecret(rs.getInt("QuestionSecretID"));
                user1.setAnserSecret(rs.getString("AnserSecret"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return user1;
    }

    public static boolean checkEmail(String mail) {
        boolean flag = false;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DBUtility.getConnection();
            ps = con.prepareStatement("SELECT * FROM [Customer] where [CustomerEmail] = ?");
            ps.setString(1, mail);
            rs = ps.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return flag;
    }

    public static boolean updateUserPass(String email, String pass) {
        boolean flag = false;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DBUtility.getConnection();
            ps = con.prepareStatement("UPDATE [Customer] SET [CustomerPass] =? where [CustomerEmail] = ?");
            ps.setString(1, pass);
            ps.setString(2, email);
            if (ps.executeUpdate() > 0) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return flag;
    }
}
