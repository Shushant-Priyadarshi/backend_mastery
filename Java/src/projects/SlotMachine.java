package projects;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {


    public static void main(String[] args) {
        int balance = 100;
        int bet;
        Scanner input = new Scanner(System.in);

        while (balance > 0) {
            System.out.println("*************************************");
            System.out.println("🍎🍇🍌Welcome To Slot Machine 🌶️🍋‍🟩🥐");
            System.out.println("*************************************");

            System.out.println("Current Balance: " + balance);
            System.out.print("Choose your bet: ");
            bet = input.nextInt();

            if(bet > balance) {
                System.out.println("Insufficient Balance");
                continue;
            }else if(bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            }else{
                balance -= bet;
            }

            System.out.println("****** Machine is Running.... ********");
            String[] result =runMachine();
            System.out.println(" "+ String.join(" || ", result));
        }
        input.close();
        System.out.println("No Balance Left!!");
        System.out.println("Thanks for playing!");


    }


    static String[] runMachine(){
        String[] symbols = {"🍎","🍇","🍌","🌶","️🍋‍🟩","🥐"};
        String[] row = new String[3];
        Random rand = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[rand.nextInt(5)];
        }
        return row;
    }
}
