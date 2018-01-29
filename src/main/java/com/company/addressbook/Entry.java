package com.company.addressbook;

public class Entry {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phoneNum;

    public Entry(String f, String l, String a, String e, String p){
        this.firstName = f;
        this.lastName = l;
        this.address = a;
        this.email = e;
        this.phoneNum = p;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
