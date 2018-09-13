/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author serrs9964
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public int triRows (int blocks){
        //base case
        if(blocks == 0){
            return 0;
            
        }else{
            return 1+triRows (blocks-1);
            
        }
     
    }
    public static void main(String[] args) {
        // TODO code application logic here
         A1Q2 test = new A1Q2();
        int blocks = test.triRows(2);
        System.out.println("there are " + blocks +" blocks");
    }
}
