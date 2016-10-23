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
public class Avarage {
    Avarage(){
    
        Scanner cr = new Scanner(System.in);
        double v0 = cr.nextDouble();
        double v1 = cr.nextDouble();
        double t = cr.nextDouble();
        double a;
        a=(v1-v0)/t;
        System.out.println("The avarage is :"+a);
    
    }
    
}
