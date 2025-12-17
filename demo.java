import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo {
    public static void main(String[] args) throws SQLException {
        String query="insert into emp(empcode,empname,empage,esalary)values(101,'jenny',25,10000),(102,'jacky',30,20000),(103,'joe',20,40000),(104,'john',40,80000),(105,'shameer',25,90000)";
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/employee?"+"user=root&password=123Prasanna@"))
        {
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
