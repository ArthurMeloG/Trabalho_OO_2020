package cadastro;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import dados.Categoria;


public class CadastroCategoria {

	//Criando array de Categorias
	List<Categoria> categoria = new ArrayList<Categoria>();
	
	public boolean cadastrarCategoria() {
		Categoria temp = new Categoria();
		
		temp = Exception.categoriaException();
				
		categoria.add(temp);
		
		return true;
	}
	
	public void printListaCategoria() {
		
		for(int i = 0; i < categoria.size(); i++) {
			
			JOptionPane.showMessageDialog(null, "Categorias cadastradas\n" +
					 							"Categoria: " + categoria.get(i).getDescricao() + "\n");
		}
		
	}
}
