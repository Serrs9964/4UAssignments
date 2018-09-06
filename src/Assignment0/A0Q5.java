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
public class A0Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //take in cost of all items
        System.out.println("Please enter the side length to make a square");
        int starNum = input.nextInt();
        for (int a = 0; a < starNum; a++) {
            System.out.println("");
            for (int i = 0; i < starNum; i++) {
                System.out.print("*");
            }
        }
    }
}