/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionPractice;

/**
 *
 * @author serrs9964
 */
public class A1Q1 {

    public int bunnyEars(int ears) {
        //base case
        if (ears == 0) {
            return 0;
        }

        //recursive case
        if (ears % 2 == 1) {
            return 2 + bunnyEars(ears - 1);
        } else {
            return 3 + bunnyEars(ears - 1);
        }

    }

    public static void main(String[] args) {
        A1Q1 test = new A1Q1();
        int ears = test.bunnyEars(6);
        System.out.println("there are " + ears + " bunny ears");
    }
}
