package projects;

import java.util.Scanner;

public class Quizz_App {
    public static void main(String[] args) {
        //String Questions
        String[] questions= {"1. What is the capital of Japan?",
                            "2. Which planet is known as the Red Planet?",
                            "3. What is the national animal of India?",
                            "4. Which of these is NOT a programming language?",
                            "5. What is the chemical symbol for gold?"};

        String [] [] options = {
                        {"A) Beijing","B) Seoul","C) Tokyo","D) Bangkok"},
                        {"A) Venus","B) Mars","C) Jupiter","D) Saturn"},
                        {"A) Elephant","B) Tiger","C) Lion","D) Peacock"},
                        {"A) Python","B) Java","C) HTML","D) C++"},
                        {"A) Ag","B) Au","C) Fe","D) Pb"}};

        Integer[]  answers = {3,2,4,3,1};

        int score =0;
        int guess;
        Scanner sc = new Scanner(System.in);

        System.out.println("**********************************************");
        System.out.println("            Welcome to Quizz App");
        System.out.println("**********************************************");

        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            for(String option:options[i]){
                System.out.println(option);
            }
            System.out.print("Choose an option: ");
            guess = sc.nextInt();

            if(guess == answers[i] ){
                System.out.println("*******");
                System.out.println("Correct!");
                System.out.println("*******");
                score++;
            }else{
                System.out.println("*******");
                System.out.println("Wrong!");
                System.out.println("*******");
            }
        }

        System.out.println("You scored "+score+ " out of "+questions.length+" questions");

        sc.close();

    }
}
