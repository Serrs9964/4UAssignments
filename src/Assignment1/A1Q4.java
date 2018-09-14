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
        int n = test.hailStone(5);
        
    }
    public void hailStone(int n){
        if (n==0){
            return;
        }if(n != 1){
            if(n%2==1){
                n=3*n+1;
                System.out.println(n);
            }else{
                n=n/2;
                System.out.println(n);
            }
        }
    }
}
