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
public class distance {
    distance(){
    Scanner cr = new Scanner(System.in);
        System.out.println("Enter x1 and y1 value:");
        double x1 = cr.nextDouble();
        double y1 = cr.nextDouble();
        System.out.println("Ener x2 and y2 value:");
        int x2 = cr.nextInt();
        int y2=cr.nextInt();
        System.out.println(Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1),0.5));    
    
    }
}
