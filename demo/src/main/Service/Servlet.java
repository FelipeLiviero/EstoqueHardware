import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;

@WebServlet(name = "EstoqueHardware", value = "/EstoqueHardware")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            int tipo_produto = Integer.parseInt(request.getParameter("tipo_produto"));
            String marca = request.getParameter("marca");
            int memoria = Integer.parseInt(request.getParameter("memoria"));
            int quantidade = Integer.parseInt(request.getParameter("quantidade"));
            boolean cadastrar = Boolean.parseBoolean(request.getParameter("cadastrar"));
            int confirmar_acao = Integer.parseInt(request.getParameter("confirmar_acao"));

            request.setAttribute("codigo", codigo);
            request.setAttribute("tipo_produto", tipo_produto);
            request.setAttribute("marca", marca);
            request.setAttribute("memoria", memoria);
            request.setAttribute("quantidade", quantidade);
            request.setAttribute("cadastrar", cadastrar);
            request.setAttribute("confirmar_acao", confirmar_acao);

            // Encaminha para uma página JSP (exemplo)
            request.getRequestDispatcher("resultado.jsp").forward(request, response);

        } catch (Exception e) {
            out.println("<html><body>");
            out.println("<h2>Erro: " + e.getMessage() + "</h2>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }
}