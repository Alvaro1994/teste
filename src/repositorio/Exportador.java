package repositorio;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

import br.com.casadocodigo.livraria.produtos.Produto;

public class Exportador implements Runnable{
	public void paraCSV(List<Produto> produtos) throws FileNotFoundException {
		PrintStream ps = new PrintStream("produtos.csv");
		ps.println("Nome, Descricao, Valor, ISBN");
		for (Produto produto : produtos) {
			ps.println(String.format("%s, %s, %s, %s",
					produto.getNome(),
					produto.getDescricao(),
					produto.getValor(),
					produto.getIsbn()));			
			}
		ps.close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
