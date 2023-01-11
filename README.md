# guess-the-num-game-Java-springBoot
A game about guessing the number that is implemented by Java and springBoot. 
The final project of the course of object-oriented Java langauge I had during the second year of ICT at OAMK.

 The user is able to create (at least) one player on the server, get player information from the server, play the game in turns with the player and see finished game information and winner

As a Spring application, the system architecture is the following:

- Web client (i.e. the Web browser) is shown here only for illustration. No need to create HTML or such files in this course!
- Instead of browser, you can use Thunder (VS Code extension) or Postman or any similar Web client to create and sent HTTP requests
- Spring Boot requires the application and controller objects on the server
- Your game requires a set of objects, i.e. MyApp objects, on the server
- File system (i.e. set of files) is needed to store data that is for example player and/or game information (Use of a database is optional if you know what you are doing..)


Minimally the game consists of four objects for which you need to create classes:
- Application class is created automatically for a Spring application
- Controller class handles the different HTTP requests, i.e.runs the game application logic
- Game class that runs your game in method play(). May need some additional attributes depending on your game. 
- Player class that stores the player information as its attributes. Needs getters and setters for the attributes. Also saves and loads the attributes from a file. 
