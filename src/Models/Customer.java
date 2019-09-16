/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Gugatharsan
 */
public class Customer {
     private String cusName;
     private int cusId;
     private String email;
     private int cusPhon;
     private String address;
     private String nic;
     private String gender;

    public Customer(String cusName, int cusId, String email, int cusPhon, String address, String nic, String gender) {
        this.cusName = cusName;
        this.cusId = cusId;
        this.email = email;
        this.cusPhon = cusPhon;
        this.address = address;
        this.nic = nic;
        this.gender = gender;
    }

    public String getCusName() {
        return cusName;
    }

    public int getCusId() {
        return cusId;
    }

    public String getEmail() {
        return email;
    }

    public int getCusPhon() {
        return cusPhon;
    }

    public String getAddress() {
        return address;
    }

    public String getNic() {
        return nic;
    }

    public String getGender() {
        return gender;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCusPhon(int cusPhon) {
        this.cusPhon = cusPhon;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
