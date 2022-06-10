package com.philipJohnson;

public class GenericsMain {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer jeff = new BaseballPlayer("jeff");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team<FootballPlayer> jaxWacksons = new Team<>("jaxWacksons");

        jaxWacksons.addPlayer(joe);
        //jaxWacksons.addPlayer(jeff);


        System.out.println(jaxWacksons.numPlayer());

        Team<BaseballPlayer> baseballTeam = new Team<>("Cubs");
        baseballTeam.addPlayer(jeff);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Roaches");
        soccerPlayerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchScore(fremantle, 1, 0);
        hawthorn.matchScore(jaxWacksons, 3, 8);

        jaxWacksons.matchScore(fremantle, 2, 1);
        //jaxWacksons.matchScore(baseballTeam, 1, 1);
        System.out.println("Rankings:");
        System.out.println(baseballTeam.getName() + ": " + baseballTeam.ranking());
        System.out.println(jaxWacksons.getName() + ": " + jaxWacksons.ranking());
        System.out.println(soccerPlayerTeam.getName() + ": " + soccerPlayerTeam.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
    }
}
