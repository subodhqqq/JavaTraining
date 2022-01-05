package Login;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 24/12/2021.
 */
public class LoginFilter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        PrintWriter out =resp.getWriter();
        out.print("hello from filert"+"<br>");
        //Authontication kura yeha lekhane
        chain.doFilter(req, resp);//req to next resourse
        out.println("Afere filter is call");
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {

    }

}
