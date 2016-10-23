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
public class remainder {
    remainder(){
      Scanner cr = new Scanner(System.in);
        System.out.println("Enter your value ");
        int value = cr.nextInt();
        int remainder=(value%10);
        int value_div =(value/10);
        int remainderr;
        remainderr=(value_div%10);
        int value_divv=(value_div/10);
        int remainderrr=(value_divv%10);
        System.out.println(remainder+remainderr+remainderrr);
      
    }
    
}
