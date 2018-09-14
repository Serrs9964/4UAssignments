/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author serrs9964
 */
public class A1Q3skip {

    /**
     * @param args the command line arguments
     */
    public int sumDigits(int number) {
        //base case
        if (number == 0) {
            return 0;
        }
        int length = 0;
        long temp = 1;
        int counter = 0;
        
        while (temp <= number && length >= counter) {
            length++;
            counter++;
            temp *= 10;
            
        }
        if (length > 0) {
            
            return sumDigits(length - 1);   
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        A1Q3skip test = new A1Q3skip();
        int number = test.sumDigits(125);
        System.out.println(number);

    }
}


