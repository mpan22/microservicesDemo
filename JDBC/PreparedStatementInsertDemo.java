import java.sql.*;
public class PreparedStatementInsertDemo{
    public static void main(String arg[]){
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        String url= "jdbc:mysql://localhost:3306/first_database";
        String user="root";
        String pass="12345678";
        Connection con= DriverManager.getConnection(url,user,pass);
        // Creting dynamic queryy
        String q="insert into  table1(tName,tCity) values(?,?)";

        // Get the prepared Statement object
        PreparedStatement ps= con.prepareStatement(q);

        //set the values to query
        ps.setString(1,"Mukul"); // First argument is representing column number in table. 
        // Using setString() becuz tName is of String type
        ps.setString(2,"Delhi"); // 2 represents the variable number 

        // Executing query
        ps.executeUpdate(); // Using executeUpdate because inserting data doesn't returns any data
        // If any data get return then use executeQuery()
        // Note : no need to pass query to execute update method as it is already passed in prepared Statement
        // We have to pass query while using Statement

        System.out.println(" Data inserted");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}