/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionPractice;

/**
 *
 * @author serrs9964
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A1Q6 test = new A1Q6();
        int[] array = {2,4,8};
        int sum = test.groupSum(0,array,6);
        System.out.println(sum);
    }
    
    public int groupSum(int index, int[] array, int target) {
        //base case
        
        if (index >= array.length) {
            System.out.println("if#1");
            return 0;
        } 
        int i=0;
        int j=1;
        if(array[i]+array[j]==target){
            i++;j++;
            return groupSum(index+1,array,target-1);   
        }else{
            i++;j++;
            return groupSum(index+1,array,target);
        }
           
        //return the sum
       
            
       
    }
}
