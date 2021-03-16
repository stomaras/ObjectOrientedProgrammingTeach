package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckam = new SoccerPlayer("Beckam");

        // This particular instance is gonna acceept only football players
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        Team<SoccerPlayer> soccerTeam = new Team<>("Los Angeles Lakers");
        soccerTeam.addPlayer(beckam);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        System.out.println(adelaideCrows.numPlayers());
        // We need some sort of mechanism in order to confirm that only the right types of players can be added to teams
        // One solution could be to create 3 different team classes, so in other words, a football team, a baseball team and
        // a soccer team are three different classes and ensure that they only accept the correct player type. So in this case this will be
        // duplicating code and it's usually never an efficient way to code to actually duplicate codes so i do not recommend that.
        //
    }
}
