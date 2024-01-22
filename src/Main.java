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
        Scanner scanner = new Scanner(System.in);
        int playerpos=0;
        System.out.println("Initial player position : "+playerpos);
        System.out.println("ENTER TO ROLL THE DIE :");
        String stringValue = scanner.nextLine();
        int dicevalue = rolldice();
        System.out.println("You Rolled : "+dicevalue);
    }
}