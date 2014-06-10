
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ultitility;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author HOAN_PHAM_VAN
 */
public class PassEncrypt {

    /**
     * Encrypt password when input pass into frmLogin form
     * @param pass
     * @return String
     */
    public static String encryptPass(String pass) {
        StringBuilder result = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(pass.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            // Now we need to zero pad it if you actually want the full 32 chars.
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            String source = hashtext.substring(8, 20).toUpperCase();
            String first = source.substring(0, 4).toLowerCase();
            String second = source.substring(4, 6).toUpperCase();
            String extra = source.substring(6, 10).toLowerCase();
            String extra2 = source.substring(10, 11).toUpperCase();
            String last = source.substring(11, source.length()).toLowerCase();

            result.append(first).append(second).append(extra).append(extra2).append(last);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result.toString();
    }
}
