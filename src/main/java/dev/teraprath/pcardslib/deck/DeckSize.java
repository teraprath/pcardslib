package dev.teraprath.pcardslib.deck;

public enum DeckSize {

    BLANK(0),
    DEFAULT(52),
    STRIPPED(32);

    private final int amount;

    DeckSize(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
