package Sip;

import java.sql.*;


public class dbConnection 
{
    public static void main(String[] rah)
    {
        try
        {
            //Register the Driver
            //Class.forName("com.mysql.jdbc.Driver");
            //Get Connection
            Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/sliet","sip","rahulsliet");
            //Create Statement
            Statement mystm=mycon.createStatement();
            //Execute Querry
            ResultSet rs=mystm.executeQuery("Select * from student_info");
            //Process the Result set
            while(rs.next())
            {
                String name=rs.getString("Name");
                String reg=rs.getString("Registration No");
                String email=rs.getString("Email Id");
                String pass=rs.getString("Password");
                String adh=rs.getString("Adhar No");
                System.out.println("Name "+name);
                System.out.println("Registration No "+reg);
                System.out.println("Email Id "+email);
                System.out.println("Password "+pass);
                System.out.println("Adhar No. "+adh);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

