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
public class A0Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner
        Scanner input = new Scanner(System.in);
        //take in cost of all items
        System.out.println("How much do tickets cost in dollars?");
        double ticketPrice = input.nextDouble();
        System.out.println("Please enter the cost of the food");
        double foodCost = input.nextDouble();
        System.out.println("Please enter the cost of the DJ");
        double DJCost = input.nextDouble();
        System.out.println("Please enter the cost of renting the hall");
        double hallCost = input.nextDouble();
        System.out.println("Please enter the cost of the decorations");
        double decorationCost = input.nextDouble();
        System.out.println("Please enter the cost of the wait staff");
        double wsCost = input.nextDouble();
        System.out.println("Please enter any miscallaneous costs");
        double miscCost = input.nextDouble();
        double totalCost = foodCost + DJCost + hallCost + decorationCost + wsCost + miscCost;
        double numTicket = Math.ceil(totalCost / ticketPrice);
        System.out.println("The total price for the ball is " + totalCost);
        System.out.println("You will need to sell " + numTicket + " tickets to break even");
    }
}
