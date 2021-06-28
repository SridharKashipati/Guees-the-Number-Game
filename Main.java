package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Game guess = new Game();
        guess.play();

    }
}

class Game{
    private int noOfGuesses;
    private final int computerNumber;
    private int userInput;

    public Game(){
        Random rand = new Random();
        computerNumber = rand.nextInt(100);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess your number >> ");
        userInput = sc.nextInt();
    }
//    public int getNoOfGuesses() {
//        return noOfGuesses;
//    }

    public boolean isCorrectNumber(){
        return computerNumber != userInput;
    }

    public void play(){
        System.out.println("I have decided on a number between 0 - 100");
        System.out.println("Can you guess the number?");
        System.out.println();


        while (isCorrectNumber()){

            takeUserInput();

            if(userInput < computerNumber){
                System.out.println("The number you guess is smaller than Random number");
                System.out.println();
            }
            else if( userInput > computerNumber){
                System.out.println("The number you guessed is bigger than original number");
                System.out.println();
            }

            noOfGuesses++;

        }
        System.out.printf("You have cracked this game in %d number of guesses \n",noOfGuesses);

    }
}
