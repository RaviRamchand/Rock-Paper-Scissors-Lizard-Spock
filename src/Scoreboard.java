import java.io.*;
import java.util.Scanner;

public class Scoreboard {

    private int userHighScore;
    private int userLongestWinStreak;

    //Reads scores.txt and saves the first field(high score) and second filed (longest win streak) in two variables
    public void readScoreList() {
        Scanner fileScanner = null;

        try {
            File fileDescriptor = new File("./scores.txt");
            fileScanner = new Scanner(fileDescriptor);


            while (fileScanner.hasNext()) {
                String record = fileScanner.nextLine();
                String[] fields = record.split(",");
                this.userHighScore = Integer.parseInt(fields[0]);
                this.userLongestWinStreak = Integer.parseInt(fields[1]);

            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } finally {
            fileScanner.close();
        }

    }

    //If the users score and win streak is higher than the ones listed in the file, update it
    public void writeNewScore(int userScore, int winStreak){
        PrintWriter writer = null;

        try{
            File fileDescriptor = new File("./scores.txt");
            writer = new PrintWriter(fileDescriptor);

            if(userScore == this.userHighScore && winStreak == this.userLongestWinStreak ||
                    userScore < this.userHighScore && winStreak < this.userLongestWinStreak){
                System.out.println("No new scores");
            }

            else if(userScore > this.userHighScore && winStreak <= this.userLongestWinStreak){
                writer.print(userScore +"," +this.userLongestWinStreak);
                System.out.println("\nNEW HIGH SCORE: " +userScore +"!!");
            }

            else if(userScore<= this.userHighScore && winStreak > this.userLongestWinStreak){
                writer.print(this.userHighScore +"," +winStreak);
                System.out.println("\nNEW WIN STREAK: " +winStreak +"!!");
            }

            else if(userScore > this.userHighScore && winStreak >  this.userLongestWinStreak){
                writer.print(userScore +"," +winStreak);
                System.out.println("\nNEW HIGH SCORE: " +userScore +" AND WIN STREAK: " +winStreak +"!!");
            }

        }catch(FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
