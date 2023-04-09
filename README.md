[![](https://jitpack.io/v/teraprath/pcardslib.svg)](https://jitpack.io/#teraprath/pcardslib)

****

Maven

````xml

<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
````

````xml

<dependency>
    <groupId>com.github.teraprath</groupId>
    <artifactId>pcardslib</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
````

****

Gradle

````groovy
repositories {
    maven { url 'https://jitpack.io' }
}
````
````
dependencies {
    implementation 'com.github.teraprath:pcardslib:1.0-SNAPSHOT'
}
````
****
Example Code
````java
public class Test {

    // Initialize new deck (auto-shuffled)
    final static Deck deck = new Deck(DeckSize.DEFAULT);

    public static void main(String[] args) {

        // Print cards
        deck.getCards().forEach(card -> {
            System.out.println("[" + card.getRank().getString() + card.getSuit().getString() + "]");
        });

    }

}
````
Output
````
...
[3♦]
[J♠]
[5♣]
[7♦]
[9♠]
[6♥]
````
