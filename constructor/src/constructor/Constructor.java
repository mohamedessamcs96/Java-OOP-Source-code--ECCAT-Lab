/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author hero tech
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car mercedes=new Car(4,"red","Manual",2010,300);
       /* 
        mercedes.color="red";
        mercedes.doors=4;
        mercedes.type="Manual";
        mercedes.productionhdate=2010;
        mercedes.speed=300;
        */
        Car bmw=new Car(2,"black","Manual",2018,350);
        /*
        bmw.color="red";
        bmw.doors=4;
        bmw.type="Manual";
        bmw.productionhdate=2010;
        bmw.speed=300;
        */
    
        System.out.println(mercedes.age(mercedes.getDate()));
    
    }
    
}
