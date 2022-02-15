
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaPessoaServlet
 */
@WebServlet("/listaPessoa")
public class ListaPessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Banco bancoPessoa = new Banco();
		List<Pessoa> pessoas = bancoPessoa.listarPessoas();
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<ul>");
		for (Pessoa pessoa : pessoas) {
			out.println("<li>" + pessoa.getNome() + "</li>");
		}
		out.println("</ul>");
		out.println("</body></html>");

	}

}
