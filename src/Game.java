import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        boolean playAgain = true;
        String userAnswer = "";
        int handNumber;
        int computerHand;

        Game game = new Game();

        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
        int userScore = 0;
        int computerScore = 0;

        while (playAgain) {
            System.out.println("\nChoose your hand by typing the number of what you want to play: ");
            System.out.print("1) Rock | 2) Papers | 3) Scissors | 4) Lizard | 5) Spock: ");

            try {
                handNumber = userInput.nextInt();

                if (handNumber > 5 || handNumber < 1) {
                    throw new InputMismatchException("Input out of range, please try again\n");
                }

                computerHand = random.nextInt(5) + 1;
                System.out.println("Computer hand: " + computerHand);

                //Scissors cuts paper
                if (handNumber == 3 && computerHand == 2) {
                    System.out.println("Your Scissors cuts the computers Paper!\n");
                    userScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                } else if (handNumber == 2 && computerHand == 3) {
                    System.out.println("Your Paper was cut by the computers Scissors.\n");
                    computerScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                }

                //Paper covers rock
                if (handNumber == 2 && computerHand == 1) {
                    System.out.println("Your Paper covers the computers Rock!\n");
                    userScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                } else if (handNumber == 1 && computerHand == 2) {
                    System.out.println("Your Rock was covered by the computers Paper\n");
                    computerScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                }

                //Rock crushes scissors
                if (handNumber == 1 && computerHand == 3) {
                    System.out.println("Your Rock crushed the computers Scissors!\n");
                    userScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                } else if (handNumber == 3 && computerHand == 1) {
                    System.out.println("Your Scissors was crushed by the computers Rock\n");
                    computerScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                }

                //Rock crushes lizard
                if (handNumber == 1 && computerHand == 4) {
                    System.out.println("Your Rock crushes the computers Lizard!\n");
                    userScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                } else if (handNumber == 4 && computerHand == 1) {
                    System.out.println("Your Lizard was crushed by the computers Rock\n");
                    computerScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                }

                //Lizard poisons Spock
                if (handNumber == 4 && computerHand == 5) {
                    System.out.println("Your Lizard poisons the computers Spock!\n");
                    userScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                } else if (handNumber == 5 && computerHand == 4) {
                    System.out.println("Your Sock was poisoned by the computers Lizard\n");
                    computerScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                }

                //Spock smashes scissors
                if (handNumber == 5 && computerHand == 3) {
                    System.out.println("Your Spock smashes the computers Scissors!\n");
                    userScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                } else if (handNumber == 3 && computerHand == 5) {
                    System.out.println("Your Scissors was smashed by the computers Spock\n");
                    computerScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                }

                //Scissors decapitates lizard
                if (handNumber == 3 && computerHand == 4) {
                    System.out.println("Your Scissors decapitates the computers Lizard!\n");
                    userScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                } else if (computerHand == 3 && handNumber == 4) {
                    System.out.println("Your Lizard was decapitated by the computers Scissors\n");
                    computerScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                }

                //Lizard eats paper
                if (handNumber == 4 && computerHand == 2) {
                    System.out.println("Your Lizard eats the computers Paper!\n");
                    userScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                } else if (handNumber == 2 && computerHand == 4) {
                    System.out.println("Your Paper was eaten by the computers Lizard\n");
                    computerScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                }

                //Paper disproves Spock
                if (handNumber == 2 && computerHand == 5) {
                    System.out.println("Your paper disproves the computers Spock!\n");
                    userScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                } else if (handNumber == 5 && computerHand == 2) {
                    System.out.println("Your Spock was disproved by the computers Paper\n");
                    computerScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                }

                //Spock vaporizes rock
                if (handNumber == 5 && computerHand == 1) {
                    System.out.println("Your Spock vaporises the computers Rock!\n");
                    userScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                } else if (handNumber == 1 && computerHand == 5) {
                    System.out.println("Your Rock was vaporised by the computers Spock\n");
                    computerScore++;
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                }

                //Draw
                if (handNumber == computerHand) {
                    System.out.println("Draw!\n");
                    System.out.println("Scoreboard: YOU: " + userScore + " COMP: " + computerScore);
                }

                //Call playAgain method
                game.playAgain(userAnswer, userInput, playAgain, userScore, computerScore);

            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public boolean playAgain(String userAnswer, Scanner userInput, boolean playAgain, int userScore, int computerScore) {
        System.out.print("\nWould you like to play again?: ");
        userAnswer = userInput.next();

        userAnswer = userAnswer.toLowerCase();

        if (userAnswer.equals("yes") || userAnswer.equals("y")) {
            playAgain = true;
        } else if (userAnswer.equals("no") || userAnswer.equals("n")) {
            playAgain = false;
            System.out.println("\n\nThanks for playing! Final Score: YOU: " +userScore +" COMP: " +computerScore);
            System.exit(1);
        } else {
            System.err.println("Invalid input. Yes/No required. Please try again\n");
            playAgain(userAnswer, userInput, playAgain, userScore, computerScore);
        }
        return playAgain;
    }
}