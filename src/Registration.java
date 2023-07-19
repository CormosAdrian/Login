import java.util.Scanner;

public class Registration {
    private Scanner scanner= new Scanner(System.in);
    private static int attempts=0;
    private static final int maxAttempts=3;
    public String registerUsername(){
        String username;
        while (true) {
            System.out.println("Please register your email address");
            username = scanner.nextLine();
            if (!username.contains("@")) {
                System.out.println("Email adress is not valid. must contains '@'! ");

                continue;
            } else if (username.length() < 6) {
                System.out.println("Username must contains at least 6 letter") ;
                    continue;


            }
            break;
        }
        return  username;

    }

    public String registerPassword() {
        String password;
        while (true) {
            System.out.println("Please choose your password");
            password = scanner.nextLine();

            attempts++;
            if (attempts >= maxAttempts) {
                System.out.println("Timeout");
                break;
            }
                    if (password.length() < 6) {
                        System.out.println("Password to short. please create a longer password");
                        continue;
                    } else if (!password.matches("\\.*[A-Z].*")) {
                        System.out.println("Password must contains at least one uppercase letter");
                        continue;

                    }
                    break;
                }
                return password;

            }

        }
