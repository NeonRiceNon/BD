import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public void Connect (String username, String pass, String jdbcURL){

        try {
            java.sql.Connection connection = DriverManager.getConnection(jdbcURL, pass, username);
            System.out.println(" Подключился к серверу postgresql ");
            connection.close();
        } catch (SQLException e){
            System.out.println(" Ошибка подключения к серверу postgresql ");
            e.printStackTrace();
        }
    }
}
