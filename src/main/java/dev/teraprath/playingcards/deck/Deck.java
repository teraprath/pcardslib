package dev.teraprath.playingcards.deck;

import dev.teraprath.playingcards.card.Card;
import dev.teraprath.playingcards.card.Rank;
import dev.teraprath.playingcards.card.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private final ArrayList<Card> cards;

    public Deck(DeckSize deckSize) {
        this.cards = new ArrayList<>();
        switch (deckSize.getAmount()) {
            case 52 -> {
                for (Suit suit : Suit.values()) {
                    for (Rank rank : Rank.values()) {
                        this.cards.add(new Card(rank, suit));
                    }
                }
                shuffle();
            }
            case 32 -> {
                for (Suit suit : Suit.values()) {
                    for (Rank rank : Rank.values()) {
                        if (!((Integer.parseInt(rank.getInitial()) > 1) && (Integer.parseInt(rank.getInitial()) < 7))) {
                            this.cards.add(new Card(rank, suit));
                        }
                    }
                }
                shuffle();
            }
            default -> {
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards, new Random());
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public ArrayList<Card> getCardsByRank(Rank rank) {
        ArrayList<Card> filter = new ArrayList<>();
        cards.forEach(card -> {
            if (card.getRank() == rank) {
                filter.add(card);
            }
        });
        return filter;
    }

    public ArrayList<Card> getCardsBySuit(Suit suit) {
        ArrayList<Card> filter = new ArrayList<>();
        cards.forEach(card -> {
            if (card.getSuit() == suit) {
                filter.add(card);
            }
        });
        return filter;
    }

    public int getSize() {
        return this.cards.size();
    }

}
