package org.example;

public class Singer {
    final SongCreator songCreator;
    public Singer(SongCreator songCreator) {
        this.songCreator = songCreator;
    }

    public String sing() {
        return songCreator.bottleOfBeer();
    }
}

