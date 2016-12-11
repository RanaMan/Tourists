package com.company;

/**
 * Created by rana_ on 12/10/2016.
 */
public class Address {
    private String  streetAndNum;
    private String  state;
    private int     zipCode;


    public Address(){

    }

    public String getStreetAndNum() {
        return streetAndNum;
    }

    public void setStreetAndNum(String streetAndNum) {
        this.streetAndNum = streetAndNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
