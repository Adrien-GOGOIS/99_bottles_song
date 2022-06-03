package org.example;

public class Main {
    public static void main(String[] args) {

        SongCreator bottleOfBeer = new SongCreator();
        Singer bob = new Singer(bottleOfBeer);
    }
}