import java.util.Scanner;
// import scanner for user input

public class App {
    public static void main(String[] args) throws Exception {
        int number = 0;
        // create a number variable
        Scanner sc = new Scanner(System.in);
        // create variable to capture user input
        boolean valindInput =  false;
        // cteate bool variable for input validation
        
        // while the input is invalid do this
        while (!valindInput) {
            System.out.println("Input any positive integer and I will let you know if it is a prime number: ");
            // if input is an integer
            if (sc.hasNextInt()) {
                // number is the user input if it is an integer
                number = sc.nextInt();

                if (number > 0) {
                    // flip boolean to true to move on from while loop if user inputs a positive integer
                    valindInput = true;
                }
                else{
                    System.out.println("Invalid Input! Please enter a positive integer.");
                } 
            }
            // if input is invalid do this:
            else{
                // Alert user to invalid entry
                System.out.println("Invalid Input!");
                // clear input to run again
                sc.next();
            }
        }
        if (isPrime(number)) {
            System.out.println(number + " is a prime number! ");
        } else {
            System.out.println(number + " is NOT a prime number. ");
        }
        sc.close();
    }
    public static boolean isPrime(int n){
        if (n <= 1 ) {
            return false;
        }
        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // If divisible, it's not a prime number
            }
        }

        return true; // If no divisors found, the number is prime
    }
}



