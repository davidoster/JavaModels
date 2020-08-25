/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author George.Pasparakis
 */
/*

public
protected
default
private

*/
        
        
public class Human {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    
    /*
    setter is a method which returns nothing (void) and gives the ability to 
    an external program (code)
    to set the value of a field on a predefined way
    */
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }
    
    public String getFirstName() {
        return this.firstName; // return(this.firstName);
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Override
    public String toString() {
        return "Human{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + '}';
    }
    
    
}
