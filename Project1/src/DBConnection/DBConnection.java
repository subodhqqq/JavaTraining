package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Subodh on 27/12/2021.
 */
public class DBConnection {
    Connection connection=null;

    public DBConnection() {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           String dbURL="jdbc:mysql://localhost:3306/student";
           String name ="root";
           String password="";
           this.connection= DriverManager.getConnection(dbURL,name,password);
           System.out.println("DATABASE CONECCTION !!!!!!!!!!!");



       }
       catch (SQLException | ClassNotFoundException e)
       {
           System.out.println("DATABASE IS NOT CONECCTION");
       }

    }
    public static void main(String [] args)
    {
        DBConnection dbConnection=new DBConnection();

    }

    public PreparedStatement getPreparedstatement(String query)
    {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement(query);
        }
        catch (SQLException e) {
            e.printStackTrace();

        }
        return preparedStatement;
    }

}
