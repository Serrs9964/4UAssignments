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
        int counter = 0;
        //double flatGrowth = principal*intRate;
        double principal2 = principal * 2;
        while (principal < principal2) {
            principal = principal * (intRate + 1);
        }
        System.out.println("you're principal will be double at $" + principal);
        while (principal < 1000000) {
            principal = principal * (intRate + 1);
            counter++;

        }
        System.out.println("you will have 1 million dollars in " + counter + " years");
    }
}