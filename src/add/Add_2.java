/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class Add_2 {
   
     
    Add_2(){
    
    double celcius = 43 ;
    System.out.println(9.0/5*celcius+32);
        
    
    
    }
    public void add_2_2(){
    
    double radius = 5.5;
    double length = 12;  
    double area;
    double valume;
    area = (radius*radius*3.1416);
    valume = area * length;
    System.out.println("The area is"+area);
    System.out.println("The valume is "+valume);
    }
    
    public void add_2_3(){
    double pound =55.5;
    System.out.println("The kilogram "+ pound*0.454);
     double feet = 16;
    System.out.println("The meter is "+feet*0.305);
        
    }
   public void add_2_7(){
   Scanner cn = new Scanner(System.in);  
   System.out.println("Enter your min");  
   double min=cn.nextDouble(); 
   double hour = (min/60);
   double day =(hour/24);
   double month = (day/30);
   double year = (month/12);
   System.out.println("The year is"+year);
    }
    
    
}
