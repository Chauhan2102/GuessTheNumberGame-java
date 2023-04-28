package com.company;
        import java.util.Scanner;
        import java.util.Random;


public class Main {

    public static void main(String[] args) {
        //creating instance for Scanner
        Scanner r = new Scanner(System.in);
        String play = "yes";
        // While loop to determine if we are going to play again.
        while (play.equals("yes")) {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tried = 0;

            // while loop to check if the game is over.
            while (guess != randNum) {
                System.out.println("guess the number between 1 to 100: ");
                guess = r.nextInt();
                tried++;

                if (guess == randNum) {
                    System.out.println("Awesome you guessed the right number, you WIN!!!");
                    System.out.println("It took you " + tried + " guesses!");
                    System.out.println("Would you like to play again? yes or no: ");
                    play = r.next().toLowerCase();
                }
                else if (guess > randNum) {
                    System.out.println("Your guess is too high, try again");
                }
                else
                {
                    System.out.println("Your guess is too low, try again");
                }
            }
        }
        r.close();
    }
}
