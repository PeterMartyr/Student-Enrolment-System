/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author PeterMartyr
 */
public class Person {

    public static final String BLANK_STRING = "";

    private String name;
    private String email;
    private String telNum;
    private List<Address> addresses;

    /**
     * The all argument constructor
     *
     * @param name Both First and Last Name
     * @param email An Email Address
     * @param telNum Primary Phone Contact Number
     */
    public Person(String name, String email, String telNum) {
        this.name = name;
        this.email = email;
        this.telNum = telNum;
        this.addresses = new LinkedList();
    }

    /**
     * The no argument constructor
     */
    public Person() {
        this(BLANK_STRING, BLANK_STRING, BLANK_STRING);
    }

    /**
     * Adds postal or residential Addresses
     *
     * @param number number of the building
     * @param street Name of the Road the building is located on
     * @param suburb an outlying district of a city, the street is located in
     * @param postcode a numerical ID for a suburb
     * @param state a region in a country
     */
    public void addAdress(String number, String street, String suburb, String postcode, String state) {
        this.addresses.add(new Address(number, street, suburb, postcode, state));
    }

    /**
     *
     * @return the First and last Name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Both The First and Last Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Primary Email Contact address
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email Primary Email Contact address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return Primary Phone Contact number
     */
    public String getTelNum() {
        return telNum;
    }

    /**
     *
     * @param telNum Primary Phone Contact number
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    /**
     *
     * @return A list of the Addresses
     */
    public List<Address> getAddresses() {
        return addresses;
    }


    /**
     *
     * @return a hash code value for the object. This method is supported for
     * the benefit of hash tables such as those provided by HashMap.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    /**
     *
     * @param obj the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false
     * otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", email=" + email + ", telNum=" + telNum + ", addresses=" + addresses + '}';
    }

}
