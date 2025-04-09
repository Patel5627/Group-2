/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Yash
 */
public class GroupOfCards {
    protected ArrayList<Card> cards;
    private int size;

    public GroupOfCards(int size) {
        this.size = size;
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        if (cards != null && !cards.isEmpty()) {
            Collections.shuffle(cards);
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}