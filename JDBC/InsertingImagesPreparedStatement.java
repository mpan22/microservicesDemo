import java.sql.*;
import java.io.*;
public class InsertingImagesPreparedStatement{
    public static void main(String[] arg){
        // Before moving forward create table having column 1 as integer primary key auto incremented, column 2 as 
        // blob(binary large object) type
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/first_database";
            String user="root";
            String pass="12345678";
            Connection con= DriverManager.getConnection(url,user,pass);
            String q = "insert into image_save(image_id) Values(?)";
            PreparedStatement ps=con.prepareStatement(q);
            FileInputStream fis= new FileInputStream("image.png"); // Converts image/audio to binary stream
            // Giving image.png as path beacuase they are in same folder
            // For setting byte stream data in prepared statement use setBianryStream() method
            ps.setBinaryStream(1,fis,fis.available()); // available method returns estimated number of bytes
            // that can be read from input stream
            ps.executeUpdate();
            System.out.println("image inserted");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}