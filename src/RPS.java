import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

        //player one input
        Scanner in = new Scanner(System.in);

        //loop start?

        System.out.println("Player One, please enter your move [R/P/S]: ");
        String playerOne = in.nextLine();

        //verify move is valid
        if (!playerOne.equals("R") && !playerOne.equals("P") && !playerOne.equals("S")) {
            System.out.println("Invalid input, please enter valid move.");

        } else {

        //player two input

        System.out.println("Player Two, please enter your move [R/P/S]: ");
        String playerTwo = in.nextLine();

        //verify move is valid
        if (!playerTwo.equals("R") && !playerTwo.equals("P") && !playerTwo.equals("S")) {
            System.out.println("Invalid input, please enter valid move.");
        }
        //game outcome
        if (playerOne.equals(playerTwo)) {
            System.out.println("You tied!");
        } else if (
            (playerOne.equals("R") && playerTwo.equals("S")) ||
            (playerOne.equals("S") && playerTwo.equals("P")) ||
            (playerOne.equals("P") && playerTwo.equals("R"))) {

            System.out.println("Player One has won!");
        } else if (
            (playerTwo.equals("R") && playerOne.equals("S")) ||
            (playerTwo.equals("S") && playerOne.equals("P")) ||
            (playerTwo.equals("P") && playerOne.equals("R"))) {

            System.out.println("Player Two has won!");

            System.out.println("Would you like to play again? [Y/N]");
            String yesOrNo = in.nextLine();

        if (yesOrNo.equals("Y")) {
            System.out.println("Player One, please enter your move [R/P/S]: ");
        } else if (yesOrNo.equals("N")) {
            System.out.println("Game ended. Thanks for playing!");
        }

        }}}}


