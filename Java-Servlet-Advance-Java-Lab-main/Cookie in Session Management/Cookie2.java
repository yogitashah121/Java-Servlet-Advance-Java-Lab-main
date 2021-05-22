package cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie2 extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            Cookie[] c=request.getCookies();
            
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet usecookie</title>");            
            out.println("</head>");
            out.println("<body>");
            for(int i=0;i<c.length;i++){
            out.println("<h1>Cookie Name and value :"+c[i].getName()+c[i].getValue()+"</h1>");
            }
            out.println("<a href='Cookie3'>Click here</a>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            Cookie k=new Cookie("cookie2","val2");
            response.addCookie(k);
            
    }


}
