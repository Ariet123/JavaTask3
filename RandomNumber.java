import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        // Create an instance of the Random class to generate random numbers
        Random random = new Random();

        // Generate a random number between 1 and 100 (inclusive)
        int randomNumber = random.nextInt(100) + 1;

        // Print the generated random number
        System.out.println("The random number is: " + randomNumber);

        // Check if the random number is even or odd
        if (randomNumber % 2 == 0) {
            // Print a message if the number is even
            System.out.println("It is an even number.");
        } else {
            // Print a message if the number is odd
            System.out.println("It is an odd number.");
        }
    }
}
