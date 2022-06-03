package org.example;

public class Verse {
    public String verseConstructor(int numberOfBeer) {

        if (numberOfBeer == 0) {
            return "No more bottles of beer on the wall, no" +
                    " more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.";
        } else if (numberOfBeer == 1) {
            return numberOfBeer + " bottle of beer on the wall, " + numberOfBeer + " bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
        } else if (numberOfBeer == 2) {
            return numberOfBeer + " bottles of beer on the wall, " + numberOfBeer + " bottles of beer.\n" +
                    "Take one down and pass it around, " + (numberOfBeer - 1) + " bottle of beer on the wall.\n\n";
        } else {
            return numberOfBeer + " bottles of beer on the wall, " + numberOfBeer + " bottles of beer.\n" +
                    "Take one down and pass it around, " + (numberOfBeer - 1) + " bottles of beer on the wall.\n\n";
        }
    }
}
