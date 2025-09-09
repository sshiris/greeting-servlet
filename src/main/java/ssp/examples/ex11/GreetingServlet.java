package ssp.examples.ex11;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class GreetingServlet extends HttpServlet {
    /**
* 
*/
private static final long serialVersionUID = 1L;
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        if (name == null || name.isBlank()) {
            name = "Guest_Wulala";
        }
        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<title>Greeting Page</title>");
        out.println("<link rel='stylesheet' href='style.css'>");
        out.println("</head><body>");
        out.println("<h1>Greetings, " + name + "!</h1>");
        out.println("<p>By the way, today is " + new SimpleDateFormat("dd.MM.yy HH:mm:ss").format(new Date()) + "!</p>");
        out.println("<img src='images/flower.avif' alt='Flower' width='150'>");
        out.println("</body></html>");
    }
}