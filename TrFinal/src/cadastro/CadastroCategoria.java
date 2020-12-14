package cadastro;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import dados.Categoria;
import servicos.Exception;



public class CadastroCategoria {

	//Criando array de Categorias
	static List<Categoria> categorias = new ArrayList<Categoria>();
	
	public boolean cadastrarCategoria() {
		
		
		Categoria temp = new Categoria();
		
		temp = Exception.categoriaException();
		categorias.add(temp);
		
		return true;
	}
	
	public void printListaCategoria() {
		
		for(int i = 0; i < categorias.size(); i++) {
			
			JOptionPane.showMessageDialog(null, "Categorias cadastradas\n" +
					 							"Categoria: " + categorias.get(i).getDescricao() + "\n");
		}
		
	}
	
	public boolean acharIgual(String nome) {
		for(int j = 0; j < categorias.size();j++) {
			if(nome.matches(categorias.get(j).getDescricao())==true) {
				categorias.get(j).cadastraDespesas();	
				return true;
			}
		}
		
		return false;
	}
	
	public boolean verficarIgual(String nome) {
		for(int j = 0; j < categorias.size();j++) {
			if(nome.matches(categorias.get(j).getDescricao())==true) {
				return true;
			}
		}
		
		return false;
	}

	
	public void printDesp(String nome) {
		for(int j = 0; j < categorias.size();j++) {
			if(nome.matches(categorias.get(j).getDescricao())==true) {
				categorias.get(j).printLista();				
			}
		}
	}
	
	public List<Categoria> getListas (){
		return categorias;
	}
}
