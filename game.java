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

        do {
            System.out.print("Enter your Choice (rock, paper,scissor) : ");
        playersChoice = scanner.nextLine();

        ComputersChoice = choices[random.nextInt(3)];
        System.out.println("Computers Choice: " + ComputersChoice);

        if (!playersChoice.equals("rock")&& !playersChoice.equals("paper")&& !playersChoice.equals("scissor")) {
            System.out.println("Invalid Choice");
            continue;
        }

        if (playersChoice.equals(ComputersChoice)) {
            System.out.println("Its a tie");
        }
        else if(playersChoice.equals("rock") && ComputersChoice.equals("scissor")){
            System.out.println("you win");

        }
        else if(playersChoice.equals("paper") && ComputersChoice.equals("scissor")){
            System.out.println("you win");
        }
        else if(playersChoice.equals("scissor") && ComputersChoice.equals("paper")){
            System.out.println("you win");
        }
        else{
            System.out.println("you loose");
        }

        System.out.println("Play Again (yes/no): ");
        PlayAgain = scanner.nextLine().toLowerCase();
            
        } while (PlayAgain.equals("yes"));

        



    }
}