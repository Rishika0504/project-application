package com.example.sustainablewastemanagement;

public class UserHelperClass {
    public String Name,mobileNo,address,dateofpickup,quantityofstubble;

    public UserHelperClass() {

    }
    public UserHelperClass(String Name,String mobileNo,String address,String dateofpickup,String quantityofstubble) {
        this.Name=Name;
        this.mobileNo=mobileNo;
        this.address=address;
        this.dateofpickup=dateofpickup;
        this.quantityofstubble=quantityofstubble;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateofpickup() {
        return dateofpickup;
    }

    public void setDateofpickup(String dateofpickup) {
        this.dateofpickup = dateofpickup;
    }

    public String getQuantityofstubble() {
        return quantityofstubble;
    }

    public void setQuantityofstubble(String quantityofstubble) {
        this.quantityofstubble = quantityofstubble;
    }
}
