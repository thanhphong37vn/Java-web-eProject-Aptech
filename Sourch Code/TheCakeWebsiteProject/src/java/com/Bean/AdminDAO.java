/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bean;

import Connect.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author c1010k2297
 */
public class AdminDAO {

    public boolean isAdmin(Admin admin) {
        boolean flag = false;
        Connection connection = DBUtility.getConnection();
        PreparedStatement prepareSatement = null;
        try {
            String sql = "SELECT * FROM [Admin] where [AdminEmail] = ? and [PassWord] =?";
            prepareSatement = connection.prepareStatement(sql);
            prepareSatement.setString(1, admin.getEmail());
            prepareSatement.setString(2, admin.getPass());
            ResultSet resultSet = prepareSatement.executeQuery();
            if (resultSet.next()) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }

    public boolean isDuplicateEmail(String email) {
        boolean flag = false;
        Connection connection = DBUtility.getConnection();
        PreparedStatement prepareSatement = null;
        try {
            String sql = "SELECT * FROM [Admin] where [AdminEmail] = ? ";
            prepareSatement = connection.prepareStatement(sql);
            prepareSatement.setString(1, email);
            ResultSet resultSet = prepareSatement.executeQuery();
            if (resultSet.next()) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }
}
