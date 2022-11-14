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
            int rows = statement.executeUpdate("INSERT INTO public.\"Author\" (name) VALUES ('Пушкин')");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
