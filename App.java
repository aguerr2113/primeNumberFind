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
            System.out.println("Input a integer and I will let you know if it is a prime number: ");
            // if input is an integer
            if (sc.hasNextInt()) {
                // number is the user input if it is an integer
                number = sc.nextInt();
                // flip boolean to true to move on from while loop if user inputs a integer
                valindInput = true;
            }

        }
    }
}



