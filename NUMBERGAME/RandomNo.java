import java.util.*;

public class RandomNo{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Random rn = new Random();

        int lowerbound = 1;
        int upperbound = 100;
        int numberOfAttempts = 6;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("You have 6 chances to guess the correct number");

        do{
            int targetno = rn.nextInt((upperbound - lowerbound) + 1) + lowerbound;
            int currentAttempt = 0;
            boolean guesscorrectly = false;

            System.out.println(" We have generated a number between " + lowerbound  + "and " + upperbound + ".");

            while(currentAttempt < numberOfAttempts && !guesscorrectly){
                System.out.println("Enter your guess:");
                int userGuess = scanner.nextInt();

                if(userGuess == targetno){
                    System.out.println("Congralutions! Your guess is correct.");
                    guesscorrectly = true;
                }
                else if(userGuess < targetno){
                    System.out.println("two low! Try again.");
                }else{
                    System.out.println("Too high! Try again.");
                }
                currentAttempt++;
            }
            if(!guesscorrectly){
                System.out.println("Sorry, you've run out of attempts. The correct number was:" + targetno);
            }else{
                score++;
                System.out.println("You guessed it in " + currentAttempt  + "attempts!");
            }

            System.out.println("Do you want to play again? (yes/no):");
            String playAgain = scanner.next().toLowerCase();
            if(!playAgain.equals("yes")){
                break;
            }
        }
        while(true);

        System.out.println("Thanks for playing! Your total score is:" + score);
        scanner.close();
    }
}