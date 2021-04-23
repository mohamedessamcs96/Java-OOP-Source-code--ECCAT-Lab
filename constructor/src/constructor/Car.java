/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

import java.util.Date;

/**
 *
 * @author hero tech
 */
public class Car {
    
    int doors;
    String color;
    String type;
    int productionhdate;
    double speed;
    
    public Car(int d,String c,String t,int p,double s)
    {
        doors=d;
        color=c;
        type=t;
        productionhdate= p;
        speed=s;
        
    }
    
    
    
    Date d=new Date();
    int year=d.getYear()+1900;
    
    int age(int productionhdate){
    
    return year-productionhdate;
    }
    
    int getDoor()
    {
        return doors;
    }
    
    String getColor()
    {
        return color;
    }
    String getType()
    {
        return type;
    }

    int getDate()
    {
        return productionhdate;
    }
    
    double getSpeed()
    {
        return speed;
    }
}
