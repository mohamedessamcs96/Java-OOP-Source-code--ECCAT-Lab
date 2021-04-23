/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Date;

/**
 *
 * @author Copy Center
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Car bmw=new Car();
        bmw.birthdate=2000;
        bmw.color="Black";
        bmw.doors=4;
        bmw.type="Manual";
        bmw.speed=300;
        
        
        
        System.out.println("The car age is :"+bmw.getAge(bmw.getBirthdate()));
        
    }
    
}
