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
public class Aroplane {
    Aroplane()
    {
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter value of s and" );
        double v = cr.nextDouble();
        double a = cr.nextDouble();
        double length=(v*v)/(2*a);
        System.out.println("The value is "+length);
        
    }
    
    
}
