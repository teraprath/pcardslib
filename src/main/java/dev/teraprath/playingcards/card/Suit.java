package dev.teraprath.playingcards.card;

public enum Suit {

    CLUBS("♣"),
    SPADES("♠"),
    HEARTS("♥"),
    DIAMONDS("♦");

    private final String icon;

    Suit(String string) {
        this.icon = string;
    }

    public String getIcon() {
        return this.icon;
    }

}
