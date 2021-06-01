/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import java.util.Objects;

/**
 *
 * @author PeterMartyr
 */
public class Address {

    /**
     *
     */
    public static final String BLANK_STRING = "";

    private String number;
    private String street;
    private String suburb;
    private String postcode;
    private String state;

    /**
     * the all argument constructor
     *
     * @param number number of the building
     * @param street Name of the Road the building is located on
     * @param suburb an outlying district of a city, the street is located in
     * @param postcode a numerical ID for a suburb
     * @param state a region in a country
     */
    public Address(String number, String street, String suburb, String postcode, String state) {
        this.number = number;
        this.street = street;
        this.suburb = suburb;
        this.postcode = postcode;
        this.state = state;
    }

    /**
     * The no argument constructor
     */
    public Address() {
        this(BLANK_STRING, BLANK_STRING, BLANK_STRING, BLANK_STRING, BLANK_STRING);
    }

    /**
     *
     * @return the number of the residence
     */
    public String getNumber() {
        return number;
    }

    /**
     *
     * @param number set the number of the residence
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     *
     * @return the name of the street of the building
     */
    public String getStreet() {
        return street;
    }

    /**
     * set the name of street of the building
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return the district name of the location
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     *
     * @param suburb set the district name of the location
     */
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    /**
     *
     * @return the numerical ID for the suburb
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     *
     * @param postcode set the numerical ID for suburb
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     *
     * @return the region of the residence location
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state sets region of the residence location
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return a hash code value for the object. This method is supported for
     * the benefit of hash tables such as those provided by HashMap.
     */
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
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Address{" + "number=" + number + ", street=" + street + ", suburb=" + suburb + ", postcode=" + postcode + ", state=" + state + '}';
    }

}
