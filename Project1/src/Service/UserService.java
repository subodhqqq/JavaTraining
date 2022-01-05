package Service;

import DBConnection.DBConnection;
import Model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Subodh on 27/12/2021.
 */
public class UserService {


//user list dekhauna ko lagi
    public List<Student> UserList(){
        List<Student> userList=new ArrayList<>();
        String query="select * from user";
        PreparedStatement preparedStatement=new DBConnection().getPreparedstatement(query);
        try {
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                Student student=new Student();
                student.setId(resultSet.getInt("id"));
                student.setFname(resultSet.getString("fname"));
                student.setUsername(resultSet.getString("username"));
                student.setPassword(resultSet.getString("password"));
                userList.add(student);

            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return userList;

    }

    //  log in ko lagi
    public Student getUser(String username,String password) {
        Student student=null;
        String query="select * from user where username=? and password=?";
        PreparedStatement preparedStatement=new DBConnection().getPreparedstatement(query);
        try {


            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                student= new Student();
                student.setId(resultSet.getInt("id"));
                student.setFname(resultSet.getString("fname"));
                student.setUsername(resultSet.getString("username"));
                student.setPassword(resultSet.getString("password"));
                System.out.println(student.getUsername() + "" + student.getPassword());

            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    return student;
    }
//login pura vayao


// value get garna ko lagi with id
    public Student getUserRow(int id){
        Student student= new Student();
        String query="select * from user where id=?";
        PreparedStatement preparedStatement = new DBConnection().getPreparedstatement(query);
        try{

            preparedStatement.setInt(1,id);
            ResultSet  resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                student.setId(resultSet.getInt("id"));
                student.setUsername(resultSet.getString("username"));
                student.setFname(resultSet.getString("fname"));
                student.setPassword(resultSet.getString("password"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
       return student;
    }





    //register ko lagi
    public void insertUser(Student student) {

        String query = "Insert into user(username,fname,password)" + "value(?,?,?)";
        PreparedStatement preparedStatement = new DBConnection().getPreparedstatement(query);
        try {
            preparedStatement.setString(1, student.getUsername());
            preparedStatement.setString(2, student.getFname());
            preparedStatement.setString(3, student.getPassword());

            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Can not insert into databas");

        }
    }
    //register pura vayo




    //value delete ko lagi
    public void Delete(int id)
    {
        String query="delete from user where id=?";
        PreparedStatement preparedStatement=new DBConnection().getPreparedstatement(query);

        try{
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        }catch (SQLException e){
            System.out.println("Can not delete into databas");

        }
    }



    //value update ko lagi
    public void Edit(int id,Student student) throws SQLException{
        String query="update user SET username=?,fname=? ,password=?"+"where id=?";
        PreparedStatement preparedStatement=new DBConnection().getPreparedstatement(query);
        preparedStatement.setString(1,student.getFname());
        preparedStatement.setString(2,student.getUsername());
        preparedStatement.setString(3,student.getPassword());
        preparedStatement.setInt(4,id);
        preparedStatement.execute();
    }


}
