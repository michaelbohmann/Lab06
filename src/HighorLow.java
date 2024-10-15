import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int randomNumber = gen.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean valid = false;


        do
        {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess >= 1 && guess <= 10)
                {
                    valid = true; // Valid input within the range
                }
                else
                {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!valid);

        if (guess < randomNumber)
        {
            System.out.println("Your guess is too low.");
        }
        else if (guess > randomNumber)
        {
            System.out.println("Your guess is too high.");
        }
        else
        {
            System.out.println("You guessed it! The number was " + randomNumber);
        }
    }
}