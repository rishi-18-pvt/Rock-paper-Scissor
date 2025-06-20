import java.util.Scanner;
import java.util.Random;

public class game{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        

        String [] choices = {"rock","paper","scissor"};
        String playersChoice;
        String ComputersChoice;
        String PlayAgain = "yes";

        System.out.print("Enter your Choice (rock, paper,scissor) = ");
        playersChoice = scanner.nextLine();

        if (!playersChoice.equals("rock")&& !playersChoice.equals("paper")&& !playersChoice.equals("scissor")) {
            System.out.println("Invalid Choice");
        }

    }
}