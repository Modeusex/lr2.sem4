import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "RedirectServlet", urlPatterns = {"/services", "/contact", "/feedback", "/about"})
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = request.getServletPath();
        String targetPage = request.getContextPath() + "/" + path.substring(1) + ".html";

        response.sendRedirect(targetPage);
    }
}
