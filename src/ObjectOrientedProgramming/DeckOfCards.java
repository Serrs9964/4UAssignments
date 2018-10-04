/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOrientedProgramming;

/**
 *
 * @author serrs9964
 */
public class DeckOfCards {

    private Card[] cards;
    private int numCards;

    public DeckOfCards() {
        numCards = 0;
        cards = new Card[52];
        int i = 0;
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                //create a card
                Card c = new Card(rank, suit);
                //add a card to deck
                cards[i] = c;
                //move counters
                i++;
                numCards++;
            }
        }

    }

    //knute shuffle or Fisher-Yates Shuffle
    public void shuffle() {
        for (int i = 0; i < this.numCards; i++) {
            int spot = (int) (Math.random() * ((this.numCards - 1) - i + 1) + i);
            Card temp = cards[i];
            cards[i] = cards[spot];
            cards[spot] = temp;


        }
    }

    public Card dealCard() {
        Card c = cards[this.numCards - 1] = null;
        this.numCards--;
        return c;
    }
    public int getNumCards(){
        return this.numCards;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
