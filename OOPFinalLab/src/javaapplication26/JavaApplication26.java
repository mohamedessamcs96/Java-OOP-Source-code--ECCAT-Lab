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
        
        /*
            Life After constructor and before
        */

        Car bmw=new Car("Black",2010,"Manual",300);
        bmw.setDoors(7);
        System.out.println(bmw.getDoors());
        
        
        /*
        bmw.birthdate=2000;
        bmw.color="Black";
        bmw.doors=4;
        bmw.type="Manual";
        bmw.speed=300;
         */
        
        
        /*
        mercedes.birthdate=2000;
        mercedes.color="Black";
        mercedes.doors=4;
        mercedes.type="Manual";
        mercedes.speed=300;
        */
       
  
        Van mercedes=new Van();
        mercedes.color="White";
       
        
        
        Bus mazda=new Bus();
        
        
        
        MicroBus suzuki=new MicroBus();
        suzuki.chairs=14;
        
        
        System.out.println(mercedes.color);
        System.out.println("The car age is :"+bmw.getAge(bmw.getBirthdate()));
        
    }
    
}
