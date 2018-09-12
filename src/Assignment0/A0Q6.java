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
public class A0Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 50 and 100 to stop at");
        int goalNum = input.nextInt();
        int countDown = 100;
        while (goalNum < countDown) {
            System.out.println(countDown);
            countDown = countDown - 5;
        }
    }
}
