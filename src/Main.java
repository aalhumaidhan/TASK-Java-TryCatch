import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";

        try {
            System.out.println("Please enter your username: ");
            String username = scanner.nextLine();

            System.out.println("Please enter your password: ");
            String password = scanner.nextLine();
            if (!username.equals(validUsername) || !password.equals(validPassword)) {
                throw new Exception("Invalid Credentials");
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}