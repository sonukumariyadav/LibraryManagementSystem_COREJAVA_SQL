package library.management.system;


import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system","root" , "" );   
            s =c.createStatement();  
            
           
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }  
    }  
}  