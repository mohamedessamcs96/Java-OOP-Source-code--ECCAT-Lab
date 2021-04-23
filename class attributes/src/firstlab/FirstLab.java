/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstlab;





/**
 *
 * @author hero tech
 */
public class FirstLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Life before OOP{
        
        String colorBMW="RED";
        int DoorBMW=4;
        String colormercedes="RED";
        int Doormercedes=4;
        String colorhunday="RED";
        int Doorhunday=4;
        
        //Life After OOP
       
        Car mercedes=new Car();
        Car bmw=new Car();
        Car Hunday=new Car();
        
        
        mercedes.color="Black";
        mercedes.doors=4;
        
        
        bmw.color="white";
        bmw.doors=2;
        
        
        Hunday.color="Red";
        Hunday.doors=4;
        
        System.out.println("the number of doors is "+Hunday.doors+"\n"+"The color is "+Hunday.color);
    }
    
}
