package Studios.Disc;

import Studios.Disc.CD;
import Studios.Disc.DVD;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        List<String> songs = new ArrayList<>();

        songs.add("Waterloo");
        songs.add("Yesterday");
        songs.add("Monday, Monday");
        songs.add("Bohemian Rhapsody");
        songs.add("Thriller");

        List<String> movies = new ArrayList<>();

        movies.add("Play");
        movies.add("Scene Selection");
        movies.add("Language");
        movies.add("Settings");
        movies.add("BehindTheScenes");

        CD myCd = new CD("Def Leppard Album", 2.2, 5.0, 2.8, (ArrayList<String>) songs, "CD");
        DVD myDvd = new DVD("Lord Of The Rings", 2.2, 5.0, 2.8, (ArrayList<String>) movies, "DVD");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myDvd.spinDisc();
        myCd.read(); //Our Read doesn't print what we want. Fix it!
        myDvd.read(); //Our Read doesn't print what we want. Fix it!
        myCd.write( 200, 500);
        myDvd.write( 400, 500);
    }
}
