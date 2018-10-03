/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingMethods;

/**
 *
 * @author serrs9964
 */
public class SortingPractice {
    //specify array, and 2 swap positions

    public void swap(int[] n, int pos1, int pos2) {
        int temp = n[pos1];
        n[pos1] = n[pos2];
        n[pos2] = temp;
    }
    public void bubbleSort(int[] n) {
        //keep track of if we have swapped
        boolean swap = true;
        //keep going if we swap
        while (swap) {
            //assume we make no swaps 
            swap = false;
            //go down the list looking for swaps
            for (int i = 0; i < n.length - 1; i++) {
                //do we have to swap?
                if (n[i] > n[i + 1]) {
                    swap(n, i, i + 1);
                    //let the algorithm know we swapped
                    swap = true;
                }
            }
        }
    }
    public void selectionSort(int[] n) {
        //go through the list 
        for (int i = 0; i < n.length - 1; i++) {
            //start tracking minimum spot
            int min = i;
            //go through looking for smaller spot
            for (int j = i + 1; j < n.length; j++) {
                //did you find smaller?
                if (n[min] > n[j]) {
                    //track that position instead if smaller found
                    min = j;
                }
            }
            //put minimun in position
            swap(n, i, min);
        }
    }
    public void insertionSort(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            int j = i + 1;
            //while n is out of position
            while (j > 0 && n[j] < n[j - 1]) {
                swap(n, j, j - 1);
                //move j down
                j--;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array of 10~ nums to sort
        int[] nums = new int[10];
        //randomly assign values
        for (int i = 0; i < nums.length; i++) {
            //assign a random nymber between 0 and 100
            nums[i] = (int) (Math.random() * 101);
        }
        SortingPractice test = new SortingPractice();
        System.out.println("Before: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        //test.bubbleSort(nums);
        test.selectionSort(nums);
        //test.insertionSort(nums);
        System.out.println(" ");
        System.out.println("After: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
}
