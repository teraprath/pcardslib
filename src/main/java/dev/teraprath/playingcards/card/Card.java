package dev.teraprath.playingcards.card;

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

    public boolean isNumeral() {
        return switch (this.rank) {
            case KING, JACK, QUEEN -> false;
            default -> true;
        };
    }

    public boolean isRed() {
        return switch (this.suit) {
            case CLUBS, SPADES -> false;
            case DIAMONDS, HEARTS -> true;
        };
    }

    public  boolean isBlack() {
        return switch (this.suit) {
            case CLUBS, SPADES -> true;
            case DIAMONDS, HEARTS -> false;
        };
    }

    public String getName() {
        return this.suit.getIcon() + this.rank.getInitial();
    }

}
