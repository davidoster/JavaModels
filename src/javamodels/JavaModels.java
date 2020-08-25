/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamodels;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Human;

/**
 *
 * @author George.Pasparakis
 */
public class JavaModels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize Scanner for user's input
        Scanner sc = new Scanner(System.in);
        // creates an object of class Human
        Human human = new Human();
        // create a Collection - ArrayList that holds multiple humans
        ArrayList<Human> humans = new ArrayList<>();

        for(int i = 0; i < 2; i++) {
          human = new Human();
          askUserDetails(sc, human);
          humans.add(human);
        }
        printHumans(humans);
    }
    
    public static void askUserDetails(Scanner sc, Human human1) {
         // SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        System.out.println("Please give First Name: ");
        // stores user's input on human1.firstName
        String userFirstName = sc.nextLine();
        human1.setFirstName(userFirstName);
//        System.out.println("Your first name is: " + human1.getFirstName());
        
        System.out.println("Please give Last Name: ");
        // store user's input on human1.lastName
        String userLastName = sc.nextLine();
        human1.setLastName(userLastName);
//        System.out.println("Your last name is: " + human1.getLastName());
        
        System.out.println("Please give Date of Birth: ");
        // store user's input on human1.lastName
        Date userDateOfBirth = null;
        try {
            userDateOfBirth = sdf.parse(sc.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(JavaModels.class.getName()).log(Level.SEVERE, null, ex);
        }
        human1.setDateOfBirth(userDateOfBirth);
//        System.out.println("Your date of birth is: " + human1.getDateOfBirth());
    }
    
    public static void printHumans(ArrayList<Human> humans) {
        for(int i = 0; i < 2; i++) {
            System.out.println(humans.get(i));
        }
    }
    
}
