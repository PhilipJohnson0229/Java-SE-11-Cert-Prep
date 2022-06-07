package com.philipJohnson;

import java.util.ArrayList;

public class Team {
    private String name;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player)
    {
        if(members.contains(player))
        {
            System.out.println(player.getName() + " is already on the teamn");
            return false;
        }else
        {
            members.add(player);
            System.out.println(player.getName() + " has been selected for the team " + this.getName());
        }

        return true;
    }

    public int numPlayer()
    {
        return this.members.size();
    }

    public void matchScore(Team opponent, int ourScore, int theirScore)
    {
        if(ourScore > theirScore)
        {
            won++;
        }
        else if(ourScore == theirScore)
        {
            tied++;
        }
        else
        {
            lost++;
        }

        played++;

        if(opponent != null)
        {
            opponent.matchScore(null, theirScore, ourScore);
        }
    }
}
