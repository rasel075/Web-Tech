import java.util.*;

public class numberguess {

public static final String BLACK  = "\u001B[30m";
public static final String RED    = "\u001B[31m";
public static final String GREEN  = "\u001B[32m";
public static final String YELLOW = "\u001B[33m";
public static final String BLUE   = "\u001B[34m";
public static final String PURPLE = "\u001B[35m";
public static final String CYAN   = "\u001B[36m";
public static final String WHITE  = "\u001B[37m";
public static final String RESET  = "\u001B[0m";
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter lowerbound: ");
        int lowerbound=input.nextInt();
        System.out.println("Enter upperbound: ");
        int upperbound=input.nextInt();
        Random random=new Random();
        int target = random.nextInt(lowerbound,upperbound+1); //target in 1 to 10
        int guess;
        int attempts=0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerbound + " and " + upperbound + ".");
        System.out.println("Can you guess what it is?");
        while(true){
                if(!input.hasNextInt())
                {
                    System.out.println("Invalid input! , please valaid input");
                    input.next();
                    continue;
                }
                guess=input.nextInt();
                attempts++;
                if (guess < lowerbound || guess > upperbound) {
                    System.out.println("Guess must be between " + lowerbound + " and " + upperbound + ".");
                }
                    else if(guess>target) System.out.println("Too large! Try again...");
                    else if(guess<target)System.out.println("Too low ! try agein...");
                    else {System.out.println(PURPLE+"Congratulation... !!"+RESET+"  You guessed the "+BLUE+"number in "+RESET+RED + attempts +RESET+ GREEN+" attempts. "+RESET);
                    break;}

        }
       
    }
}
