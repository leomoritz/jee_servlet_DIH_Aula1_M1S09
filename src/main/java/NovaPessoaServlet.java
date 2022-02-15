
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaPessoaServlet
 */
@WebServlet("/novaPessoa")
public class NovaPessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		
		Pessoa novaPessoa = new Pessoa(nome);
		
		Banco bancoPessoa = new Banco();
		
		bancoPessoa.adicionaPessoa(novaPessoa);
		
		bancoPessoa.listarPessoas().forEach(pessoa -> System.out.println(pessoa.getNome()));
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>Pessoa " + nome + " cadastrada com sucesso!</body></html>");
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaPessoa"); 

	}

}
