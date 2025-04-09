/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * @author Yash
 */
public class BlackjackPlayer extends Player {
    private ArrayList<BlackjackCard> hand;
    private int score;

    public BlackjackPlayer(String name) {
        super(name);
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public void addCard(BlackjackCard card) {
        hand.add(card);
        score += card.getValue();
    }

    public int getScore() {
        return score;
    }

    public void showHand() {
        System.out.println(getName() + "'s Hand: " + hand + " (Score: " + score + ")");
    }

    @Override
    public void play() {
        // Player logic handled in game class
    }
}
