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
public class A0Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int wordLength = 0;
        int wordLengthH = 0;
        System.out.println("Enter 10 words to have their length calculated, and average length calculated");
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            System.out.println("Please enter a new word to find its length");
            String word = input.nextLine();
            for (int j = 0; j < word.length(); j++) {
                wordLength++;
                wordLengthH++;   
            }
            System.out.println("This word is "+wordLength+" characters long");
            wordLength = 0;
        }
        System.out.println("your average word length is " +wordLengthH/10.0+" characters");
    }
}
