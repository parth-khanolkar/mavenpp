//import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class helloservlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public helloservlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Hello: ").append(request.getParameter("name"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}