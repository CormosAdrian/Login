import java.util.Scanner;


        public class Main {

            public static void main(String[] args) {
                Registration registration= new Registration();
                String username= registration.registerUsername();
                String password= registration.registerPassword();
                Login login=new Login(username, password);
                login.performLogin();



            }
        }