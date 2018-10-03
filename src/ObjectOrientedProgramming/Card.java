/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOrientedProgramming;

import java.awt.Color;

/**
 *
 * @author serrs9964
 */
public class Card {

    //instance(class)  variables(fields) 
    private int suit;
    private int rank;
    private Color colour;
    private boolean isVisible;
    //class constants
    public static final int SPADE = 0;
    public static final int CLUB = 1;
    public static final int HEART = 2;
    public static final int DIAMOND = 3;

    //constructor for card
    //initialize variables
    public Card(int rank, int suit/*, Color colour, boolean isVisible*/) {
        //use "this." to call variables from public class
        this.suit = suit;
        this.rank = rank;
        this.isVisible = false;
        if (suit == CLUB || suit == SPADE) {
            this.colour = Color.BLACK;
        } else {
            this.colour = Color.RED;
        }
    }

    //suit accessor(getter) methods
    public int getSuit(){
        return this.suit;
    }
    
    public int getRank(){
        return this.rank;
    }
    
    public Color getColour(){
        return this.colour;
    }
    
    public boolean isVisble(){
        return this.isVisible;
    }
    
    //isVisible mutator(setter) method
    public void flip(){
        //toggle trick for booleans
        this.isVisible = !this.isVisible;
                
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Card c1 = new Card(5,Card.DIAMOND);
        Card c2 = new Card(10,Card.SPADE);
        
        c1.flip();
        System.out.println("c1 is visible: " + c1.isVisible);
        System.out.println("c2 is visible: " + c2.isVisible);
    }
}
