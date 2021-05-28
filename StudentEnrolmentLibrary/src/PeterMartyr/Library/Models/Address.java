/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import java.util.Objects;

/**
 *
 * @author 001091501
 */
public class Address {

    public static final String BLANK_STRING = "";

    private String number;
    private String street;
    private String suburb;
    private String postcode;
    private String state;

    /**
     *
     * @param number
     * @param street
     * @param suburb
     * @param postcode
     * @param state
     */
    public Address(String number, String street, String suburb, String postcode, String state) {
        this.number = number;
        this.street = street;
        this.suburb = suburb;
        this.postcode = postcode;
        this.state = state;
    }

    /**
     *
     */
    public Address() {
        this(BLANK_STRING, BLANK_STRING, BLANK_STRING, BLANK_STRING, BLANK_STRING);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.number);
        hash = 29 * hash + Objects.hashCode(this.street);
        hash = 29 * hash + Objects.hashCode(this.suburb);
        hash = 29 * hash + Objects.hashCode(this.postcode);
        hash = 29 * hash + Objects.hashCode(this.state);
        return hash;
    }

    /**
     *
     * @param obj to compare
     * @return true or false
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
        final Address other = (Address) obj;
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.suburb, other.suburb)) {
            return false;
        }
        if (!Objects.equals(this.postcode, other.postcode)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return a descriptive string of the object
     */
    @Override
    public String toString() {
        return "Address{" + "number=" + number + ", street=" + street + ", suburb=" + suburb + ", postcode=" + postcode + ", state=" + state + '}';
    }

}
