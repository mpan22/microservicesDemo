import java.sql.*;
public class JdbcConnectionDemo{
    public static void main(String[] arg){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/first_database";
            String user="root";
            String pass="12345678";
            Connection con=DriverManager.getConnection(url,user,pass);
            String q="create table table1(tId int(20) primary key auto_increment,"+
            "tName varchar(200) , tCity varchar(400))";
            Statement stmt=con.createStatement();
            // using excuteUpdate() , no creation of records.
            //  if any records updated then only integer will return
            stmt.executeUpdate(q);
            System.out.println("table created");
            if(con.isClosed()){
                System.out.println("connection is closed");
            }
            else{
                System.out.println("connection created");
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}