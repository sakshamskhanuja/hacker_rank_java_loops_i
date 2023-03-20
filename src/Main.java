import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Scans a whole number.
            int n = Integer.parseInt(scanner.nextLine());

            // Prints the first 10 multiples of n.
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a whole number.");
        } finally {
            // Closes the scanner.
            scanner.close();
        }
    }
}
