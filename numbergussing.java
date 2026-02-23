import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int attempts = 7;

        System.out.println("Guess the number between 1 and 100");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts--;

            if (guess == number) {
                System.out.println("Correct! You guessed the number.");
                break;
            } else if (guess > number) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }

            System.out.println("Attempts left: " + attempts);
        }

        if (attempts == 0) {
            System.out.println("You lost! Number was " + number);
        }

        sc.close();
    }
}