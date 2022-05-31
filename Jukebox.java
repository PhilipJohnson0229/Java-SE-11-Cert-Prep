package com.philipJohnson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Jukebox {

    private static ArrayList<Album> albumList = new ArrayList<Album>();

    public static void main(String[] args)
    {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addNewSong("Stormbringer", 4.6);
        album.addNewSong("Love don't mean a thing", 4.22);
        album.addNewSong("Holy man", 4.3);
        album.addNewSong("Hold on", 5.6);
        album.addNewSong("Lady double dealer", 3.21);
        album.addNewSong("You can't do it right", 6.23);
        album.addNewSong("High ball shooter", 4.27);
        album.addNewSong("The gypsy", 4.2);
        album.addNewSong("Soldier of fortune", 3.13);
        albumList.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addNewSong("For those about to rock", 5.44);
        album.addNewSong("I put the finger on you", 3.25);
        album.addNewSong("Lets go", 3.45);
        album.addNewSong("Inject the venom", 3.33);
        album.addNewSong("Snowballed", 4.51);
        album.addNewSong("Evil walks", 3.45);
        album.addNewSong("C.O.D.", 5.25);
        album.addNewSong("Breaking the rules", 5.32);
        album.addNewSong("Night of the long knives", 5.12);
        albumList.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albumList.get(0).addToPlaylist("You can't do it right", playList);
        albumList.get(0).addToPlaylist("Holy man", playList);
        albumList.get(0).addToPlaylist("Speed king", playList);  // Does not exist
        albumList.get(0).addToPlaylist(9, playList);
        albumList.get(1).addToPlaylist(8, playList);
        albumList.get(1).addToPlaylist(3, playList);
        albumList.get(1).addToPlaylist(2, playList);
        albumList.get(1).addToPlaylist(24, playList);  // There is no track 24

        play(playList);

        /*for(int i = 0; i < playList.size(); i++)
        {
            System.out.println(playList.get(i).toString());
        }*/
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    break;
                case 4:
//                    printList(playList);
                    break;
                case 5:
//                    printMenu();
                    break;

            }
        }
    }



}
