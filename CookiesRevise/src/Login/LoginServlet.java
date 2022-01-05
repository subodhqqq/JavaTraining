package Login;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 23/12/2021.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("test/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("username");
        String password=request.getParameter("password");
        out.print("welcome "+name);
        if(password.equals("java"))
        {
            Cookie cookie=new Cookie("uname","123");
            response.addCookie(cookie);


            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/DashbordServlet");
            requestDispatcher.forward(request,response);
        }
        else{
            response.sendRedirect("https://www.google.com/?gws_rd=ssl");
//            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index.jsp");
//            requestDispatcher.include(request,response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
