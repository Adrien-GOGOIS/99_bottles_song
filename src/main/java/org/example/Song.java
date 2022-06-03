package org.example;

public class Song {
    int numberOfBeers = 99;
    StringBuilder bottleOfBeers = new StringBuilder();
    public String sing() {
        while (numberOfBeers >= 0) {
            Verse bottleOfBeersVerses = new Verse();

            bottleOfBeers.append(bottleOfBeersVerses.verseConstructor(numberOfBeers));

            numberOfBeers--;
        }

        return bottleOfBeers.toString();
    }
}
