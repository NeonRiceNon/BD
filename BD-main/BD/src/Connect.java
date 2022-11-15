import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    public static Connection Connect (String username, String pass, String jdbcURL){

        try {
            java.sql.Connection connection = DriverManager.getConnection(jdbcURL, pass, username);
            System.out.println(" kkkk postgresql ");
            return connection;
        } catch (SQLException e){
            System.out.println(" Ошибка подключения к серверу postgresql ");
            e.printStackTrace();
            return null;
        }
    }

    public static void INSERT() {

        try {
            Statement statement = Connect("PKS","PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int rows1 = statement.executeUpdate("INSERT INTO public.\"Author\" (name) VALUES ('Пушкин')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS","PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int rows2 = statement.executeUpdate("INSERT INTO public.\"Client\" (\"Shop\",\"Address\",\"Phone_number\") VALUES ('Книга','ул.Синяя, д.10','+79995553535')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS","PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int rows3 = statement.executeUpdate("INSERT INTO public.\"Genre\" (name) VALUES ('Роман')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS","PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int rows4 = statement.executeUpdate("INSERT INTO public.\"Books\" (\"Title_of_the_book\") VALUES ('2022-10-23','100')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS","PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int rows5 = statement.executeUpdate("INSERT INTO public.\"Books\" (\"Order_date\",\"Number_of_copies\") VALUES ('2022-10-23','100')");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
