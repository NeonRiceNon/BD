import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    public static Connection Connect(String username, String pass, String jdbcURL) {

        try {
            java.sql.Connection connection = DriverManager.getConnection(jdbcURL, pass, username);
            System.out.println(" kkkk postgresql ");
            return connection;
        } catch (SQLException e) {
            System.out.println(" Ошибка подключения к серверу postgresql ");
            e.printStackTrace();
            return null;
        }
    }

    //ДОБАВЛЕНИЕ
    public static void INSERT() {
        /* try {
            Statement statement = Connect("PKS","PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int AUTHOR = statement.executeUpdate("INSERT INTO public.\"Author\" (name) VALUES ('Пушкин')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS","PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int CLIENT = statement.executeUpdate("INSERT INTO public.\"Client\" (\"Shop\",\"Address\",\"Phone_number\") VALUES ('Книга','ул.Синяя, д.10','+79995553535')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS","PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int GENRE = statement.executeUpdate("INSERT INTO public.\"Genre\" (name) VALUES ('Роман')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS","PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int BOOKS = statement.executeUpdate("INSERT INTO public.\"Books\" (\"id_Author\",\"id_Genre\",\"Title_of_the_book\") VALUES (1,1,'Онегин')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS","PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int ORDERS = statement.executeUpdate("INSERT INTO public.\"Orders\" (\"id_Client\",\"id_Book\",\"Order_date\",\"Number_of_copies\") VALUES ('2','1','2022-10-23','100')");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    //ОБНОВЛЕНИЕ
    public static void Update() {
        /*try {
            Statement statement = Connect("PKS", "PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int AUTHOR = statement.executeUpdate("UPDATE public.\"Author\" SET name='Бобров' WHERE \"id_Author\" = '1'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS", "PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int CLIENT = statement.executeUpdate("UPDATE public.\"Client\" SET \"Shop\"='Голубая Книга' WHERE \"id_Client\" = '1'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS", "PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int GENRE = statement.executeUpdate("UPDATE public.\"Genre\" SET name='Детектив' WHERE \"id_Genre\" = '1'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS", "PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int BOOKS = statement.executeUpdate("UPDATE public.\"Books\" SET \"Title_of_the_book\"='Бобров' WHERE \"id_Book\" = '1'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS", "PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int ORDERS = statement.executeUpdate("UPDATE public.\"Orders\" SET \"Number_of_copies\"=15 WHERE \"id_Orders\" = '1'");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    //УДАЛЕНИЕ
    public static void Delete() {
        /*try {
            Statement statement = Connect("PKS", "PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int AUTHOR = statement.executeUpdate("DELETE FROM \"Author\" WHERE \"id_Author\" = '27'");
            //statement.executeUpdate("UPDATE public.\"Author\" SET name='Бобров' WHERE \"id_Author\" = '1'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS", "PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int CLIENT = statement.executeUpdate("DELETE FROM \"Client\" WHERE \"id_Client\" = '16'");
            //statement.executeUpdate("UPDATE public.\"Author\" SET name='Бобров' WHERE \"id_Author\" = '1'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = Connect("PKS", "PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int GENRE = statement.executeUpdate("DELETE FROM \"Genre\" WHERE \"id_Genre\" = '14'");
            //statement.executeUpdate("UPDATE public.\"Author\" SET name='Бобров' WHERE \"id_Author\" = '1'");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        try {
            Statement statement = Connect("PKS", "PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int BOOKS = statement.executeUpdate("DELETE FROM \"Author\" WHERE \"id_Author\" = '27'");
            //statement.executeUpdate("UPDATE public.\"Author\" SET name='Бобров' WHERE \"id_Author\" = '1'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*try {
            Statement statement = Connect("PKS", "PKS", "jdbc:postgresql://46.229.214.241:5432/book publishing").createStatement();
            int ORDERS = statement.executeUpdate("DELETE FROM \"Author\" WHERE \"id_Author\" = '27'");
            //statement.executeUpdate("UPDATE public.\"Author\" SET name='Бобров' WHERE \"id_Author\" = '1'");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

    }
}

