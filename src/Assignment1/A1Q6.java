/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author serrs9964
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A1Q6 call = new A1Q6();
        int[] array = call.groupSum[2,4,8];
        int index =0;
        int target = 10;
    }
    
    public boolean groupSum(int index, int[] array, int target) {
        //base case
        if (index == 0 && target == 0) {
            return false;
        } else {
            return true;
        }
    }
}
