import java.util.Scanner;


public class Login {

    private static final int maxAttempts = 3;
    private static Scanner scanner = new Scanner(System.in);
    private static String correctUsername = "";
    private static String correctPassword = "";
    private static int attempts = 0;

    public Login(String username, String password){
        correctUsername=username;
        correctPassword=password;

    }

    public static void performLogin() {


        do {
            String enteredUsername = getInput("Enter the username");

            String enteredPassword = getInput("Enter the password");
            if (!enteredUsername.equals(correctUsername) || !enteredPassword.equals(correctPassword)) {
                System.out.println("Invalid username or password. Try again.");
                attempts++;
                if (attempts >= maxAttempts) {
                    System.out.println("Access restricted");
                    return;

                } else if (!enteredUsername.contains("@")) {
                    System.out.println("UserName adress is not valid. must contains '@'! ");

                    continue;
                }
            } else {
                System.out.println("Access granted");
                break;
            }
        } while (true);
    }
    private static String getInput (String input) {
        System.out.println(input);
        return scanner.nextLine();
    }
}