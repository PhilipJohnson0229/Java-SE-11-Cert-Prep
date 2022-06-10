package com.philipJohnson;

import java.util.ArrayList;
//the diamond with the T in the middle helps us declare generic types
public class Team<T extends Player> {
    private String name;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player)
    {
        if(members.contains(player))
        {
            //on this line were casting because java does not know if the player object has a getName method
            //we know that player objects do have the method and we cast because we expect to find player objects
            System.out.println(player.getName() + " is already on the teamn");
            return false;
        }else
        {
            members.add(player);
            System.out.println(((Player) player).getName() + " has been selected for the team " + this.getName());
        }

        return true;
    }

    public int numPlayer()
    {
        return this.members.size();
    }

    public void matchScore(Team<T> opponent, int ourScore, int theirScore)
    {
        String message;

        if(ourScore > theirScore)
        {
            won++;
            message = " beat ";
        }
        else if(ourScore == theirScore)
        {
            tied++;
            message = " drew with ";
        }
        else
        {
            lost++;
            message = " lost to ";
        }

        played++;

        if(opponent != null)
        {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchScore(null, theirScore, ourScore);
        }
    }

    public int ranking()
    {
        return (won * 2) + tied;
    }
}
