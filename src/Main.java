import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Single Player Snake and Ladder Game!");
        playGame();
    }
    private static int rolldice(){
        Random r = new Random();
        return r.nextInt(6);
    }
    private static void playGame(){
        int playerPosition = 0;
        int targetPosition = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initial player position : "+playerpos);
        System.out.println("ENTER TO ROLL THE DIE :");
        String stringValue = scanner.nextLine();
        int dicevalue = rolldice();
        System.out.println("You Rolled : "+dicevalue);
    }
    private static int checkSnakeAndLadder(int position) {
        switch (position) {
            case 12:
                System.out.println("You landed on a ladder! Move to position 37.");
                return 37;
            case 21:
                System.out.println("Oops! You landed on a snake. Move back to position 9.");
                return 9;
            case 28:
                System.out.println("You landed on a ladder! Move to position 84.");
                return  84;
            case 51:
                System.out.println("Oops! You landed on a snake. Move back to position 7.");
                return 7;
            case 71:
                System.out.println("You landed on a ladder! Move to position 91.");
                return 91;
            case 87:
                System.out.println("Oops! You landed on a snake. Move back to position 24.");
                return 24;
            default:
                return position;
        }
}