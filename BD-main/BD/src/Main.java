
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String username = scanner.nextLine();
        System.out.println("Enter password");
        String pass = scanner.nextLine();

        Connect con = new Connect();
        con.Connect(username, pass, "jdbc:postgresql://46.229.214.241:5432/postgres");
    }
}