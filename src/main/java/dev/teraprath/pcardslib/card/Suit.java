package dev.teraprath.pcardslib.card;

public enum Suit {

    CLUBS("♣"),
    SPADES("♠"),
    HEARTS("♥"),
    DIAMONDS("♦");

    private final String string;

    Suit(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }

}
