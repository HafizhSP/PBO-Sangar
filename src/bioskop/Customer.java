/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

/**
 *
 * @author Hafizh S.P
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


    public void setCustName(String Name) {
        this.CustName = Name;
    }

    /**
     * @return the CustomerPhone
     */
    public String getCustPhone() {
        return CustPhone;
    }

    public void setCustPhone(String Phone) {
        this.CustPhone = Phone;
    }
}
