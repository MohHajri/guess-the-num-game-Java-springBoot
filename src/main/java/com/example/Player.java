package com.example;

public class Player {
    private String playerName;
    private int counter = 1;
    private int gamesPlayed;

    public int getGamesPlayed() {
        return this.gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getCounter() {
        return this.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void incrementCounter(){
        counter++;
    }

    public String getPlayerDetails() {
         return "{\nName: " + playerName + ", \nGamesPlayed: " + gamesPlayed + ",\nTotal Moves: " + counter + "\n}";
   
     }

}
