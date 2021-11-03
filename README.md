# Java_HanoiTowerAIGame

SPECIFICATIONS 

This project is all about the architecture and functionality. Plan the architecture in the beginning to avoid modifications at the end. It is important to fully understand the rule of Tower of Hanoi game; make sure to fully understand chapter 18.8 page 769. It is good to watch videos on tutorial of this game and how it can be solved programmatically. 
This application requires you to combine different concepts and technologies covered in the course. 

When the application starts, JavaFX window will popup and prompt the user to either login or create an account. 

If the user wants to create an account, the application needs to make sure all the username in the DB is unique. This has to be done by connecting to JDBC. 

Application checks the credential by matching the username and the password that are stored in the JDBC database. Once logged in, user can choose to either start the game or load the saved game from the file system. 

If the user chooses to start the game, they can specify how many pegs/disks there can be, from which peg to which peg does the disks have to be moved, etc. Minimum 3 pegs, 3 disks, maximum limit is up to the programmer. 

The application needs to provide an easy UI involving mouse clicks and entering the number. For example, they should be able to move the disks from one column to the other by mouse click or drag. 

Game follows the rule of Tower of Hanoi. For example, a disk cannot be put on top of a disk that is smaller than them, etc. 

Application should be able to know when the game is finished (Solved). When the game is finished, it shows the time record and ask the user whether to save the record or not. Then, it prompts the user to configure another game of Tower of Hanoi. 

Timer keeps track of the time since the beginning of the game until the user finishes or gives up. Timer should display the lively updated time to the user. Once the user finishes the game, the application stores the record and store the record in the JDBC database. 

Any user can view the game record of any other user. Application can show the ‘leaderboard’ which displays the top player in each game configuration. 
User can save the game without finishing it; thus, the application needs to be able to serialize the object that stores info of the on-going game and deserialize it if the user wants to load the game and continue. 

Note: objects containing JavaFX objects cannot be serialized. 

If the user wants to give up the game, AI on the application shows the animated answer to the game. Refer to chapter 18.8 on how to make the application to solve the Tower of Hanoi game. 

![1](https://user-images.githubusercontent.com/72087494/140117558-51878de1-75fc-450d-8589-d32b1d9efffc.png)

![2](https://user-images.githubusercontent.com/72087494/140117583-ec6e039e-3dcb-4631-b577-17da170f9198.png)
