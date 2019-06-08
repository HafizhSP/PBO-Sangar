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
    private static String CustName;
    private static String CustPhone;
    

    /**
     * @return the CustomerName
     */
    public String getCustName() {
        return CustName;
    }


    public void setCustName(String name) {
        this.CustName = name;
    }

    /**
     * @return the CustomerPhone
     */
    public String getCustPhone() {
        return CustPhone;
    }

    public void setCustPhone(String phone) {
        this.CustPhone = phone;
    }
}
