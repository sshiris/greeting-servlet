package ssp.examples.ex12;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {
    /**
* 
*/
private static final long serialVersionUID = 1L;
 
private static int refreshingCounter;
 
@Override
public void init() throws ServletException {
super.init();
 
refreshingCounter++;
}
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
refreshingCounter++;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        if (name == null || name.isBlank()) {
            name = "Guest";
        }
        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<title>Hello Page!!!</title>");
        out.println("<link rel='stylesheet' href='style.css'>");
        out.println("</head><body>");
        out.println("<h1>Hello, " + name + "!</h1>");
        out.println("<h1>The page has been refereshed " + refreshingCounter + " times!</h1>");
        out.println("<img src='images/flower.avif' alt='Logo' width='150'>");
        out.println("</body></html>");
    }
}