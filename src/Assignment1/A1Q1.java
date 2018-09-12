/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author serrs9964
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        int n = test.bunnyEars(1);
        test.bunnyEars(1);
        A1Q1 test = new A1Q1();
    }
    public int bunnyEars(int n){
        //base case
        if(n==0){
            return 0;
        }
        if((n%2)>0){
            n=n+2;
        }if((n%2)==0){
            n=n+3;
        }
        return n;
            
        
    }

}
