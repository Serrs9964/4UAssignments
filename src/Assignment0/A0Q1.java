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
public class A0Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        //Tell user what to do
        System.out.println("please enter your name");

        //Get name and store in variable
        String name = input.nextLine();

        System.out.println("Hello " + name);
    }
}
