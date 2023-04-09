package dev.teraprath.pcardslib.deck;

import dev.teraprath.pcardslib.card.Card;
import dev.teraprath.pcardslib.card.Rank;
import dev.teraprath.pcardslib.card.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private final ArrayList<Card> cards;

    public Deck(DeckSize deckSize) {
        this.cards = new ArrayList<>();
        switch (deckSize.getAmount()) {
            case 52:
                for (Suit suit : Suit.values()) {
                    for (Rank rank : Rank.values()) {
                        this.cards.add(new Card(rank, suit));
                    }
                }
                shuffle();
                break;
            case 32:
                for (Suit suit : Suit.values()) {
                    for (Rank rank : Rank.values()) {
                        if (!((rank.getAsInteger() > 1) && (rank.getAsInteger() < 7))) {
                            this.cards.add(new Card(rank, suit));
                        }
                    }
                }
                shuffle();
                break;
            default:
                break;
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
