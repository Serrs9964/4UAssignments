/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import Assignment1.A1Q6;

/**
 *
 * @author serrs9964
 */
public class PieEater {

    /**
     * @param args the command line arguments
     */
    public int mostSugar(int index, int[] pies){
        if (index >= pies.length){
            return 0;
        }
        //to eat pie or not to eat
        int eatPie = pies[index] + mostSugar(index+2,pies);
        int leavePie = mostSugar(index +1,pies);
        
        //which pie was better
        if(eatPie>leavePie){
            return eatPie;
        }else{
            return leavePie;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        pieEater test = new pieEater();
       int[]pies={34,12,76,34,125,87,34};
       int best = mostSugar(0,pies);
        System.out.println("Most sugar: "+best);
    }
}
