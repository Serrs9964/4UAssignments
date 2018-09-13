/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.util.Scanner;

/**
 *
 * @author serrs9964
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner for user input
        Scanner input = new Scanner(System.in);

        //Tell user what to do
        System.out.println("please enter your name");
        System.out.println(1%2);
        //Get name and store in variable
        String name = input.nextLine();

        System.out.println("Hello " + name);

        //Get user birthyear
        System.out.println("What year were you born in?");
        int birthYear = input.nextInt();
        int age = 2018 - birthYear;
        System.out.println("You are " + age + " years old.");

        if (age <= 0) {
            System.out.println("Your age is invalid");
        } else if (age > 0 && age < 5) {
            System.out.println("How are you doing this with your tiny little baby hands?");
        } else {
            System.out.println("Good Job Living!");
        }
        //count up to a number
        System.out.println("Please enter a number between 1 and 10");
        int num = input.nextInt();
        int count = 0;
        while (count < num) {
            count = count + 1;
            //count++;
            //count += 1;
            System.out.println(count);
        }
        /*do {
         count = count + 1;
         System.out.println(count);
         } while (condition);*/

//for(int i=1; i <= num; i++){
//    System.out.println(i);
//}
//array of random integers
        int[] randomNums = new int[10];
//generate random numbers
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (Math.random() * 100 + 1);
        }
//Calculate average
        int sum = 0;
        for (int i = 0; i < randomNums.length; i++) {
            sum = sum + randomNums[i];
        }
        int average = sum / randomNums.length;
        System.out.println("The Average of 10 random integers between 1 and 100 is " + average);



    }
}
