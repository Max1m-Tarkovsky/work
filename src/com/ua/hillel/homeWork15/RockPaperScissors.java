package com.ua.hillel.homeWork15;

import java.io.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private User user;
    private Computer computer;
    private int userScore;
    private int computerScore;
    private int numberOfGames;
    private int gameNumers;

    private enum Move {
        ROCK, PAPER, SCISSORS;

        public int compareMoves(Move otherMove) {
            if (this == otherMove)
                return 0;

            switch (this) {
                case ROCK:
                    return (otherMove == SCISSORS ? 1 : -1);
                case PAPER:
                    return (otherMove == ROCK ? 1 : -1);
                case SCISSORS:
                    return (otherMove == PAPER ? 1 : -1);

            }

            return 0;
        }
    }

    private class User {
        private Scanner inputScanner;

        public User() {
            inputScanner = new Scanner(System.in);
        }

        public Move getMove() {
            System.out.println("Pleas use : Rock ,Scissors or Pepper");
            String userInput = inputScanner.nextLine();
            userInput = userInput.toUpperCase();
            char firstLetter = userInput.charAt(0);
            if (firstLetter == 'R' || firstLetter == 'S' || firstLetter == 'P' || firstLetter == 'E') {
                switch (firstLetter) {
                    case 'R':
                        return Move.ROCK;
                    case 'S':
                        return Move.SCISSORS;
                    case 'P':
                        return Move.PAPER;
                    default:
                        throw new IllegalStateException("Not  correct value \n" + " Pleas choose  Rock ,Scissors or Pepper ");
                }

            }
            System.out.println("Not  correct value \n" + " Pleas choose  Rock ,Scissors or Pepper ");
            return getMove();
        }

        public boolean playAgain() {
            System.out.print("Do You wont play again ? \n" + " Pleas put : Yes or No ");
            String userInput = inputScanner.nextLine();
            userInput = userInput.toUpperCase();
            return userInput.charAt(0) == 'Y';
        }

    }

    private class Computer {
        public Move getMove() {
            Move[] moves = Move.values();
            Random random = new Random();
            int index = random.nextInt(moves.length);
            return moves[index];
        }
    }

    public RockPaperScissors() {
        user = new User();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
        gameNumers = 0;
    }

    public void startGame() {

        System.out.println("Hi my friend, it's time to play the game!\n" + "Pleas select number of games ");
        Scanner scanner = new Scanner(System.in);
        try {
            gameNumers = scanner.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("Not correct value !Pleas enter correct value ");
            startGame();
        }
        for (int i = 0; i < gameNumers; i++) {

            System.out.println("Lets go !!");
            Move userMove = user.getMove();
            Move computerMove = computer.getMove();

            System.out.println("\nВаш ход " + userMove + ".");
            System.out.println("Ход компьютера " + computerMove + ".\n");


            int compareMoves = userMove.compareMoves(computerMove);
            switch (compareMoves) {
                case 0:
                    System.out.println("Tie!");
                    break;
                case 1:
                    System.out.println(userMove + " beats " + computerMove + ".You won!");
                    userScore++;
                    break;
                case -1:
                    System.out.println(computerMove + " beats " + userMove + ". You lose.");
                    computerScore++;
                    break;

            }
            numberOfGames++;

            if (user.playAgain()) {
                System.out.println();
                printGameStats();
            } else {
                printGameStats();
                break;
            }

        }

    }


    private void printGameStats() {
        int wins = userScore;
        System.out.println("Value won =" + userScore);
        int losses = computerScore;
        System.out.println("Value lose =" + computerScore);
        int ties = numberOfGames - userScore - computerScore;
        System.out.println("Ties =" + ties);
        int gameNumber = numberOfGames;
        System.out.println("Played games =" + numberOfGames);

    }
    public void writeToFile () throws IOException {
        String wayToFail = "/Users/maksim/Документы/Hillel/ClasWork/src/com/ua/hillel/homeWork15";
        String fileForWrite = "WriteToFail.txt";
        File file = new File(wayToFail, fileForWrite);
        System.out.println(file.createNewFile());
        BufferedWriter writer = new BufferedWriter(new FileWriter("WriteToFail.txt"));
        writer.write("Value won = " + userScore+"\nValue lose = " + computerScore+"\nTies = " + (numberOfGames - userScore - computerScore) +"\nPlayed games = " + numberOfGames );
        writer.close();

    }
    public static void readFromFile(){
        String inputFileName = "/Users/maksim/Документы/Hillel/ClasWork/src/com/ua/hillel/homeWork15//WriteToFail.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws IOException {
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();
        game.writeToFile();
        game.readFromFile();
    }
}



