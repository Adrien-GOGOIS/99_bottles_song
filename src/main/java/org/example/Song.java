package org.example;

public class Song {
    int numberOfBeers = 99;
    StringBuilder bottleOfBeers = new StringBuilder();
    public String sing() {
        while (numberOfBeers >= 0) {
            Verse bottleOfBeersVerses = new Verse();

            if (numberOfBeers == 0) {
                bottleOfBeers.append(bottleOfBeersVerses.verseConstructor("dernier", numberOfBeers));
            } else if (numberOfBeers == 1) {
                bottleOfBeers.append(bottleOfBeersVerses.verseConstructor("avant-dernier", numberOfBeers));
            } else if (numberOfBeers == 2) {
                bottleOfBeers.append(bottleOfBeersVerses.verseConstructor("avant-avant-dernier", numberOfBeers));
            } else {
                bottleOfBeers.append(bottleOfBeersVerses.verseConstructor("normal", numberOfBeers));
            }

            numberOfBeers--;
        }

        return bottleOfBeers.toString();


    }
}
