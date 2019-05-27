/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

/**
 *
 * @author samsung
 */
public class Customer {
    private static String CustomerName;
    private static String CustomerPhone;
    

    /**
     * @return the CustomerName
     */
    public String getCustomerName() {
        return CustomerName;
    }

    /**
     * @param n
     * @param CustomerName the CustomerName to set
     */
    public void setCustomerName(String n) {
        this.CustomerName = n;
    }

    /**
     * @return the CustomerPhone
     */
    public String getCustomerPhone() {
        return CustomerPhone;
    }

    /**
     * @param t
     * @param CustomerPhone the CustomerPhone to set
     */
    public void setCustomerPhone(String t) {
        this.CustomerPhone = t;
    }
}
