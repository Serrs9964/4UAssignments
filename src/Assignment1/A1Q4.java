/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author serrs9964
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A1Q4 test = new A1Q4();
        int n = test.hailStone(3);
        System.out.println(n);


    }

    public int hailStone(int n) {
        //base case
        if (n <= 1) {
            return 1;
        }
        // if n is odd
        
        if (n % 2 == 1 /*&& n != 1*/) {
            System.out.println(n);
            return hailStone(3*n+1);
            
            //if n is even
        } else {
            System.out.println(n);
            return hailStone(n/2);
        }
        
    
    }
}
