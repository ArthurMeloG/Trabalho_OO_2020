package servicos;

import javax.swing.JOptionPane;

import cadastro.CadastroAluno;
import cadastro.CadastroCategoria;
import calculo.RendaIgualitaria;
import calculo.RendaProporcional;

public class Menu {
	public static int printMenu() {
		
	
		String STRopc = null;
		STRopc = (String) JOptionPane.showInputDialog(null, "Digite 1 para cadastrar um aluno \n"
				+"Digite 2 para printar os Alunos salvos \n"
				+"Digite 3 para cadastrar uma categoria \n"
				+"Digite 4 para cadastra despesas \n"
				+"Digite 5 para printar as categorias cadastradas \n"
				+"Digite 6 para printar as despesas de uma categoria \n"
				+"Digite 7 para calcular a renda igualitaria \n"
				+"Digite 8 para calcular a renda proporcional \n"
				+"Digite 9 para sair do programa", "menu" , 0, Icons.icones(1) , null, "");
		
		int opc = Integer.parseInt(STRopc);
		
		return opc;
	}

	public static void menu() {
		
		LendoArquivo la = new LendoArquivo();
		CadastroAluno ca = new CadastroAluno();
		CadastroCategoria cc = new CadastroCategoria();
		RendaIgualitaria ri = new RendaIgualitaria();
		RendaProporcional rp = new RendaProporcional();
		

		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		int menu = 0;
		
		
		la.lerAlunos();
		
		do {
			int i = printMenu();// UM PRINT DE MENU DENTRO DO LOOP PARA FICAR RODANDO
			
			switch (i) {
			
			case 1: //CADASTRA ALUNO
				
				do {
					JOptionPane.showMessageDialog(null, "Cadastrando Aluno");

					if (ca.cadastrarAluno() == true) // CHAMA O 'cadastroAluno' QUE RETORNA TRUE SE TUDO DEU CERTO
													// ESSA FUNÇÃO JA CRIA O OBJETO E ADICONA AO ARRAY
						JOptionPane.showMessageDialog(null, "Aluno cadastrado");
					else
						JOptionPane.showMessageDialog(null, "ERRO");
					
					temp1 = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro usuario?");
					
					
				} while (temp1 != 1); // LOOP DO CADASTRO ALUNO PARA CADASTRAR QUANTOS OBJETOS O USUARIO QUISER

				break;
				
			case 2: //PRINTA ALUNO
				ca.printLista(); //PRINTA OS OBJETOS NO ARRAY
				break;
				
			case 3: //CADASTRA CATEGORIA
				do {
					JOptionPane.showMessageDialog(null, "Cadastrando Categoria");

					if (cc.cadastrarCategoria() == true) 
						JOptionPane.showMessageDialog(null, "Categoria cadastrada");
					else
						JOptionPane.showMessageDialog(null, "ERRO");
					temp2 = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra categoria?");
					
					
				} while (temp2 != 1);
				break;
				
				
			case 4 : //CADASTRA DESPESA
				
				do {
					JOptionPane.showMessageDialog(null, "Cadastrando Despesa");
					String StrCat = JOptionPane.showInputDialog("Digite uma categoria ja existente");

					if (cc.acharIgual(StrCat) == true) {
						JOptionPane.showMessageDialog(null, "Despesa cadastrada com sucesso");
						temp3 = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra despesa?");
					}
				
					else{
						JOptionPane.showMessageDialog(null, "Categoria nao encotrada");
						i=3;
						temp3=1;
					}
					
					
				} while (temp3 != 1);
				break;
				
			case 5 : // printa lista de cate
				cc.printListaCategoria();
				break;
				
			case 6 : //print despesas
				JOptionPane.showMessageDialog(null, "Printando despesas");
				String despesas=JOptionPane.showInputDialog("Digite a categoria em que as despesas est�o inseridas ");
				cc.printDesp(despesas);
				break;
				
			case 7:
				JOptionPane.showMessageDialog(null,"A renda igualitaria calculada para os " + ca.getqantAluno() + " alunos é de : " + ri.rendaIgualitaria()+
						"$ para cada");
				break;
				
			case 8 :
				JOptionPane.showMessageDialog(null, "test");
				rp.calcRendaProporcional();
				break;
				
			case 9:
				menu = 9; // FECHA O ULTIMO LOOP
				break;
				
			case 190:
				printImagenss.printar();
				break;

			default:
				break;
			}
		} while (menu != 9); //LOOP DO MENU

	}

}
