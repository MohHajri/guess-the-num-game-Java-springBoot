package com.example;

// import java.util.Random;

public class Game {
    private int userGuess;
    private int randomNum;
   
    public int getRandomNum() {
        return this.randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }

    // static Random obj = new Random();

    // public Game() {
    //     Random obj = new Random();
    //     randomNum = obj.nextInt(100);
    // }

    public int getUserGuess() {
        return this.userGuess;
    }

    public void setUserGuess(int userGuess) {
        this.userGuess = userGuess;
    }

    public int isValid(int userGuess) {
        if (userGuess > randomNum) {
            return -1;
        }
        if (userGuess < randomNum) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public String gameStarted() {
        return "YOU ARE NOW PLAYING GUESS THE NUMBER GAME!\n TO START, PUT YOUR NAME USING '/player?name=yourName' \n TO MAKE A GUESS, PUT '/game?move=yourGuess'\n TO DISPLAY YOUR INFORMATION, PUT /player";
    }

    // public void continuePlaying(String answer) {
    //     while (true) {
    //         System.out.println("Would you like to play again? Answer: y or n ");
    //         if (answer == "y") {
    //             isValid(userGuess);
    //         } else if (answer == "n") {
    //             break;
    //         }
    //     }

    // }
}