package dev.teraprath.pcardslib.card;

public class Card {

    private final Rank rank;
    private  final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public boolean isCourt() {
        return switch (this.rank) {
            case KING, JACK, QUEEN -> true;
            default -> false;
        };
    }

}
