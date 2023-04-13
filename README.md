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
    <artifactId>playing-cards</artifactId>
    <version>1.2-SNAPSHOT</version>
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
    implementation 'com.github.teraprath:playing-cards:1.2-SNAPSHOT'
}
````
****
Example Code
````java

// Initialize new deck (auto-shuffled)
Deck deck = new Deck(DeckSize.DEFAULT);

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
