/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment0;

import java.util.Scanner;

/**
 *
 * @author serrs9964
 */
public class A0Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the principal amount in your account");
        double principal = input.nextDouble();
        System.out.println("Please enter your interest rate as a decimal");
        double intRate = input.nextDouble();
        double flatGrowth = principal*intRate;
        while(principal<(principal*2)){
            
        }
    }
}
