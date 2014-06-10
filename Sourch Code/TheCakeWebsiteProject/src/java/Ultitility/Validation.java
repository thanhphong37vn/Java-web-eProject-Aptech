/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ultitility;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Validation {

    public static String message = "";
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public static boolean isEmpty(String text) {
        if (text.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isCharacter(String text) {
        if (text.matches("^[a-zA-Z]+([\\s][a-zA-Z]+)*$")) {
            return true;
        }
        return false;
    }

    public static boolean checkContent(String text) {
        if (text.matches("^[a-zA-Z0-9]+([\\s][a-zA-Z0-9]+)*$")) {
            return true;
        }
        return false;
    }

    public static boolean checkContent2(String text) {
        if (text.matches("^[a-zA-Z0-9]+$")) {
            return true;
        }
        return false;
    }

    public static boolean isFloat(String text) {
        if (text.matches("^[0-9]+(\\.[0-9]+)*$")) {
            return true;
        }
        return false;
    }

    public static boolean isInt(String text) {
        if (text.matches("^[0-9]+$")) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean validEmail = Validation.isValidEmail("hoanpv@mail.com");
        System.out.println(validEmail);
    }
    public static boolean isValidEmail(String email) {
        if (email.matches("^[a-zA-Z]+((\\_|\\.)[a-zA-Z0-9]+)*\\@([a-zA-Z]+\\.)+[a-zA-Z]{2,4}$")) {
            return true;
        }
        return false;
    }

    public static Date convertStringToDate(String sDate) {
        Date date = null;

        try {
            date = new Date(format.parse(sDate).getTime());
            message = "Convert successfully";
        } catch (ParseException ex) {
            ex.printStackTrace();
            message = "Convert Fail";
        } finally {
            return date;
        }
    }

    public static String convertDateToString(Date date) {
        return format.format(date);
    }

    public static boolean isDate(String sDate) {
        try {
            format.setLenient(false);
            Date date = new Date(format.parse(sDate).getTime());
            if (date.compareTo(new Date(0, 0, 1)) < 0) {
                message = "Wrong Date Format";
                return false;
            }
            return true;
        } catch (ParseException ex) {
            message = "Wrong Date Format";
            return false;
        } catch (Exception ex) {
            message = "Wrong Date Format";
            return false;
        }
    }

    public static Date addToDate(int arg) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_YEAR, arg);
        Date date = new Date(c.getTimeInMillis());
        return date;
    }

    public static boolean validateComponents(JTextComponent[] component) {
        if (component != null) {
            for (int i = 0; i < component.length; i++) {
                component[i].setBackground(Color.white);
                if (isEmpty(component[i].getText())) {
                    showMessage("Empty value is not allowed here");
                    component[i].setBackground(new Color(250, 255, 168));
                    component[i].requestFocus();
                    return false;
                }
                if (component[i].getName().matches("^.*Date$")) {
                    if (!isDate(component[i].getText())) {
                        showMessage("<html><center>Data must be in date format <br>(dd/MM/yyyy)</center></html>");
                        component[i].setBackground(new Color(250, 255, 168));
                        component[i].requestFocus();
                        return false;
                    }
                }
                if (component[i].getName().matches("^(.*Name)$")) {
                    if (!checkContent(component[i].getText())) {
                        showMessage("<html><center>Only character and digit value should be allowed<br>There should be only one space<br>between two words</center></html>");
                        component[i].setBackground(new Color(250, 255, 168));
                        component[i].requestFocus();
                        return false;
                    }
                }
                if (component[i].getName().matches("^(.*name)$")) {
                    if (!checkContent2(component[i].getText())) {
                        showMessage("Invalid character(s)");
                        component[i].setBackground(new Color(250, 255, 168));
                        component[i].requestFocus();
                        return false;
                    }
                }
                if (component[i].getName().matches("^(.*Sale)|(.*Budget)$")) {
                    if (!isFloat(component[i].getText())) {
                        showMessage("Data must be in float format");
                        component[i].setBackground(new Color(250, 255, 168));
                        component[i].requestFocus();
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static boolean setBlankField(JTextComponent[] component) {
        if (component != null) {
            for (int i = 0; i < component.length; i++) {
                component[i].setBackground(Color.white);
                component[i].setText("");
            }
        }

        return true;
    }
    private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Validate hex with regular expression
     *
     * @param hex
     *            hex for validation
     * @return true valid hex, false invalid hex
     */
    public boolean isEmail(final String hex) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(hex);
        return matcher.matches();

    }

//    public static boolean isDuplicateValue(String table, String column, String value) {
//        String _sql = "select " + column + " from " + table + " where " + column + " like '" + value + "'";
//        try {
//            ResultSet rs = DBUtility createResultSet(_sql);
//            if (!rs.first()) {
//                return false;
//            }
//            return true;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return true;
//        }
//    }
//    public static boolean isDuplicateValue(String table, String columnID, String valueID, String columnREF, String valueREF) {
//        String _sql = "select " + columnREF + " from " + table + " where " + columnREF + " like '" + valueREF + "'"
//                + "and " + columnID + " != '" + valueID + "'";
//        try {
//            ResultSet rs = DBAccess.createResultSet(_sql);
//            if (!rs.first()) {
//                return false;
//            }
//            return true;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return true;
//        }
//    }
    public static float round(float number, int digit) {
        if (digit > 0) {
            float temp = (float) Math.pow((double) 10, (double) digit);
            number = Math.round(number * temp) / temp;

            return number;
        } else {
            return 0;
        }
    }

    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
//        new ShowMessageDialog(null, true, message, "Validation Message", ShowMessageDialog.MESSAGE);
    }
}
