package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class MyController {
  Game myGame = new Game();
  Player myPlayer = new Player();
   Random obj = new Random();

  @GetMapping("/game")
  public String game() {
    return myGame.gameStarted();

  }

  @PostMapping("/player")
  public void createPlayer(@RequestParam String name) {
    myPlayer.setPlayerName(name);
    //setting the total moves to zero when a new player is created
    myPlayer.setCounter(0);
    //setting the game counter to zero when a new player is created
    myPlayer.setGamesPlayed(0);
    myGame.setRandomNum(obj.nextInt(100));
  }

  @GetMapping("/player")
  public String getPlayer() {
    return myPlayer.getPlayerDetails();
  }

  @PutMapping("/game")
  public String giveMove(@RequestParam Integer move) {
    while (true) {
      myGame.setUserGuess(move);
      if (myGame.isValid(move) == 0) {
        myPlayer.setGamesPlayed(myPlayer.getGamesPlayed() + 1);
        return "You won! Number is correct\nIt took you " + myPlayer.getCounter()
            + " attempts to guess the number";

        //  break;

      } else if (myGame.isValid(move) == -1) {
        myPlayer.incrementCounter();
        return "Wrong! your guess is higher. Try lower ";

      } else if (myGame.isValid(move) == 1) {
        myPlayer.incrementCounter();
        return "Wrong! your guess is lower. Try higher ";

      }

    }

  }


}
