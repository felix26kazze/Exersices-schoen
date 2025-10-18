import java.util.Random;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        guessingGame(numberToGuess());
    }


    public static void guessingGame(int numberToGuess) {
        Scanner inp = new Scanner(System.in);


       for (int i = 0; i < 10; i++){
           int count = i + 1;
           System.out.print("Guess a number " + count + ": ");
           int input = inp.nextInt();
           if (input == numberToGuess) {
               System.out.println("You won wisenheimer! ");
               break;
           }
           else if (count == 10) {
               System.out.println("You lost! Have you ever heard of divide & conquer?");
               break;
           }
           else if (input > numberToGuess ) System.out.println("The number AI picked is lower than your guess. ");
           else if (input < numberToGuess ) System.out.println("The number AI picked is higher than your guess. ");


        }
    }

    public static int numberToGuess() {
        Random r = new Random();
        int random = r.nextInt(100);
        random++;
        return random;
    }
}