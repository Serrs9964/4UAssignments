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
public class A0Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create Scanner
        Scanner input = new Scanner(System.in);
        //Get numbers
        System.out.println("Please enter 1 of 3 numbers");
        double numOne = input.nextDouble();
        System.out.println("Please enter 2 of 3 numbers");
        double numTwo = input.nextDouble();
        System.out.println("Please enter 3 of 3 numbers");
        double numThree = input.nextDouble();
        double product = numOne * numTwo * numThree;
        System.out.println("The product of your three numbers is " + product);
        double power = Math.pow(product, 2);
        System.out.println("The product to the power of 2 is " + power);
        double Sqrt = Math.sqrt(product);
        System.out.println("The Square root of the product is " + Sqrt);

    }
}
