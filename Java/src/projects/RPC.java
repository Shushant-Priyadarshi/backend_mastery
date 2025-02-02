package projects;

import java.util.Random;
import java.util.Scanner;

public class RPC {
    public static void main(String[] args) {
        String[] choice = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        do {

            System.out.print("Please enter your choice (rock, paper, scissor): ");
            playerChoice = sc.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")) {
                System.out.println("Please enter a valid choice");
                continue;
            }
            computerChoice = choice[rand.nextInt(3)];
            System.out.println("Player choice: " + playerChoice);
            System.out.println("Computer choice: " + computerChoice);
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a Tie");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissor") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissor") && computerChoice.equals("paper")) {
                System.out.println("You won");
            } else {
                System.out.println("You lost");
            }

            System.out.print("Do you want to play again? (yes/no)");
            playAgain = sc.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));
        sc.close();
        System.out.println("Thanks for playing!");
    }
}
