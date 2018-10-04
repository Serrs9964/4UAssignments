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
    
    
    
    
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
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
    
    @Override
    public String toString(){
        String card = "";
        
        //state the rank of the card (Ace - King)
        if(this.rank>=2 && this.rank <= 10){
            card = card + this.rank + " of ";
        }else if(this.rank == ACE){
            card = card + "Ace of ";
        }else if(this.rank == JACK){
            card = card + "Jack of ";
        }else if(this.rank == QUEEN){
            card = card + "QUEEN of ";
        }else if(this.rank == KING){
            card = card + "KING of ";
        }else{
            card = card + "Error Joker ";
        }
        
        //now add the suit (Spade, Club, Heart, Diamond)
        if(this.suit == SPADE){
            card = card + "Spades";
        }else if(this.suit == CLUB){
            card = card + "Clubs";
        }else if(this.suit == DIAMOND){
            card = card + "Diamonds";
        }else if(this.suit == HEART){
            card = card + "Hearts";
        }else{
            card = card + "Error Joker";
        }
        return card;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Card c1 = new Card(5,Card.DIAMOND);
        Card c2 = new Card(10,Card.SPADE);
        Card c3 = new Card(Card.ACE, Card.HEART);
        
        c1.flip();
        System.out.println("c1 is visible: " + c1.isVisible);
        System.out.println("c2 is visible: " + c2.isVisible);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
