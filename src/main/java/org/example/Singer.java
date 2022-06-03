package org.example;

public class Singer {
    int numberOfBeers = 99;
    StringBuilder bottleOfBeers = new StringBuilder();
    public String singTheSong() {
        while (numberOfBeers >= 0) {
            Verse bottleOfBeersVerses = new Verse();

            bottleOfBeers.append(bottleOfBeersVerses.verseConstructor(numberOfBeers));

            numberOfBeers--;
        }

        return bottleOfBeers.toString();
    }
}

