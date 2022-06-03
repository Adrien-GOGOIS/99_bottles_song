package org.example;

public class SongCreator {

    String bottleOfBeer;
    int numberOfBottles = 99;
    StringBuilder lyrics = new StringBuilder();
    public String bottleOfBeer() {

        /*while (numberOfBottles >= 0) {

            String bottle = numberOfBottles == 1 ? ("bottle") : ("bottles");

            String firstLine = numberOfBottles + " " + bottle + " of beer on the wall, " + numberOfBottles + " " + bottle + " of beer.\n";
            String secondLine = "Take one down and pass it around, " + (numberOfBottles) + " " + bottle + " of beer on the wall.\n\n";

            if (numberOfBottles == 99) {
                lyrics.append(firstLine);

            } else if (numberOfBottles == 0) {
                lyrics
                        .append("Take it down and pass it around, no more bottles of beer on the wall.\n\n")
                        .append("No more bottles of beer on the wall, no more bottles of beer.\n" +
                                "Go to the store and buy some more, 99 bottles of beer on the wall.");

            } else {
                lyrics
                        .append(secondLine)
                        .append(firstLine);
            }

            numberOfBottles--;
        }

        bottleOfBeer = lyrics.toString();
        return bottleOfBeer;*/

        while (numberOfBottles >= 0) {

            String bottle = numberOfBottles == 1 ? ("bottle") : ("bottles");

            String firstLine = numberOfBottles + " " + bottle + " of beer on the wall, " + numberOfBottles + " " + bottle + " of beer.\n";
            String secondLine = "Take one down and pass it around, " + (numberOfBottles) + " " + bottle + " of beer on the wall.\n\n";

            if (numberOfBottles == 99) {
                lyrics.append(firstLine);

            } else if (numberOfBottles == 0) {
                lyrics
                        .append(secondLine.replace("0", "no more").replace("one", "it"))
                        .append(firstLine.replaceFirst("0", "No more").replace("0", "no more"))
                        .append("Go to the store and buy some more, 99 bottles of beer on the wall.");

            } else {
                lyrics
                        .append(secondLine)
                        .append(firstLine);
            }

            numberOfBottles--;
        }

        bottleOfBeer = lyrics.toString();
        return bottleOfBeer;
    }
}
