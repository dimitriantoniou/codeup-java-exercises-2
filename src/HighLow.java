import java.util.Scanner;

public class HighLow {
    //Game Development 101
    //
    //Welcome to the world of game development!
    //
    //You are going to build a high-low guessing game. Create a class named HighLow inside of src.
    //
    //The specs for the game are:
    //
    //Game picks a random number between 1 and 100.
    //Prompts user to guess the number.
    //All user inputs are validated.
    //If user's guess is less than the number, it outputs "HIGHER".
    //If user's guess is more than the number, it outputs "LOWER".
    //If a user guesses the number, the game should declare "GOOD GUESS!"

    public static void Game() {
        System.out.println("Hello! Would you like to play a game? y/n");
        Scanner play= new Scanner(System.in);
        String userPlay=play.next();
        while(userPlay.equalsIgnoreCase("y")){
            System.out.println("Please enter a number between 1 and 100.");
            int userInput=Integer.parseInt(play.next());
            int randomNumber=(int)(Math.random() * 100);
            if (userInput<=0 || userInput>100){
                //need to validate user input is an int
                System.out.println("That is not within range. Please try again.");
                userInput=Integer.parseInt(play.next());
            }if (userInput==randomNumber){
                System.out.println("GOOD GUESS!");
                break;
            }else if(userInput<randomNumber){
                System.out.println("Higher");
                continue;
            }else if(userInput>randomNumber){
                System.out.println("Lower");
                continue;
            }System.out.println("Would you like to play again?");
            userPlay=play.next();
        }System.out.println("Thanks for playing!");

    }
    public static void main(String[] args){
        Game();
    }
}
