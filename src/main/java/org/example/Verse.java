package org.example;

import java.util.Objects;

public class Verse {
    public String verseConstructor(String positionOfVerse, int numberOfBeer) {

        if (Objects.equals(positionOfVerse, "dernier")) {
            return "No more bottles of beer on the wall, no" +
                    " more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.";

        } else if (Objects.equals(positionOfVerse, "avant-dernier")) {
            return numberOfBeer + " bottle of beer on the wall, " + numberOfBeer + " bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.\n\n";

        } else if (Objects.equals(positionOfVerse, "avant-avant-dernier")) {
            return numberOfBeer + " bottles of beer on the wall, " + numberOfBeer + " bottles of beer.\n" +
                    "Take one down and pass it around, " + (numberOfBeer - 1) + " bottle of beer on the wall.\n\n";

        } else {
            return numberOfBeer + " bottles of beer on the wall, " + numberOfBeer + " bottles of beer.\n" +
                    "Take one down and pass it around, " + (numberOfBeer - 1) + " bottles of beer on the wall.\n\n";
        }
    }
}
