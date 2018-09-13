package sip.registerstudent.controller;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import sip.registerstudent.model.Student;

public class StudentController 
{
    static Connection connection;
    public static int addStudent(Student student) throws ClassNotFoundException, SQLException 
    {
        
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sliet", "username","password");

        String query = "INSERT INTO UG14 VALUES ('" + student.getRegno() + "','" + student.getName() + "','" + student.getContactNo() + "','" + student.getEmail() + "','" + student.getHostel() + "','" + student.getRoom() +"','" + student.getCategory() +"','" + student.getGender() + "','" + student.getAdhar() + "','" + student.getSemester() + "','" + student.getDay() + "','" + student.getMonth() + "','" + student.getYear() + "','" + student.getPass() + "')";

        Statement stm = connection.createStatement();

        int executeUpdate = stm.executeUpdate(query);

        return executeUpdate;
    }

    public static int update_atten_Student(Student student) throws ClassNotFoundException, SQLException 
    {
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sliet", "username","password");
        String batch=null;
        if(student.getBatch().equalsIgnoreCase("UG14"))
        { 
            batch="atteug14";
            String query = "INSERT INTO" +batch+ "VALUES ('" + student.getRegno() + "','" + student.getSubject() +"','" + student.getAttendance() + "')";
        }
        else if(student.getBatch().equalsIgnoreCase("UG15"))
        {
            batch="atteug15";
            String query = "INSERT INTO" +batch+ "VALUES ('" + student.getRegno() + "','" + student.getSubject() +"','" + student.getAttendance() + "')";
        }
        else if(student.getBatch().equalsIgnoreCase("UG16"))
        {
            batch="atteug16";
        }
        else if(student.getBatch().equalsIgnoreCase("UG17"))
            batch="atteug17";
        else
            batch=null;
        
        String query = "INSERT INTO" +batch+ "VALUES ('" + student.getRegno() + "','" + student.getSubject() +"','" + student.getAttendance() + "')";
        Statement stm = connection.createStatement();

        int executeUpdate = stm.executeUpdate(query);

        return executeUpdate;
        
    }

    public static int update_result_Student(Student student) throws SQLException 
    {
        String query = "INSERT INTO UG14 VALUES ('" + student.getRegno() + "','" + student.getName() + "','" + student.getContactNo() + "','" + student.getEmail() + "','" + student.getHostel() + "','" + student.getRoom() +"','" + student.getCategory() +"','" + student.getGender() + "','" + student.getAdhar() + "','" + student.getSemester() + "','" + student.getDay() + "','" + student.getMonth() + "','" + student.getYear() + "','" + student.getPass() + "')";
        Statement stm = connection.createStatement();
        int executeUpdate = stm.executeUpdate(query);
        return executeUpdate;
        
    }
    
    
}
