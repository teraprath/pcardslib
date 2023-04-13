package dev.teraprath.playingcards.deck;

import dev.teraprath.playingcards.card.Card;
import dev.teraprath.playingcards.card.Rank;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DeckCalculator {

    private final Deck deck;
    private final HashMap<Rank, Integer> values;

    public DeckCalculator(Deck deck) {
        this.deck = deck;
        this.values = new HashMap<>();
        deck.getCards().forEach(card -> {
            switch (card.getRank()) {
                case ACE -> this.values.put(card.getRank(), 1);
                case JACK, KING, QUEEN -> this.values.put(card.getRank(), 10);
                default -> this.values.put(card.getRank(), Integer.parseInt(card.getRank().getInitial()));
            }
        });
    }

    public DeckCalculator setValues(int ace, int jack, int queen, int king) {
        deck.getCards().forEach(card -> {
            switch (card.getRank()) {
                case ACE -> this.values.put(card.getRank(), ace);
                case JACK -> this.values.put(card.getRank(), jack);
                case QUEEN -> this.values.put(card.getRank(), queen);
                case KING -> this.values.put(card.getRank(), king);
                default -> this.values.put(card.getRank(), Integer.parseInt(card.getRank().getInitial()));
            }
        });
        return this;
    }

    public int getTotal() {
        AtomicInteger i = new AtomicInteger();
        deck.getCards().forEach(card -> {
            i.addAndGet(1);
        });
        return i.get();
    }

    public int getTotalCourts() {
        AtomicInteger i = new AtomicInteger();
        deck.getCards().forEach(card -> {
            i.addAndGet(card.isCourt() ? 1 : 0);
        });
        return i.get();
    }

    public int getTotalNumerals() {
        AtomicInteger i = new AtomicInteger();
        deck.getCards().forEach(card -> {
            i.addAndGet(card.isNumeral() ? 1 : 0);
        });
        return i.get();
    }

    public int getCardValues() {
        AtomicInteger i = new AtomicInteger();
        this.values.forEach((rank, value) -> {
            i.addAndGet(value);
        });
        return i.get();
    }

    public int getValue(Card card) {
        return this.values.get(card.getRank());
    }

    public int getValue(Rank rank) {
        return this.values.get(rank);
    }

}
