/**
 * Created by iyasuwatts on 10/17/17.
 */


import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //creating the random method to run, placing it here sets one random number at first instead of changing it each time
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        //creating a recursive guess, starting at 1 so that each guess is incremented when recorded
        reguess(1, number);
    }



    public static boolean reguess(int guesses, int number){
            Scanner in = new Scanner(System.in);

            System.out.println("what is your guess?");
            int guess = Integer.parseInt(in.nextLine());



//creating while loop to have it stop if correct, otherwise continue going
            while (guess == number) {
                System.out.println("correct guess, you have guessed " + guesses + " times");
                break;
            }
            //if else statement recalling reguess. 
            if (guess < number) {
                System.out.println("too small");
                guesses++;
                reguess(guesses, number);
            } else if (guess > number) {
                System.out.println("too large");
                guesses++;
                reguess(guesses, number);
            }
            return false;
        }
    }











