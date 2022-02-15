import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

	public void adicionaPessoa(Pessoa pessoa) {
		listaPessoas.add(pessoa);
	}
	
	public List<Pessoa> listarPessoas(){
		return listaPessoas;
	}

}
