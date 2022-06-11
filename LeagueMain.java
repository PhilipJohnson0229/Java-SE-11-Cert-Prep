package com.philipJohnson;

public class LeagueMain
{
    public static void main(String[] args)
    {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
        Team<FootballPlayer> jaxWacksons = new Team<>("jaxWacksons");

        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
        footballLeague.add(jaxWacksons);

        footballLeague.showLeagueTable();

    }
}
