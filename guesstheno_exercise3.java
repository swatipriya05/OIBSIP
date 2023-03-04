import java.util.Scanner;
import java.util.Random;

class Game {
    public int randomno, inputno, noofguesses, score, limit;

    public int getnoofguesses() {
        return noofguesses;
    }

    public void setnoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }

    
    Game() {
        Random rand = new Random();
        this.randomno = rand.nextInt(100);

    }

    void takeuserinput() {
        System.out.println("Guess the no: ");
        Scanner sc = new Scanner(System.in);
        inputno = sc.nextInt();

    }

    boolean iscorrectno() {
        if (limit >= 100) {
            System.out.println("Limit Reached!");
            return false;
        }
        // You can activate the cheat-code by inserting : -1
        else if (inputno == -1) {
            System.out.println("Cheat Activated! The correct number is " + randomno);
            return false;
        }
        else if (inputno == randomno) {
            System.out.println("Congrats You Won!");
            System.out.println("The correct number is " + randomno);
            System.out.println("Your Score is " + (100 - score));
            return true;
        } 
        else if (inputno < randomno) {
            System.out.println("Too low....");
            score++;
            limit++;
            return false;
        } 
        else {
            System.out.println("Too high....");
            score++;
            limit++;
            return false;
        }
    }

}

public class guesstheno_exercise3 {
    public static void main(String[] args) {
        /*
         * create a class game, which allow user to guess the number game once
         */
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeuserinput();
            b = g.iscorrectno();
            // System.out.println(b);
            if (g.limit >= 100) {
                break;
            }
        }

    }
}
