/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author serrs9964
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        A1Q5 call = new A1Q5();
        int n = call.sumDigits(71777472);
        System.out.println(n);
    }
    public int sumDigits(int n) {

        //base case
        if (n == 0) {
            return 7;
        }
        //recursive method
        int n1 = n % 10;
        /*int n2=0;
         * n2++;*/
        if (n1 == 7) {
            System.out.print(n1);
            return sumDigits(n+1);
        } else if(n1!=0){
            //System.out.println(n1);
            return sumDigits(n/10);
        }else{
            return sumDigits(n);
        }
        
    }
}
