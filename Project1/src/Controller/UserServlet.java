package Controller;

import Hashing.PasswordHashing;
import Model.Student;
import Service.UserService;
import sun.security.util.Password;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Subodh on 30/12/2021.
 */
public class UserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
   String action=request.getParameter("page");

//for login
   if(action.equalsIgnoreCase("login"))
   {
        String username=request.getParameter("username");
        String password =PasswordHashing.hashPassword(request.getParameter("password"));

       Student student= null;
       student = new UserService().getUser(username, password);


       if(student!= null){
           HttpSession session=request.getSession();
           session.setAttribute("username",student.getUsername());
           RequestDispatcher requestDispatcher=request.getRequestDispatcher("page/Dashboard.jsp");
           requestDispatcher.forward(request,response);

       }
       else{
           request.setAttribute("mes" ,"Invalid username and password");
           RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.jsp");
       }

   }

   //for home and dashboard
   if(action.equalsIgnoreCase("home")){
       RequestDispatcher requestDispatcher=request.getRequestDispatcher("page/Dashboard.jsp");
       requestDispatcher.forward(request,response);
   }

   //for new caser and add regsiter
   if(action.equalsIgnoreCase("newCase"))
   {
       RequestDispatcher requestDispatcher=request.getRequestDispatcher("page/register.jsp");
       requestDispatcher.forward(request,response);
   }

   //for regster
   if(action.equalsIgnoreCase("register"))
   {
       Student student=new Student();
       student.setUsername(request.getParameter("username"));
       student.setFname(request.getParameter("fname"));
       student.setPassword(PasswordHashing.hashPassword(request.getParameter("password")));

       new UserService().insertUser(student);
       RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.jsp");
       requestDispatcher.forward(request,response);
   }

//for logout
   if(action.equalsIgnoreCase("logout"))
   {
       HttpSession session=request.getSession();
       session.invalidate();
       //session.setAttribute("mes","Invalid username and password");
       RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.jsp");
       requestDispatcher.forward(request,response);
   }

   //delete case
   if(action.equalsIgnoreCase("deleteUser"))
   {
       int id=Integer.parseInt(request.getParameter("id"));
       UserService userService=new UserService();
       userService.Delete(id);
       List<Student> studentList=new UserService().UserList();
       request.setAttribute("userList",studentList);

       RequestDispatcher requestDispatcher=request.getRequestDispatcher("page/list_user.jsp");
       requestDispatcher.forward(request,response);
   }



   //user detail
   if(action.equalsIgnoreCase("userdetails")){
       int id=Integer.parseInt(request.getParameter("id"));
        Student student=new UserService().getUserRow(id);
        request.setAttribute("user",student);
        request.setAttribute("id",id);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("page/Userdetails.jsp");
        requestDispatcher.forward(request,response);
   }
   //it need to be check
   if(action.equalsIgnoreCase("listUser")){
       Student student=new Student();
       List<Student> studentList=new UserService().UserList();
       request.setAttribute("userList",studentList);
       request.setAttribute("user",student);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("page/list_user.jsp");
        requestDispatcher.forward(request,response);


   }

   //
   if(action.equalsIgnoreCase("editUser")){
       Student student=new Student();
       int id=Integer.parseInt(request.getParameter("id"));
       student.setFname(request.getParameter("fname"));
       student.setUsername(request.getParameter("username"));
       student.setPassword(request.getParameter("password"));
      try {
          new UserService().Edit(id,student);
      }catch (SQLException e){
          e.printStackTrace();
      }
       List<Student> studentList=new UserService().UserList();
       RequestDispatcher requestDispatcher=request.getRequestDispatcher("page/list_user.jsp");
       requestDispatcher.forward(request,response);

   }

   if(action.equalsIgnoreCase("index"))
   {
       RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.jsp");
       requestDispatcher.forward(request,response);

   }
   if(action.equalsIgnoreCase("userEdit")){
      // Student student=new Student();
       int id=Integer.parseInt(request.getParameter("id"));
       Student student=new UserService().getUserRow(id);
       request.setAttribute("id",id);
       request.setAttribute("user",student);
       List<Student> studentList=new UserService().UserList();
       RequestDispatcher requestDispatcher=request.getRequestDispatcher("page/update1.jsp");
       requestDispatcher.forward(request,response);

   }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
