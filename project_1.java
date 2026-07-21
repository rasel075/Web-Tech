import java.util.Scanner;

public class Project_1 {
public static final String RED = "\u001B[31m";
public static final String GREEN = "\u001B[32m";
public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        
       
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power (a^b)");
            System.out.println("6. Factorial");
            System.out.println("7. Check Prime");
            System.out.println("0. Exit");

            System.out.print("Choose an Option (0-7): ");

            // Character/String check
            if (!input.hasNextInt()) {
                System.out.println("Invalid Input! Enter a number.");
                input.next();
                continue;
            }

            int choice = input.nextInt();

            if (choice < 0 || choice > 7) {
                System.out.println("Invalid Option! Try Again.");
                continue;
            }

            switch (choice) {

                case 0:
                    System.out.println("Program End.");
                    input.close();
                    return;

                case 1: // Add
                     System.out.println(RED+"\n===== Addition ====="+ RESET);
                    int sum = 0;
                    System.out.println("\nPress 0 to Stop.");

                    while (true) {
                        System.out.print("Enter Number: ");

                        if (!input.hasNextInt()) {
                            System.out.println("Invalid Input!");
                            input.next();
                            continue;
                        }

                        int num = input.nextInt();

                        if (num == 0)
                            break;

                        sum += num;
                    }

                    System.out.println("Total Sum = " + sum);
                    // break;
                    input.close();
                    return;

                case 2: // Subtract
                    System.out.println("\n===== Subtraction =====");
                    System.out.print("Enter First Number: ");
                    int a = input.nextInt();

                    System.out.print("Enter Second Number: ");
                    int b = input.nextInt();

                    System.out.println("Result = " + (a - b));
                    // break;
                    input.close(); // don't work scanner 
                    return;//main function close

                case 3: // Multiply
                    System.out.println("\n===== Multiplication =====");
                    System.out.print("Enter First Number: ");
                    a = input.nextInt();

                    System.out.print("Enter Second Number: ");
                    b = input.nextInt();

                    System.out.println(RED+"Result = " + (a * b)+RESET);
                    // break;
                    return;

                case 4: // Divide
                    System.out.println("\n===== Division =====");
                    System.out.print("Enter Dividend: ");
                    a = input.nextInt();

                    System.out.print("Enter Divisor: ");
                    b = input.nextInt();

                    if (b == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        System.out.println(RED+"Result = " + ((double) a / b) +RESET);
                    }
                    break;

                case 5: // Power
                    System.out.println("\n===== Power (a^b) =====");
                    System.out.print("Enter Base: ");
                    a = input.nextInt();

                    System.out.print("Enter Exponent: ");
                    b = input.nextInt();

                    System.out.println("Result = " + Math.pow(a, b));
                    break;

                case 6: // Factorial
                    System.out.println("\n===== Factorial =====");
                    System.out.print("Enter a Number: ");
                    int n = input.nextInt();

                    if (n < 0) {
                        System.out.println("Factorial is not possible.");
                    } else {
                        long fact = 1;

                        for (int i = 1; i <= n; i++) {
                            fact *= i;
                        }

                        System.out.println("Factorial = " + fact);
                    }
                    break;

                case 7: // Prime
                    System.out.println("\n===== Prime Number Check =====");
                    System.out.print("Enter a Number: ");
                    n = input.nextInt();

                    if (n < 2) {
                        System.out.println(n + " is not Prime.");
                    } else {

                        boolean prime = true;

                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) {
                                prime = false;
                                break;
                            }
                        }

                        if (prime)
                            System.out.println(GREEN+n + " is Prime."+RESET);
                        else
                            System.out.println(RED+n + " is not Prime."+RESET);
                    }
                    break;
            }
        }
    }
}