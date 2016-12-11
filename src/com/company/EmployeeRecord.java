package com.company;

import sun.management.snmp.jvmmib.EnumJvmMemPoolCollectThreshdSupport;

import java.util.Date;

/**
 * Created by rana_ on 12/10/2016.
 */
public class EmployeeRecord {

    private String firstName;
    private String lastName;
    private int hourlyRateCents;

    private String  gender;

    private String  title;
    private int     sin;
    private Date    dob;

    private Address address;

    public EmployeeRecord(){
        this.address = new Address();
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSin() {
        return sin;
    }

    public void setSin(int sin) {
        this.sin = sin;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHourlyRateCents() {
        return hourlyRateCents;
    }

    public void setHourlyRateCents(int hourlyRateCents) {
        this.hourlyRateCents = hourlyRateCents;
    }

    public String getFullName(){
        return this.firstName + " " + this. lastName;
    }

    public float getHourlyRateDollars(){
        return this.hourlyRateCents/100.0f;
    }


    /*
    We have totally abstracted the address from the use of EmployeeRecord
     */
    public String getStreetAndNum() {
        return this.address.getStreetAndNum();
    }

    public void setStreetAndNum(String streetAndNum) {
        this.address.setStreetAndNum(streetAndNum);
    }

    public String getState() {
        return this.address.getState();
    }

    public void setState(String state) {
        this.address.setState(state);
    }

    public int getZipCode() {
        return this.address.getZipCode();
    }

    public void setZipCode(int zipCode) {
        this.address.setZipCode(zipCode);
    }
}
