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
public class subtotal {
    subtotal(){
    int subtotal = 50;
    Scanner cr = new Scanner(System.in);
        System.out.println("Enter your percentage");
     double per = cr.nextDouble();
     double subpercentage = ((subtotal*per)/100);
    double total = (subtotal +subpercentage);
        System.out.println("The total is "+total);
    }
    
}
