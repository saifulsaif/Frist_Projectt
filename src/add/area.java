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
public class area {
    area()
    {
    double area;
    Scanner cr = new Scanner(System.in);
    area=cr.nextDouble();
     
    double value =0;
    value = (3*Math.pow(3,0.5)/2)*area*area;
        System.out.println("The area is :"+value);
    }

    
}
