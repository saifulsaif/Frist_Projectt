
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
public class tempaerature {
    
    
    tempaerature()
    {
    Scanner cr = new Scanner(System.in);
        System.out.println("Enter amount of water");
    double water= cr.nextDouble();
        System.out.println("Enter final temperature:");
        double temp=cr.nextDouble();
        System.out.println("Enter initial temperature:");
        
        double tempa = cr.nextDouble();
        double q;
        q=water*(tempa-temp)*4184;
        System.out.println  (q);
    
    }
    
}
