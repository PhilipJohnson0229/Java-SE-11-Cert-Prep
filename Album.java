package com.philipJohnson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album
{
    private ArrayList<Song> playList;

    private String artist;
    private String albumName;

    public Album(String albumName, String artist)
    {
        this.albumName = albumName;
        this.artist = artist;
        this.playList = new ArrayList<Song>();
    }

    public boolean addNewSong(String title, double duration)
    {
        if(findSong(title) == null)
        {
            this.playList.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    public Song findSong(String songName)
    {
        //this is an alternative way to loop through a list of entries
        //this is the foreach loop in java
        for(Song checkedSong: this.playList)
        {

            if(checkedSong.getTitle().equals(playList))
            {
                return checkedSong;
            }

        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if((index >0) && (index <= this.playList.size())) {
            playList.add(this.playList.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

}
