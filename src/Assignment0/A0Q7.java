/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment0;

import java.util.Scanner;

/**
 *
 * @author serrs9964
 */
public class A0Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double worldPop = 6e9;
        double worldPop2 = 6e9;
        double currentYear = 1999;
        double percentGrowth = 0.014;
        double yearCount = 0;
        double finalPop = 1e10;
        double growthRate = percentGrowth * worldPop;
        System.out.println(growthRate);
        while (worldPop2 < finalPop) {
            yearCount = yearCount + 1;
            worldPop2 = worldPop2 + growthRate;
            System.out.println(worldPop2);
        }
        currentYear = currentYear + yearCount;
        System.out.println("The year will be " + currentYear + " when the population hits 10000000000");
    }
}
