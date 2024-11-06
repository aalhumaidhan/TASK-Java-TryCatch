import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";
        String username;
        String password;
        boolean loggedIn = false;


        while (!loggedIn) {
            try {
                System.out.println("Please enter your username: ");
                username = scanner.nextLine();

                System.out.println("Please enter your password: ");
                password = scanner.nextLine();
                if (!username.equals(validUsername) || !password.equals(validPassword)) {
                    throw new Exception("Invalid Credentials");
                } else {
                    loggedIn = true;
                    System.out.println("You are logged in!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}