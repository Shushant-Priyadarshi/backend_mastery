package projects.hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        String filePath = "src/projects/hangman/words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Something went wrong");
        }

        Random rand = new Random();
        String word =words.get(rand.nextInt(words.size())) ;

        ArrayList<Character> wordState = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int wrongGuesses = 0;
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("********");
        System.out.println("HANG MAN");
        System.out.println("********");

        while (wrongGuesses < 6) {
            System.out.print(printHangMan(wrongGuesses));
            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();


            System.out.print("Guess a letter: ");
            char guess = sc.next().toLowerCase().charAt(0);


            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if(!wordState.contains('_')){
                    System.out.print(printHangMan(wrongGuesses));
                    System.out.println("You Win!");
                    System.out.println("The word was "+word);
                    break;
                }
            } else {
                wrongGuesses++;
                System.out.println("Incorrect guess!");
            }
        }

        if (wrongGuesses >= 6) {
            System.out.print(printHangMan(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The words was " + word);
        }


    }

    static String printHangMan(int wrongGuess) {
        return switch (wrongGuess) {
            case 0 -> """
                    
                    
                    
                    
                    """;
            case 1 -> """
                        O
                    
                    
                    
                    """;
            case 2 -> """
                         O
                         |
                    
                    
                    """;
            case 3 -> """
                          O
                        / |
                    
                    
                    """;
            case 4 -> """
                          O
                        / | \\
                    
                    
                    """;
            case 5 -> """
                          O
                        / | \\
                         /
                    
                    """;
            case 6 -> """
                          O
                        / | \\
                         / \\
                    
                    """;


            default -> "Invalid number of wrong guesses!";
        };

    }
}